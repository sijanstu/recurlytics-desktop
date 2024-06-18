package com.sijanstu.recurlytics;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.sijanstu.recurlytics.components.*;
import com.sijanstu.recurlytics.components.auth.JwtResponse;
import com.sijanstu.recurlytics.components.auth.Login;
import com.sijanstu.recurlytics.components.dashboard.Dashboard;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Application extends JFrame {

    @Getter
    @Setter
    private static JwtResponse jwtResponse;
    public static final Logger logger = Logger.getGlobal();

    public Application() throws IOException {
        init();
        FileHandler fh = new FileHandler("logs.log");
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        fh.setLevel(java.util.logging.Level.ALL);
        fh.setEncoding("UTF-8");
        fh.setFormatter(formatter);
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);
        logger.info("------------------Application Started At: " + new Date() + "------------------");
        Notifications.getInstance().setJFrame(this);
        GlassPanePopup.install(this);
        addComponentListener(new ComponentAdapter() {
            Robot robot;

            @Override
            public void componentResized(ComponentEvent e) {
                try {
                    revalidate();
                    repaint();

                    if (robot == null) {
                        robot = new Robot();
                    }
                    Rectangle bounds = getBounds();
                    Dimension minSize = getPreferredSize();
                    if (bounds.width < minSize.width || bounds.height < minSize.height) {
                        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        int w = Math.max(minSize.width, bounds.width);
                        int h = Math.max(minSize.height, bounds.height);
                        setBounds(new Rectangle(bounds.x, bounds.y, w, h));
                    }
                } catch (AWTException ex) {
                    logger.log(Level.SEVERE, ex.getMessage());
                }
            }
        });
        addWindowFocusListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                toFront();
            }
        });
    }

    private void init() {
        setTitle("Recurlytics");
        setIconImage(new ImageIcon(new ImageIcon(Objects.requireNonNull(Login.class.getResource("/assets/logo.png"))).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH)).getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //desktop size
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        setSize(width / 2, (height / 2) + 200);
        setLocationRelativeTo(null);
        setContentPane(new JScrollPane(new Login()));
        FormsManager.getInstance().initApplication(this);
        Notifications.getInstance().setJFrame(this);
        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_RIGHT, 2000, "Welcome to Recurlytics");
    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("sijanstu.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
        EventQueue.invokeLater(() -> {
            try {
                new Application().setVisible(true);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error loading application", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        FormsManager.getInstance().showForm(new Dashboard());
    }
}
