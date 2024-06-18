package com.sijanstu.recurlytics.components;


import lombok.Getter;

import javax.swing.JPanel;

/**
 * @author sijanstu
 */
@Getter
public class CrazyPanel extends JPanel {

    public void setFlatLafStyleComponent(FlatLafStyleComponent flatLafStyleComponent) {
        this.flatLafStyleComponent = flatLafStyleComponent;
        installStyleComponents();
    }

    public void setMigLayoutConstraints(MigLayoutConstraints migLayoutConstraints) {
        this.migLayoutConstraints = migLayoutConstraints;
        installLayoutConstraints();
    }

    private FlatLafStyleComponent flatLafStyleComponent;
    private MigLayoutConstraints migLayoutConstraints;
    private MigLayoutCustom migLayout;

    public CrazyPanel() {
        init();
    }

    private void init() {
        migLayoutConstraints = new MigLayoutConstraints("", "", "", new String[]{});
        migLayout = new MigLayoutCustom();
        migLayout.setMigLayoutConstraints(migLayoutConstraints);
        setLayout(migLayout);
    }

    private void installLayoutConstraints() {
        migLayout.setMigLayoutConstraints(migLayoutConstraints);
    }

    public void installStyleComponents() {
        putClientProperty("FlatLaf.style", flatLafStyleComponent.getOwnStyle());
        migLayout.setFlatLafStyleComponent(flatLafStyleComponent);
    }
}
