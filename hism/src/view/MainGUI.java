package view;

import java.util.Calendar;
import javax.swing.ButtonGroup;
import session.LoginHandler;

/**
 *
 * @author pkann
 */
public class MainGUI extends javax.swing.JFrame {

    private LoginGUI loginGUI;
    private OpretPersonGUI opretPersonGUI;
    private LoginHandler loginHandler;
    private ButtonGroup category_1;

    public MainGUI(LoginGUI loginGUI, OpretPersonGUI opretPersonGUI, LoginHandler loginHandler) {
        initComponents();
        setupButtonGroup();
        this.loginGUI = loginGUI;
        this.opretPersonGUI = opretPersonGUI;
        this.loginHandler = loginHandler;
        setLocationRelativeTo(null);
        updateDate();
        login();
    }

    public void login() {
        if(loginHandler.getLoggedIn() == null) {
            setVisible(false);
            loginGUI.setVisible(true);
            login();
        } else {
            setVisible(true);
            loginGUI.setVisible(false);
            user_Label.setText(loginHandler.getLoggedIn().getName());
        }
    }
    
    private void setupButtonGroup() {
        category_1 = new ButtonGroup();
        category_1.add(birthday_RadioButton);
        category_1.add(name_RadioButton);
        birthday_RadioButton.getModel().setSelected(true);
    }

    private void updateDate() {
        theDate_Label.setText(String.valueOf(Calendar.getInstance().get(Calendar.DATE) + "/" + Calendar.getInstance().get(Calendar.MONTH) + "/" + Calendar.getInstance().get(Calendar.YEAR)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_Pane = new javax.swing.JPanel();
        search_Pane = new javax.swing.JPanel();
        search_TextField = new javax.swing.JTextField();
        search_Button = new javax.swing.JButton();
        birthday_RadioButton = new javax.swing.JRadioButton();
        name_RadioButton = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        details_Pane = new javax.swing.JPanel();
        result_Pane = new javax.swing.JPanel();
        result_ScrollPane = new javax.swing.JScrollPane();
        result_List = new javax.swing.JList();
        bottom_Pane = new javax.swing.JPanel();
        dato_Label = new javax.swing.JLabel();
        theDate_Label = new javax.swing.JLabel();
        splitter1_Label = new javax.swing.JLabel();
        guests_Label = new javax.swing.JLabel();
        theGuests_Label = new javax.swing.JLabel();
        splitter2_Label = new javax.swing.JLabel();
        loggedIn_Label = new javax.swing.JLabel();
        user_Label = new javax.swing.JLabel();
        menuBar_MenuBar = new javax.swing.JMenuBar();
        file_Menu = new javax.swing.JMenu();
        logOff_MenuItem = new javax.swing.JMenuItem();
        close_MenuItem = new javax.swing.JMenuItem();
        administrer_Menu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(871, 527));
        setResizable(false);

        search_Pane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Søg", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.gray));

        search_Button.setText("Søg");

        birthday_RadioButton.setText("Fødselsdag");

        name_RadioButton.setText("Navn");

        jCheckBox1.setText("Reserve");

        jCheckBox2.setText("Høne");

        javax.swing.GroupLayout search_PaneLayout = new javax.swing.GroupLayout(search_Pane);
        search_Pane.setLayout(search_PaneLayout);
        search_PaneLayout.setHorizontalGroup(
            search_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(search_PaneLayout.createSequentialGroup()
                        .addComponent(birthday_RadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(name_RadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox2)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addComponent(search_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search_Button)
                .addContainerGap())
        );
        search_PaneLayout.setVerticalGroup(
            search_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthday_RadioButton)
                    .addComponent(name_RadioButton)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        details_Pane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Oplysninger", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.gray));

        javax.swing.GroupLayout details_PaneLayout = new javax.swing.GroupLayout(details_Pane);
        details_Pane.setLayout(details_PaneLayout);
        details_PaneLayout.setHorizontalGroup(
            details_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        details_PaneLayout.setVerticalGroup(
            details_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        result_Pane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, java.awt.Color.gray));

        result_List.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        result_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        result_ScrollPane.setViewportView(result_List);

        javax.swing.GroupLayout result_PaneLayout = new javax.swing.GroupLayout(result_Pane);
        result_Pane.setLayout(result_PaneLayout);
        result_PaneLayout.setHorizontalGroup(
            result_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(result_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addContainerGap())
        );
        result_PaneLayout.setVerticalGroup(
            result_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(result_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(result_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout main_PaneLayout = new javax.swing.GroupLayout(main_Pane);
        main_Pane.setLayout(main_PaneLayout);
        main_PaneLayout.setHorizontalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(main_PaneLayout.createSequentialGroup()
                        .addComponent(details_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        main_PaneLayout.setVerticalGroup(
            main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(details_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bottom_Pane.setBackground(java.awt.Color.darkGray);

        dato_Label.setForeground(java.awt.Color.white);
        dato_Label.setText("Dato:");

        theDate_Label.setForeground(java.awt.Color.white);
        theDate_Label.setText("DATE");

        splitter1_Label.setForeground(java.awt.Color.white);
        splitter1_Label.setText("|");

        guests_Label.setForeground(java.awt.Color.white);
        guests_Label.setText("Gæster:");

        theGuests_Label.setForeground(java.awt.Color.white);
        theGuests_Label.setText("GUESTS");

        splitter2_Label.setForeground(java.awt.Color.white);
        splitter2_Label.setText("|");

        loggedIn_Label.setForeground(java.awt.Color.white);
        loggedIn_Label.setText("Logged ind:");

        user_Label.setForeground(java.awt.Color.white);
        user_Label.setText("USER");

        javax.swing.GroupLayout bottom_PaneLayout = new javax.swing.GroupLayout(bottom_Pane);
        bottom_Pane.setLayout(bottom_PaneLayout);
        bottom_PaneLayout.setHorizontalGroup(
            bottom_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottom_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dato_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(theDate_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitter1_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(guests_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(theGuests_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(splitter2_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loggedIn_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bottom_PaneLayout.setVerticalGroup(
            bottom_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottom_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bottom_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_Label)
                    .addComponent(theDate_Label)
                    .addComponent(splitter1_Label)
                    .addComponent(guests_Label)
                    .addComponent(theGuests_Label)
                    .addComponent(splitter2_Label)
                    .addComponent(loggedIn_Label)
                    .addComponent(user_Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        file_Menu.setText("File");

        logOff_MenuItem.setText("Log ud");
        logOff_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOff_MenuItemActionPerformed(evt);
            }
        });
        file_Menu.add(logOff_MenuItem);

        close_MenuItem.setText("Luk");
        close_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_MenuItemActionPerformed(evt);
            }
        });
        file_Menu.add(close_MenuItem);

        menuBar_MenuBar.add(file_Menu);

        administrer_Menu.setText("Administrer");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Opret person");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        administrer_Menu.add(jMenuItem1);

        menuBar_MenuBar.add(administrer_Menu);

        setJMenuBar(menuBar_MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bottom_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_Pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOff_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOff_MenuItemActionPerformed
        loginHandler.logout();
        login();
    }//GEN-LAST:event_logOff_MenuItemActionPerformed

    private void close_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_MenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_close_MenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        opretPersonGUI.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
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
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainGUI().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu administrer_Menu;
    private javax.swing.JRadioButton birthday_RadioButton;
    private javax.swing.JPanel bottom_Pane;
    private javax.swing.JMenuItem close_MenuItem;
    private javax.swing.JLabel dato_Label;
    private javax.swing.JPanel details_Pane;
    private javax.swing.JMenu file_Menu;
    private javax.swing.JLabel guests_Label;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem logOff_MenuItem;
    private javax.swing.JLabel loggedIn_Label;
    private javax.swing.JPanel main_Pane;
    private javax.swing.JMenuBar menuBar_MenuBar;
    private javax.swing.JRadioButton name_RadioButton;
    private javax.swing.JList result_List;
    private javax.swing.JPanel result_Pane;
    private javax.swing.JScrollPane result_ScrollPane;
    private javax.swing.JButton search_Button;
    private javax.swing.JPanel search_Pane;
    private javax.swing.JTextField search_TextField;
    private javax.swing.JLabel splitter1_Label;
    private javax.swing.JLabel splitter2_Label;
    private javax.swing.JLabel theDate_Label;
    private javax.swing.JLabel theGuests_Label;
    private javax.swing.JLabel user_Label;
    // End of variables declaration//GEN-END:variables
}
