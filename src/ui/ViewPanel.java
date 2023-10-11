/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Model.User;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Ali
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private User newUser;
    public ViewPanel(User newUser) {
        initComponents();
        this.newUser = newUser;
        populatedData();
    }


   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jMainlabel3 = new javax.swing.JLabel();
        jFirstNameLablel3 = new javax.swing.JLabel();
        jLastNameLabel3 = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        jEmailLabel3 = new javax.swing.JLabel();
        jFirstNametext3 = new javax.swing.JTextField();
        jLastNameText = new javax.swing.JTextField();
        jAgeText = new javax.swing.JTextField();
        jPatientText = new javax.swing.JTextField();
        jAgeLabel4 = new javax.swing.JLabel();
        messageText = new javax.swing.JTextField();
        Pateinttypelabel = new javax.swing.JLabel();
        Genderlabel = new javax.swing.JLabel();
        messagelabel = new javax.swing.JLabel();
        jEmailText1 = new javax.swing.JTextField();
        jgenderText = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(153, 0, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jMainlabel3.setBackground(new java.awt.Color(0, 0, 0));
        jMainlabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMainlabel3.setForeground(new java.awt.Color(255, 255, 255));
        jMainlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMainlabel3.setText("Patient View Form");
        jMainlabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jFirstNameLablel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jFirstNameLablel3.setForeground(new java.awt.Color(255, 255, 255));
        jFirstNameLablel3.setText("FirstName:");

        jLastNameLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLastNameLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLastNameLabel3.setText("LastName:");

        Photo.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Photo.setForeground(new java.awt.Color(255, 255, 255));
        Photo.setText("Photo:");

        jEmailLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jEmailLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jEmailLabel3.setText("Email:");

        jFirstNametext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFirstNametext3ActionPerformed(evt);
            }
        });

        jLastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLastNameTextActionPerformed(evt);
            }
        });

        jAgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeTextActionPerformed(evt);
            }
        });

        jPatientText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPatientTextActionPerformed(evt);
            }
        });

        jAgeLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jAgeLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jAgeLabel4.setText("Age:");

        messageText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextActionPerformed(evt);
            }
        });

        Pateinttypelabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Pateinttypelabel.setForeground(new java.awt.Color(255, 255, 255));
        Pateinttypelabel.setText("Pateint Type:");

        Genderlabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        Genderlabel.setForeground(new java.awt.Color(255, 255, 255));
        Genderlabel.setText("Gender:");

        messagelabel.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        messagelabel.setForeground(new java.awt.Color(255, 255, 255));
        messagelabel.setText("Message:");

        jEmailText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmailText1ActionPerformed(evt);
            }
        });

        jgenderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgenderTextActionPerformed(evt);
            }
        });

        imageLabel.setText("imageLabel");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jMainlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jAgeLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jFirstNameLablel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFirstNametext3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(messagelabel)
                                .addGap(18, 18, 18)
                                .addComponent(messageText))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Genderlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jgenderText)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLastNameLabel3)
                                    .addComponent(jEmailLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLastNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(jEmailText1)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Pateinttypelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPatientText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Photo)
                                .addGap(36, 36, 36)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addGap(81, 81, 81))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jMainlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFirstNameLablel3)
                            .addComponent(jFirstNametext3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLastNameLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jEmailLabel3)
                            .addComponent(jAgeLabel4)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jAgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jEmailText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(messagelabel)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pateinttypelabel)
                            .addComponent(jPatientText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Genderlabel)
                        .addComponent(jgenderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Photo)
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jFirstNametext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFirstNametext3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFirstNametext3ActionPerformed

    private void jLastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLastNameTextActionPerformed

    private void jAgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeTextActionPerformed

    private void jPatientTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPatientTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPatientTextActionPerformed

    private void messageTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextActionPerformed

    private void jEmailText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmailText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEmailText1ActionPerformed

    private void jgenderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgenderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgenderTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Genderlabel;
    private javax.swing.JLabel Pateinttypelabel;
    private javax.swing.JLabel Photo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jAgeLabel4;
    private javax.swing.JTextField jAgeText;
    private javax.swing.JLabel jEmailLabel3;
    private javax.swing.JTextField jEmailText1;
    private javax.swing.JLabel jFirstNameLablel3;
    private javax.swing.JTextField jFirstNametext3;
    private javax.swing.JLabel jLastNameLabel3;
    private javax.swing.JTextField jLastNameText;
    private javax.swing.JLabel jMainlabel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jPatientText;
    private javax.swing.JTextField jgenderText;
    private javax.swing.JTextField messageText;
    private javax.swing.JLabel messagelabel;
    // End of variables declaration//GEN-END:variables

    private void populatedData() {
         //To change body of generated methods, choose Tools | Templates.
         jFirstNametext3.setText(this.newUser.getFirst_name());
         jLastNameText.setText(this.newUser.getLast_name());
         jEmailText1.setText(this.newUser.getEmail());
         jAgeText.setText(this.newUser.getAge());
         messageText.setText(this.newUser.getMessage());
         jgenderText.setText(this.newUser.getGender());
         jPatientText.setText(this.newUser.getPatient_Type());
         imageLabel.setIcon(this.newUser.getPhoto());
    }
}
