/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;

/**
 *
 * @author pkann
 */
public class OpretPersonGUI extends javax.swing.JDialog {

    /**
     * Creates new form OpretPersonGUI
     */
    public OpretPersonGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void reset() {
        navn_TextField.setText("Navn");
        navn_TextField.setForeground(Color.gray);
        adresse_TextField.setText("Adresse");
        adresse_TextField.setForeground(Color.gray);
        fodselsdag_TextField.setText("Fødselsdags dato");
        fodselsdag_TextField.setForeground(Color.gray);
        hone_CheckBox.getModel().setSelected(false);
        
        
        setLocationRelativeTo(null);
    }
    
    private void checkButton() {
        if(hone_CheckBox.getModel().isSelected() && !navn_TextField.getText().equalsIgnoreCase("navn") && !adresse_TextField.getText().equalsIgnoreCase("adresse") && !fodselsdag_TextField.getText().equalsIgnoreCase("fødselsdags dato")) {
            opret_Button.setEnabled(true);
        } else {
            opret_Button.setEnabled(false);
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
        info_Pane = new javax.swing.JPanel();
        navn_TextField = new javax.swing.JTextField();
        adresse_TextField = new javax.swing.JTextField();
        fodselsdag_TextField = new javax.swing.JTextField();
        tool_Pane = new javax.swing.JPanel();
        opret_Button = new javax.swing.JButton();
        annuller_Button = new javax.swing.JButton();
        hone_CheckBox = new javax.swing.JCheckBox();
        picture_Pane = new javax.swing.JPanel();
        billed_Pane = new javax.swing.JPanel();
        text1_Label = new javax.swing.JLabel();
        text2_Label = new javax.swing.JLabel();
        upload_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opret person");
        setMaximumSize(new java.awt.Dimension(601, 380));
        setMinimumSize(new java.awt.Dimension(601, 380));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        main_Pane.setBackground(javax.swing.UIManager.getDefaults().getColor("TabbedPane.foreground"));

        navn_TextField.setForeground(java.awt.Color.gray);
        navn_TextField.setText("Navn");
        navn_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                navn_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                navn_TextFieldFocusLost(evt);
            }
        });
        navn_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                navn_TextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                navn_TextFieldKeyTyped(evt);
            }
        });

        adresse_TextField.setForeground(java.awt.Color.gray);
        adresse_TextField.setText("Adresse");
        adresse_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                adresse_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                adresse_TextFieldFocusLost(evt);
            }
        });
        adresse_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adresse_TextFieldKeyReleased(evt);
            }
        });

        fodselsdag_TextField.setForeground(java.awt.Color.gray);
        fodselsdag_TextField.setText("Fødselsdags dato");
        fodselsdag_TextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fodselsdag_TextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fodselsdag_TextFieldFocusLost(evt);
            }
        });
        fodselsdag_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fodselsdag_TextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout info_PaneLayout = new javax.swing.GroupLayout(info_Pane);
        info_Pane.setLayout(info_PaneLayout);
        info_PaneLayout.setHorizontalGroup(
            info_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(info_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navn_TextField)
                    .addComponent(adresse_TextField)
                    .addComponent(fodselsdag_TextField))
                .addContainerGap())
        );
        info_PaneLayout.setVerticalGroup(
            info_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(navn_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresse_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fodselsdag_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        opret_Button.setText("Opret");
        opret_Button.setEnabled(false);

        annuller_Button.setText("Annuller");
        annuller_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annuller_ButtonActionPerformed(evt);
            }
        });

        hone_CheckBox.setText("Høne");
        hone_CheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                hone_CheckBoxStateChanged(evt);
            }
        });
        hone_CheckBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                hone_CheckBoxPropertyChange(evt);
            }
        });
        hone_CheckBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hone_CheckBoxKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout tool_PaneLayout = new javax.swing.GroupLayout(tool_Pane);
        tool_Pane.setLayout(tool_PaneLayout);
        tool_PaneLayout.setHorizontalGroup(
            tool_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tool_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hone_CheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(annuller_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opret_Button)
                .addContainerGap())
        );
        tool_PaneLayout.setVerticalGroup(
            tool_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tool_PaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tool_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opret_Button)
                    .addComponent(annuller_Button)
                    .addComponent(hone_CheckBox))
                .addContainerGap())
        );

        billed_Pane.setBackground(new java.awt.Color(204, 204, 204));
        billed_Pane.setMinimumSize(new java.awt.Dimension(150, 170));
        billed_Pane.setPreferredSize(new java.awt.Dimension(150, 170));

        javax.swing.GroupLayout billed_PaneLayout = new javax.swing.GroupLayout(billed_Pane);
        billed_Pane.setLayout(billed_PaneLayout);
        billed_PaneLayout.setHorizontalGroup(
            billed_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        billed_PaneLayout.setVerticalGroup(
            billed_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        text1_Label.setText("Billedet skal være 150 x 170");

        text2_Label.setText("ellers kan det blive forstrukket");

        upload_Button.setText("Upload billed");

        javax.swing.GroupLayout picture_PaneLayout = new javax.swing.GroupLayout(picture_Pane);
        picture_Pane.setLayout(picture_PaneLayout);
        picture_PaneLayout.setHorizontalGroup(
            picture_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picture_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(billed_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(picture_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text1_Label)
                    .addComponent(text2_Label)
                    .addComponent(upload_Button))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        picture_PaneLayout.setVerticalGroup(
            picture_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(picture_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(picture_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(picture_PaneLayout.createSequentialGroup()
                        .addComponent(text1_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text2_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(upload_Button))
                    .addComponent(billed_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout main_PaneLayout = new javax.swing.GroupLayout(main_Pane);
        main_Pane.setLayout(main_PaneLayout);
        main_PaneLayout.setHorizontalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(picture_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(info_Pane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tool_Pane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_PaneLayout.setVerticalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(info_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(picture_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tool_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        reset();
    }//GEN-LAST:event_formWindowClosed

    private void navn_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_navn_TextFieldFocusGained
        if(navn_TextField.getText().equalsIgnoreCase("navn")) {
            navn_TextField.setText("");
            navn_TextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_navn_TextFieldFocusGained

    private void navn_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_navn_TextFieldFocusLost
        if(navn_TextField.getText().isEmpty()) {
            navn_TextField.setText("Navn");
            navn_TextField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_navn_TextFieldFocusLost

    private void adresse_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adresse_TextFieldFocusGained
        if(adresse_TextField.getText().equalsIgnoreCase("adresse")) {
            adresse_TextField.setText("");
            adresse_TextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_adresse_TextFieldFocusGained

    private void adresse_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adresse_TextFieldFocusLost
        if(adresse_TextField.getText().isEmpty()) {
            adresse_TextField.setText("Adresse");
            adresse_TextField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_adresse_TextFieldFocusLost

    private void fodselsdag_TextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fodselsdag_TextFieldFocusGained
        if(fodselsdag_TextField.getText().equalsIgnoreCase("fødselsdags dato")) {
            fodselsdag_TextField.setText("");
            fodselsdag_TextField.setForeground(Color.black);
        }
    }//GEN-LAST:event_fodselsdag_TextFieldFocusGained

    private void fodselsdag_TextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fodselsdag_TextFieldFocusLost
        if(fodselsdag_TextField.getText().isEmpty()) {
            fodselsdag_TextField.setText("Fødselsdags dato");
            fodselsdag_TextField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_fodselsdag_TextFieldFocusLost

    private void annuller_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annuller_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_annuller_ButtonActionPerformed

    private void navn_TextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_navn_TextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_navn_TextFieldKeyTyped

    private void navn_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_navn_TextFieldKeyReleased
        checkButton();
    }//GEN-LAST:event_navn_TextFieldKeyReleased

    private void adresse_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adresse_TextFieldKeyReleased
        checkButton();
    }//GEN-LAST:event_adresse_TextFieldKeyReleased

    private void fodselsdag_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fodselsdag_TextFieldKeyReleased
        checkButton();
    }//GEN-LAST:event_fodselsdag_TextFieldKeyReleased

    private void hone_CheckBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hone_CheckBoxKeyReleased
        checkButton();
    }//GEN-LAST:event_hone_CheckBoxKeyReleased

    private void hone_CheckBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_hone_CheckBoxPropertyChange
        checkButton();
    }//GEN-LAST:event_hone_CheckBoxPropertyChange

    private void hone_CheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_hone_CheckBoxStateChanged
        checkButton();
    }//GEN-LAST:event_hone_CheckBoxStateChanged
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
//            java.util.logging.Logger.getLogger(OpretPersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(OpretPersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(OpretPersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(OpretPersonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                OpretPersonGUI dialog = new OpretPersonGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField adresse_TextField;
    private javax.swing.JButton annuller_Button;
    private javax.swing.JPanel billed_Pane;
    private javax.swing.JTextField fodselsdag_TextField;
    private javax.swing.JCheckBox hone_CheckBox;
    private javax.swing.JPanel info_Pane;
    private javax.swing.JPanel main_Pane;
    private javax.swing.JTextField navn_TextField;
    private javax.swing.JButton opret_Button;
    private javax.swing.JPanel picture_Pane;
    private javax.swing.JLabel text1_Label;
    private javax.swing.JLabel text2_Label;
    private javax.swing.JPanel tool_Pane;
    private javax.swing.JButton upload_Button;
    // End of variables declaration//GEN-END:variables
}
