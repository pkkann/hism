/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.person;

import date.ADate;
import javax.swing.DefaultListModel;
import model.Guest;
import model.Person;

/**
 *
 * @author patrick
 */
public class EnrollPersonDIA extends javax.swing.JDialog {

    private Person selectedPerson;
    private Guest selectedGuest;

    public EnrollPersonDIA(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public void setPerson(Person p) {
        this.selectedPerson = p;
        if (p.isEnrolled()) {
            guests_List.setEnabled(true);
            DefaultListModel dlm = new DefaultListModel();
            for (Guest g : p.getGuests()) {
                dlm.addElement(g.getFirstname() + " " + g.getLastname() + " - " + ADate.formatADate(g.getBirthday(), "/"));
            }
            guests_List.setModel(dlm);
            enroll_Button.setText("Fjern indskrivning");
            countGuests();
        }
    }

    private void countGuests() {
        int count = guests_List.getModel().getSize();
        if (count != 0) {
            if (selectedPerson.isHone()) {
                if (count >= 5) {
                    removeGuest_Button.setEnabled(true);
                    addGuest_Button.setEnabled(false);
                } else {
                    removeGuest_Button.setEnabled(true);
                    addGuest_Button.setEnabled(true);
                }
            } else {
                if (count >= 3) {
                    removeGuest_Button.setEnabled(true);
                    addGuest_Button.setEnabled(false);
                } else {
                    removeGuest_Button.setEnabled(true);
                    addGuest_Button.setEnabled(true);
                }
            }
        } else {
            removeGuest_Button.setEnabled(false);
            addGuest_Button.setEnabled(true);
        }
    }

    private void clean() {
        try {
            DefaultListModel dlm = new DefaultListModel();
            guests_List.setModel(dlm);
        } catch (NullPointerException ex) {
        }
        guests_List.setEnabled(true);
        removeGuest_Button.setEnabled(false);
        addGuest_Button.setEnabled(true);
        enroll_Button.setEnabled(true);
        enroll_Button.setText("Indskriv");
        save_Button.setEnabled(true);
    }

    private void save() {
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
        guests_Pane = new javax.swing.JPanel();
        guestInfo_Label = new javax.swing.JLabel();
        addGuest_Button = new javax.swing.JButton();
        removeGuest_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        guests_List = new javax.swing.JList();
        tool1_Pane = new javax.swing.JPanel();
        save_Button = new javax.swing.JButton();
        tool_Pane = new javax.swing.JPanel();
        enroll_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        main_Pane.setBackground(new java.awt.Color(51, 51, 51));

        guestInfo_Label.setText("Gæster:");

        addGuest_Button.setText("Tilføj gæst");
        addGuest_Button.setEnabled(false);

        removeGuest_Button.setText("Fjern gæst");
        removeGuest_Button.setEnabled(false);

        guests_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        guests_List.setEnabled(false);
        guests_List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                guests_ListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(guests_List);

        javax.swing.GroupLayout guests_PaneLayout = new javax.swing.GroupLayout(guests_Pane);
        guests_Pane.setLayout(guests_PaneLayout);
        guests_PaneLayout.setHorizontalGroup(
            guests_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guests_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guestInfo_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(guests_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guests_PaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(removeGuest_Button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addGuest_Button))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap())
        );
        guests_PaneLayout.setVerticalGroup(
            guests_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guests_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guests_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guestInfo_Label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(guests_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGuest_Button)
                    .addComponent(removeGuest_Button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        save_Button.setText("Gem indskrivning");
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tool1_PaneLayout = new javax.swing.GroupLayout(tool1_Pane);
        tool1_Pane.setLayout(tool1_PaneLayout);
        tool1_PaneLayout.setHorizontalGroup(
            tool1_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tool1_PaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_Button)
                .addContainerGap())
        );
        tool1_PaneLayout.setVerticalGroup(
            tool1_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tool1_PaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_Button)
                .addContainerGap())
        );

        enroll_Button.setText("Indskriv");
        enroll_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enroll_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tool_PaneLayout = new javax.swing.GroupLayout(tool_Pane);
        tool_Pane.setLayout(tool_PaneLayout);
        tool_PaneLayout.setHorizontalGroup(
            tool_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tool_PaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enroll_Button)
                .addContainerGap())
        );
        tool_PaneLayout.setVerticalGroup(
            tool_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tool_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enroll_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout main_PaneLayout = new javax.swing.GroupLayout(main_Pane);
        main_Pane.setLayout(main_PaneLayout);
        main_PaneLayout.setHorizontalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guests_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tool1_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tool_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_PaneLayout.setVerticalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(guests_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tool_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tool1_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        clean();
    }//GEN-LAST:event_formWindowClosed

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        save();
        dispose();
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void guests_ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_guests_ListValueChanged
        countGuests();
    }//GEN-LAST:event_guests_ListValueChanged

    private void enroll_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enroll_ButtonActionPerformed
        selectedPerson.setEnrolled(true);
        setPerson(selectedPerson);
    }//GEN-LAST:event_enroll_ButtonActionPerformed
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
//            java.util.logging.Logger.getLogger(EnrollPersonDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EnrollPersonDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EnrollPersonDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EnrollPersonDIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                EnrollPersonDIA dialog = new EnrollPersonDIA(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addGuest_Button;
    private javax.swing.JButton enroll_Button;
    private javax.swing.JLabel guestInfo_Label;
    private javax.swing.JList guests_List;
    private javax.swing.JPanel guests_Pane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main_Pane;
    private javax.swing.JButton removeGuest_Button;
    private javax.swing.JButton save_Button;
    private javax.swing.JPanel tool1_Pane;
    private javax.swing.JPanel tool_Pane;
    // End of variables declaration//GEN-END:variables
}
