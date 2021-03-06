/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab9.exercise3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Sergiu
 */
public class SafeHomeUI extends JFrame {
    
    JLabel wrongPinLabel = null;
    JLabel masterKeyLabel = null;
    JButton tryAgainButton = null;
    JDialog wrongPinDialog = null;
    private int  numberOfWrongPins=0;
    Door door = new Door();
    DoorLockController doorLockController = new DoorLockController();
    /**
     * Creates new form SafeHomeUI
     */
    public SafeHomeUI() throws Exception {
        initComponents();
        setTitle("Safe home access");
        setVisible(true);
        getContentPane().setLayout(null);
        doorLockController.addTenant("1111","User1");
        doorLockController.addTenant("2222","User2");
        setLocationRelativeTo(null);
        setResizable(false);
        jTextField2.setText("Locked");
    }
    
     public void InitializeDialogForMasterKey() {

        //Initialize wrong pin dialog box

        this.wrongPinDialog = new JDialog();
        this.wrongPinDialog.setSize(200,150);
        this.wrongPinDialog.getContentPane().setLayout(null);
        this.wrongPinDialog.setLocationRelativeTo(null);
        this.wrongPinDialog.setVisible(true);

        //Initialize master key label for dialog box

        this.masterKeyLabel = new JLabel("Enter the master key!");
        this.masterKeyLabel.setBounds(30,5,150,35);
        this.masterKeyLabel.setVisible(true);
        this.wrongPinDialog.add(masterKeyLabel);
        this.wrongPinDialog.add(tryAgainButton);
    }
     
     public void InitializeDialogForWrongPin(){

        //Initialize wrong pin dialog box

        this.wrongPinDialog = new JDialog();
        this.wrongPinDialog.setSize(200,150);
        this.wrongPinDialog.getContentPane().setLayout(null);
        this.wrongPinDialog.setLocationRelativeTo(null);
        this.wrongPinDialog.setVisible(true);

        //Initialize wrong pin label for dialog box

        this.wrongPinLabel = new JLabel("Wrong pin!");
        this.wrongPinLabel.setBounds(55,5,100,25);
        this.wrongPinLabel.setVisible(true);
        wrongPinDialog.add(wrongPinLabel);

        //Initialize try again button

        this.tryAgainButton = new JButton("Try again");
        this.tryAgainButton.setBounds(40,35,100,25);
        this.tryAgainButton.setVisible(true);
        this.wrongPinDialog.add(tryAgainButton);
        tryAgainButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                wrongPinDialog.setVisible(false);
                    jTextField1.setText("");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Type access code:");

        jButton1.setText("Enter code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Door status :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jButton1){
            try {
                doorLockController.enterPin(jTextField1.getText());
                numberOfWrongPins=0;
            } catch (Exception ex) {
                numberOfWrongPins++;
               if(numberOfWrongPins<3) {
                   InitializeDialogForWrongPin();
               }
               else {
                    InitializeDialogForMasterKey();
               }
               ex.printStackTrace();
           }
            if(doorLockController.getDoor().getStatus().equals(DoorStatus.OPEN)){
                jTextField2.setText("Unlocked");
            }else{
                jTextField2.setText("Locked");
 
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SafeHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SafeHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SafeHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SafeHomeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SafeHomeUI().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SafeHomeUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
