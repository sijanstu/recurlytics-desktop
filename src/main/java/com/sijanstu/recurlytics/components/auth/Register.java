package com.sijanstu.recurlytics.components.auth;


import com.formdev.flatlaf.FlatClientProperties;
import com.sijanstu.recurlytics.components.FormsManager;
import com.sijanstu.recurlytics.components.Gender;
import com.sijanstu.recurlytics.components.Notifications;
import com.sijanstu.recurlytics.components.PasswordStrengthStatus;
import com.sijanstu.recurlytics.services.LoginService;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Register extends JPanel {
    private static final String WELCOME = "Welcome to Recurlytics.";
    private static final String CREATE_ACCOUNT = "Create your account to get started.";
    private static final String FULL_NAME = "Full Name";
    private static final String NETWORK_ERROR = "Network error, please try again later.";
    private static final String EMPTY_FIELDS = "Please fill all the fields.";
    private static final String INVALID_EMAIL = "Invalid email.";
    private static final String PASSWORD_LENGTH_ERROR = "Password must be at least 8 characters.";
    private static final String PASSWORD_MISMATCH = "Password doesn't match.";

    public Register() {
        init();
    }

    private void init() {
        setLayout(new MigLayout("fill,insets 20", "[center]", "[center]"));
        txtFirstName = new JTextField();
        txtLastName = new JTextField();
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();
        txtConfirmPassword = new JPasswordField();
        cmdRegister = new JButton("Sign Up");
        passwordStrengthStatus = new PasswordStrengthStatus();
        JPanel panel = new JPanel(new MigLayout("wrap,fillx,insets 35 45 30 45", "[fill,360]"));
        panel.putClientProperty(FlatClientProperties.STYLE, "arc:20;" + "[light]background:darken(@background,3%);" + "[dark]background:lighten(@background,3%)");
        panel.putClientProperty(FlatClientProperties.SCROLL_BAR_SHOW_BUTTONS, true);
        txtFirstName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "First name");
        txtLastName.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Last name");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your email");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");
        txtConfirmPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Re-enter your password");
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        txtConfirmPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        cmdRegister.putClientProperty(FlatClientProperties.STYLE, "[light]background:darken(@background,10%);" + "[dark]background:lighten(@background,10%);" + "borderWidth:0;" + "focusWidth:0;" + "innerFocusWidth:0");
        cmdRegister.addActionListener(e -> registerUser());
        JLabel lbTitle = new JLabel(WELCOME);
        JLabel description = new JLabel(CREATE_ACCOUNT);
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "font:bold +10");
        description.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" + "[dark]foreground:darken(@foreground,30%)");
        passwordStrengthStatus.initPasswordField(txtPassword);
        Login.initPanel(panel);
        panel.add(lbTitle);
        panel.add(description);

        panel.add(new JLabel(FULL_NAME), "gapy 10");
        panel.add(txtFirstName, "split 2");
        panel.add(txtLastName);
        panel.add(new JLabel("Gender"), "gapy 8");
        panel.add(createGenderPanel());
        panel.add(new JSeparator(), "gapy 5 5");
        panel.add(new JLabel("Email"));
        panel.add(txtUsername);
        panel.add(new JLabel("Password"), "gapy 8");
        panel.add(txtPassword);
        panel.add(passwordStrengthStatus, "gapy 0");
        panel.add(new JLabel("Confirm Password"), "gapy 0");
        panel.add(txtConfirmPassword);
        JCheckBox agree = new JCheckBox("I agree to the terms and conditions");
        agree.addActionListener(e -> {
            JScrollBar vertical = ((JScrollPane) getParent().getParent()).getVerticalScrollBar();
            vertical.setValue(vertical.getMaximum());
        });
        agree.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" + "[dark]foreground:darken(@foreground,30%)");
        panel.add(agree, "gapy 10");
        panel.add(new JLabel("you agree that you're responsible for all activity that occurs under your account."), "gapy 10");
        panel.add(cmdRegister, "gapy 20");
        panel.add(createLoginLabel(), "gapy 10");
        panel.add(new JSeparator(), "gapy 5 5");
        panel.add(new JLabel("By clicking Sign Up, you agree to our Terms, Data Policy and Cookies Policy."), "gapy 10");
        panel.add(new JLabel("You can contact us through Website."), "gapy 10");
        add(panel);

    }

    private void registerUser() {
        new Thread(() -> {
            LoginService loginService = new LoginService();
            cmdRegister.setEnabled(false);
            try {
                RegisterUser registerUser = RegisterUser.builder().firstName(txtFirstName.getText()).lastName(txtLastName.getText()).username(txtUsername.getText()).password(txtPassword.getText()).build();
                if (jrMale.isSelected()) registerUser.setGender(Gender.MALE);
                else registerUser.setGender(jrFemale.isSelected() ? Gender.FEMALE : Gender.OTHER);
                if (registerUser.getFirstName().isEmpty() || registerUser.getLastName().isEmpty() || registerUser.getUsername().isEmpty() || registerUser.getPassword().isEmpty()) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, EMPTY_FIELDS);
                } else if (!registerUser.getUsername().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, INVALID_EMAIL);
                } else if (registerUser.getPassword().length() < 8) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, PASSWORD_LENGTH_ERROR);
                } else if (!Objects.equals(txtPassword.getText(), txtConfirmPassword.getText())) {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, PASSWORD_MISMATCH);
                } else {
                    loginService.register(registerUser);
                    loginService.setUsername(registerUser.getUsername());
                }
            } catch (Exception exception) {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, exception.getMessage());
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.BOTTOM_RIGHT, 2000, NETWORK_ERROR);
            }
            cmdRegister.setEnabled(true);
        }).start();
    }

    private Component createGenderPanel() {
        JPanel panel = new JPanel(new MigLayout("insets 0"));
        panel.putClientProperty(FlatClientProperties.STYLE, "background:null");
        jrMale = new JRadioButton("Male");
        jrFemale = new JRadioButton("Female");
        jrOthers = new JRadioButton("Others");
        groupGender = new ButtonGroup();
        groupGender.add(jrMale);
        groupGender.add(jrFemale);
        groupGender.add(jrOthers);
        jrMale.setSelected(true);
        panel.add(jrMale);
        panel.add(jrFemale);
        panel.add(jrOthers);
        return panel;
    }

    private Component createLoginLabel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.putClientProperty(FlatClientProperties.STYLE, "background:null");
        JButton cmdLogin = new JButton("<html><a href=\"#\">Sign in here</a></html>");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, "border:3,3,3,3");
        cmdLogin.setContentAreaFilled(false);
        cmdLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdLogin.addActionListener(e -> {
            FormsManager.getInstance().showForm(new Login());
        });
        JLabel label = new JLabel("Already have an account ?");
        label.putClientProperty(FlatClientProperties.STYLE, "[light]foreground:lighten(@foreground,30%);" + "[dark]foreground:darken(@foreground,30%)");
        panel.add(label);
        panel.add(cmdLogin);
        return panel;
    }

    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JRadioButton jrMale;
    private JRadioButton jrFemale;
    private JRadioButton jrOthers;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtConfirmPassword;
    private ButtonGroup groupGender;
    private JButton cmdRegister;
    private PasswordStrengthStatus passwordStrengthStatus;
}
