/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import login.LoginHandler;

/**
 *
 * @author patrick
 */
public class LoginDIA extends javax.swing.JDialog {

    private LoginHandler loginHandler;

    public LoginDIA(java.awt.Frame parent, boolean modal, LoginHandler loginHandler) {
        super(parent, modal);
        initComponents();
        this.loginHandler = loginHandler;
    }

    private void clean() {
        email_TextField.setText("");
        password_TextField.setText("");
    }
    
    private void login() {
        if (!email_TextField.getText().isEmpty() && !password_TextField.getText().isEmpty()) {
            if (loginHandler.checkUser(email_TextField.getText(), password_TextField.getText())) {
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Email eller kode er forkert", "Fejl", JOptionPane.ERROR_MESSAGE);
                password_TextField.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Alle felter skal udfyldes", "Fejl", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_Pane = new javax.swing.JPanel();
        title_Pane = new javax.swing.JPanel();
        title_Label = new javax.swing.JLabel();
        login_Pane = new javax.swing.JPanel();
        emailInfo_Label = new javax.swing.JLabel();
        passwordInfo_Label = new javax.swing.JLabel();
        email_TextField = new javax.swing.JTextField();
        close_Button = new javax.swing.JButton();
        login_Button = new javax.swing.JButton();
        password_TextField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        main_Pane.setBackground(new java.awt.Color(51, 51, 51));

        title_Label.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title_Label.setText("Den våde Høne");

        javax.swing.GroupLayout title_PaneLayout = new javax.swing.GroupLayout(title_Pane);
        title_Pane.setLayout(title_PaneLayout);
        title_PaneLayout.setHorizontalGroup(
            title_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        title_PaneLayout.setVerticalGroup(
            title_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(title_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        emailInfo_Label.setText("E-mail:");

        passwordInfo_Label.setText("Kode:");

        email_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_TextFieldActionPerformed(evt);
            }
        });

        close_Button.setText("Luk");
        close_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_ButtonActionPerformed(evt);
            }
        });

        login_Button.setText("Login");
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });

        password_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_PaneLayout = new javax.swing.GroupLayout(login_Pane);
        login_Pane.setLayout(login_PaneLayout);
        login_PaneLayout.setHorizontalGroup(
            login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login_PaneLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(login_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close_Button))
                    .addGroup(login_PaneLayout.createSequentialGroup()
                        .addGroup(login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordInfo_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailInfo_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(login_PaneLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(email_TextField))
                            .addGroup(login_PaneLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(password_TextField)))))
                .addContainerGap())
        );
        login_PaneLayout.setVerticalGroup(
            login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailInfo_Label)
                    .addComponent(email_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordInfo_Label)
                    .addComponent(password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(login_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close_Button)
                    .addComponent(login_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout main_PaneLayout = new javax.swing.GroupLayout(main_Pane);
        main_Pane.setLayout(main_PaneLayout);
        main_PaneLayout.setHorizontalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_Pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_PaneLayout.setVerticalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void email_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_TextFieldActionPerformed
        login();
    }//GEN-LAST:event_email_TextFieldActionPerformed

    private void close_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close_ButtonActionPerformed

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ButtonActionPerformed
        login();
    }//GEN-LAST:event_login_ButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        clean();
    }//GEN-LAST:event_formWindowClosed

    private void password_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_TextFieldActionPerformed
        login();
    }//GEN-LAST:event_password_TextFieldActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                LoginDIA dialog = new LoginDIA(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close_Button;
    private javax.swing.JLabel emailInfo_Label;
    private javax.swing.JTextField email_TextField;
    private javax.swing.JButton login_Button;
    private javax.swing.JPanel login_Pane;
    private javax.swing.JPanel main_Pane;
    private javax.swing.JLabel passwordInfo_Label;
    private javax.swing.JPasswordField password_TextField;
    private javax.swing.JLabel title_Label;
    private javax.swing.JPanel title_Pane;
    // End of variables declaration//GEN-END:variables
}
