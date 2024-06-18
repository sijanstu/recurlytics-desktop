package com.sijanstu.recurlytics.components;

import com.formdev.flatlaf.extras.FlatAnimatedLafChange;

import com.sijanstu.recurlytics.Application;
import com.sijanstu.recurlytics.components.auth.Login;
import com.sijanstu.recurlytics.components.auth.Register;

import javax.swing.*;
import java.awt.*;

public class FormsManager {
    private Application application;
    private static FormsManager instance;

    public static FormsManager getInstance() {
        if (instance == null) {
            instance = new FormsManager();
        }
        return instance;
    }

    private FormsManager() {

    }


    public void initApplication(Application application) {
        this.application = application;
    }

    public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            //clean up unused memory
            System.gc();
            FlatAnimatedLafChange.showSnapshot();
            if (form instanceof Login || form instanceof Register) {
                application.setContentPane(new JScrollPane(form));
            } else {
                application.setContentPane(form);
                application.setLocationRelativeTo(null);
                application.setMinimumSize(form.getMinimumSize());
                application.setSize(form.getMinimumSize());
            }
            application.revalidate();
            application.repaint();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        });
    }

    public void logout() {
        application.dispose();
        application = null;
//        Application.main(null);
    }

    public JFrame getFrame() {
        return application;
    }
}

