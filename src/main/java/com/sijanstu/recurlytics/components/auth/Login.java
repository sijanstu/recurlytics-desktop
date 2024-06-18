package com.sijanstu.recurlytics.components.auth;


import com.formdev.flatlaf.FlatClientProperties;
import com.sijanstu.recurlytics.components.FormsManager;
import com.sijanstu.recurlytics.components.Notifications;
import com.sijanstu.recurlytics.services.LoginService;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Login extends JPanel {

    public Login() {
        init();
        switchFocusIfRemembered();
    }

    private void init() {
        LoginService loginService = new LoginService();
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtUsername = new JTextField(loginService.getUsername());
        txtPassword = new JPasswordField();
        chRememberMe = new JCheckBox("Remember me");
        cmdLogin = new JButton("Login");
        cmdLogin.addActionListener(e -> new Thread(() -> {
            cmdLogin.setEnabled(false);
            cmdLogin.setText("Logging in...");
            try {
                LoginUser loginUser = LoginUser.builder().username(txtUsername.getText()).password(txtPassword.getText()).build();
                if (loginUser.getUsername().isEmpty() && loginUser.getPassword().isEmpty()) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, "Please enter your id and password");
                } else if (loginUser.getUsername().isEmpty()) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, "Please enter your id or email");
                } else if (loginUser.getPassword().isEmpty()) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, "Please enter your password");
                } else {
                    loginService.login(loginUser);
                    loginService.setUsername(loginUser.getUsername());
//                        Dashboard dashboard = new Dashboard();
//                        FormsManager.getInstance().showForm(dashboard);
//                        dashboard.liveIndex();
//                        dashboard.getLiveWidget1().update();
//                        dashboard.getLiveStatus1().refresh();
//                        dashboard.getTimePanel1().showTime();
                }
            } catch (Exception exception) {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, exception.getMessage());
            }
            cmdLogin.setEnabled(true);
            cmdLogin.setText("Login");
        }).start());
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "[fill,360]"));
        panel.putClientProperty(FlatClientProperties.STYLE, "arc:20;" + "[light]background:darken(@background,3%);" + "[dark]background:lighten(@background,3%)");
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, "[light]background:darken(@background,10%);" + "[dark]background:lighten(@background,10%);" + "borderWidth:0;" + "focusWidth:0;" + "innerFocusWidth:0");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username or email");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");
        initPanel(panel);
        JLabel lbTitle = new JLabel("Welcome back!");
        JLabel description = new JLabel("Please sign in to access your account");
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "font:bold +10");
        description.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" + "[dark]foreground:darken(@foreground,30%)");
        panel.add(lbTitle, "gapx 5");
        panel.add(description);
        panel.add(new JLabel("Email"), "gapy 8");
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        txtPassword.addActionListener(e -> {
            cmdLogin.doClick();
        });
//        panel.add(chRememberMe, "grow 0");
        panel.add(cmdLogin, "gapy 10");
        panel.add(createSignupLabel(), "gapy 10");

        add(panel);

    }

    static void initPanel(JPanel panel) {
        JLabel logo = new JLabel("Recurlytics");
        ImageIcon imageIcon = new ImageIcon(Objects.requireNonNull(Login.class.getResource("/assets/logo.png")));
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        logo.setIcon(imageIcon);
        logo.putClientProperty(FlatClientProperties.STYLE, "font:bold +10");
        logo.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        panel.add(logo, "span 2,center,gapy 10,wrap");
    }

    private Component createSignupLabel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, "background:null");
        JButton cmdRegister = new JButton("<html><a href=\"#\">Sign up</a></html>");
        cmdRegister.putClientProperty(FlatClientProperties.STYLE, "border:3,3,3,3");
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdRegister.addActionListener(e -> {
            FormsManager.getInstance().showForm(new Register());
        });
        JLabel label = new JLabel("Don't have an account ?");
        label.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" + "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);

        panel.add(cmdRegister);

        return panel;
    }

    private void switchFocusIfRemembered() {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                if (!txtUsername.getText().isEmpty()) {
                    txtPassword.requestFocus();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }


    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox chRememberMe;
    private JButton cmdLogin;

}
