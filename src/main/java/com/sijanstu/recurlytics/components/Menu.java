package com.sijanstu.recurlytics.components;

import com.sijanstu.recurlytics.components.dashboard.Dashboard;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Menu extends javax.swing.JPanel {
    private Dashboard dash;
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        m1 = new javax.swing.JButton();
        ms1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        m2 = new javax.swing.JButton();
        ms2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        m3 = new javax.swing.JButton();
        ms3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        m4 = new javax.swing.JButton();
        ms4 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        m5 = new javax.swing.JButton();
        ms5 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        m6 = new javax.swing.JButton();
        ms6 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        m1.setBackground(new java.awt.Color(0, 0, 0));
        m1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        m1.setForeground(new java.awt.Color(0, 204, 255));
        m1.setText("Dashboard");
        m1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        m1.setFocusPainted(false);
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        ms1.setBackground(new java.awt.Color(0, 204, 255));
        ms1.setForeground(new java.awt.Color(51, 51, 51));
        ms1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ms1.setAlignmentX(5.0F);
        ms1.setAlignmentY(5.0F);
        ms1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ms1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ms1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(m1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ms1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        m2.setBackground(new java.awt.Color(51, 51, 51));
        m2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        m2.setText("Users");
        m2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        m2.setFocusPainted(false);
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        ms2.setBackground(new java.awt.Color(51, 51, 51));
        ms2.setForeground(new java.awt.Color(51, 51, 51));
        ms2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ms2.setAlignmentX(5.0F);
        ms2.setAlignmentY(5.0F);
        ms2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ms2.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ms2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ms2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        m3.setBackground(new java.awt.Color(51, 51, 51));
        m3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        m3.setText("Integrations");
        m3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        m3.setFocusPainted(false);
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        ms3.setBackground(new java.awt.Color(51, 51, 51));
        ms3.setForeground(new java.awt.Color(51, 51, 51));
        ms3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ms3.setAlignmentX(5.0F);
        ms3.setAlignmentY(5.0F);
        ms3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ms3.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ms3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ms3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        m4.setBackground(new java.awt.Color(51, 51, 51));
        m4.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        m4.setText("Settings");
        m4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        m4.setFocusPainted(false);
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });

        ms4.setBackground(new java.awt.Color(51, 51, 51));
        ms4.setForeground(new java.awt.Color(51, 51, 51));
        ms4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ms4.setAlignmentX(5.0F);
        ms4.setAlignmentY(5.0F);
        ms4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ms4.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ms4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ms4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        m5.setBackground(new java.awt.Color(51, 51, 51));
        m5.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        m5.setText("Profile");
        m5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        m5.setFocusPainted(false);
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });

        ms5.setBackground(new java.awt.Color(51, 51, 51));
        ms5.setForeground(new java.awt.Color(51, 51, 51));
        ms5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ms5.setAlignmentX(5.0F);
        ms5.setAlignmentY(5.0F);
        ms5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ms5.setOpaque(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ms5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ms5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        m6.setBackground(new java.awt.Color(51, 51, 51));
        m6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        m6.setText("Logout");
        m6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        m6.setFocusPainted(false);
        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });

        ms6.setBackground(new java.awt.Color(51, 51, 51));
        ms6.setForeground(new java.awt.Color(51, 51, 51));
        ms6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        ms6.setAlignmentX(5.0F);
        ms6.setAlignmentY(5.0F);
        ms6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ms6.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ms6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(ms6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel9.setPreferredSize(new java.awt.Dimension(195, 47));

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Project 1", "Project 2", "Project 3" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("New Project");
        jButton1.setFocusPainted(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        changeMenu(m1, ms1);
        dash.changePanel(1);
    }//GEN-LAST:event_m1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        changeMenu(m2, ms2);
        dash.changePanel(2);
    }//GEN-LAST:event_m2ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        changeMenu(m4, ms4);
        dash.changePanel(4);
    }//GEN-LAST:event_m4ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        changeMenu(m3, ms3);
        dash.changePanel(3);
    }//GEN-LAST:event_m3ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        changeMenu(m5, ms5);
        dash.changePanel(5);
    }//GEN-LAST:event_m5ActionPerformed

    private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
        changeMenu(m6, ms6);
        dash.changePanel(6);
    }//GEN-LAST:event_m6ActionPerformed

    private void changeMenu(JButton menuItem, JSeparator ms) {
        resetStyle(m1, ms1);
        resetStyle(m2, ms2);
        resetStyle(m3, ms3);
        resetStyle(m4, ms4);
        resetStyle(m5, ms5);
        resetStyle(m6, ms6);
        menuItem.setBackground(new java.awt.Color(0, 0, 0));
        menuItem.setForeground(new java.awt.Color(0, 204, 255));
        menuItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        ms.setBackground(new java.awt.Color(0, 204, 255));
        ms.setForeground(new java.awt.Color(51, 51, 51));
    }

    private void resetStyle(JButton menuItem, JSeparator ms) {
        menuItem.setBackground(new java.awt.Color(51, 51, 51));
        menuItem.setForeground(new java.awt.Color(255, 255, 255));
        menuItem.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ms.setBackground(new java.awt.Color(51, 51, 51));
        ms.setForeground(new java.awt.Color(51, 51, 51));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton m1;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JSeparator ms1;
    private javax.swing.JSeparator ms2;
    private javax.swing.JSeparator ms3;
    private javax.swing.JSeparator ms4;
    private javax.swing.JSeparator ms5;
    private javax.swing.JSeparator ms6;
    // End of variables declaration//GEN-END:variables

    public void setParent(Dashboard dash) {
        this.dash=dash;
    }
}
