
package userregistry;

import java.util.HashMap;
import javax.swing.JOptionPane;


public class UserLogin extends javax.swing.JFrame {

    private static String username;
    
         HashMap<String, String> credentials = new HashMap<>();
    HashMap<String, Double> balances = new HashMap<>();
    private HashMap<String, Double> loggin;
    
     public void setLogin(HashMap<String, Double> loggin) {
        this.loggin = loggin;
    }
     
    public UserLogin(String username) {
        initComponents();
    }
    
    private void UserReggy() {
        
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Accounty = new javax.swing.JTextField();
        Passy = new javax.swing.JPasswordField();
        Loginy = new javax.swing.JButton();
        Showy = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        Signy = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Registration System - Rien Miro Gappi");
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Username: ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("LOGIN");

        Accounty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountyActionPerformed(evt);
            }
        });

        Passy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassyActionPerformed(evt);
            }
        });

        Loginy.setBackground(new java.awt.Color(169, 164, 139));
        Loginy.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Loginy.setForeground(new java.awt.Color(0, 0, 0));
        Loginy.setText("Login");
        Loginy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginyActionPerformed(evt);
            }
        });

        Showy.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Showy.setText("Show Password");
        Showy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setText("USER REGISTRATION SYSTEM");

        Signy.setBackground(new java.awt.Color(151, 146, 113));
        Signy.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Signy.setForeground(new java.awt.Color(0, 0, 0));
        Signy.setText("Sign Up");
        Signy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignyActionPerformed(evt);
            }
        });

        jLabel5.setText("Create Account");

        jPanel1.setBackground(new java.awt.Color(188, 177, 127));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Showy)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Signy)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Loginy))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Accounty, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Passy, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel3)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Passy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Showy)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Loginy)
                    .addComponent(Signy)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassyActionPerformed
    
    }//GEN-LAST:event_PassyActionPerformed

    private void SignyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignyActionPerformed
    
        String username = Accounty.getText();
        String password = new String(Passy.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in the fields to sign up.");
            
            UserRegistry usery = new UserRegistry(username);
               usery.setUser(balances);
               usery.setVisible(true);
                dispose();
            
        }       

    }//GEN-LAST:event_SignyActionPerformed

    private void ShowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowyActionPerformed
 if (Showy.isSelected()){
            Passy.setEchoChar((char)0);
        } else

          Passy.setEchoChar('*');       
    }//GEN-LAST:event_ShowyActionPerformed

    private void LoginyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginyActionPerformed
        String username = Accounty.getText();
        String password = new String(Passy.getPassword());
        
 
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Account not found, please sign up to login.");
            return;
        }
        
        if (credentials.containsKey(username)) {
            if (credentials.get(username).equals(password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
               
               UserRegistry users = new UserRegistry(username);
               users.setUser(balances);
               users.setVisible(true);
                dispose();
          
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect password!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login Successful!");
            JOptionPane.showMessageDialog(null, "Rien Miro Gappi - Activity 2");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_LoginyActionPerformed

    private void AccountyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountyActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private String username;
            public void run() {
                new UserLogin(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Accounty;
    private javax.swing.JButton Loginy;
    private javax.swing.JPasswordField Passy;
    private javax.swing.JCheckBox Showy;
    private javax.swing.JButton Signy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
