/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author PAKLAP.pk
 */
public class Admin_customer extends javax.swing.JFrame {

    /**
     * Creates new form Admin_customer
     */
    public Admin_customer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back1 = new javax.swing.JButton();
        Cancel1 = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        show_cust = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        Admin_Admin = new javax.swing.JButton();
        Admin_customers = new javax.swing.JButton();
        Admin_booking = new javax.swing.JButton();
        Admin_Packages = new javax.swing.JButton();
        Admin_agents = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        Back1.setText("Back");
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        Cancel1.setText("Cancel");
        Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel1ActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 0, 102));
        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 0, 102));
        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        show_cust.setBackground(new java.awt.Color(255, 255, 255));
        show_cust.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        show_cust.setText("Show Customers");
        show_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_custActionPerformed(evt);
            }
        });

        cancel1.setBackground(new java.awt.Color(0, 0, 102));
        cancel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel1.setForeground(new java.awt.Color(255, 255, 255));
        cancel1.setText("Cancel");
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });

        back1.setBackground(new java.awt.Color(0, 0, 102));
        back1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setText("Back");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(102, 102, 102));
        panel1.setMaximumSize(new java.awt.Dimension(500, 500));
        panel1.setPreferredSize(new java.awt.Dimension(200, 200));
        panel1.setLayout(null);

        Admin_Admin.setBackground(new java.awt.Color(153, 204, 255));
        Admin_Admin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Admin_Admin.setText("Admin");
        Admin_Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_AdminActionPerformed(evt);
            }
        });
        panel1.add(Admin_Admin);
        Admin_Admin.setBounds(10, 60, 160, 40);

        Admin_customers.setBackground(new java.awt.Color(153, 204, 255));
        Admin_customers.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Admin_customers.setText("Customers");
        Admin_customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_customersActionPerformed(evt);
            }
        });
        panel1.add(Admin_customers);
        Admin_customers.setBounds(10, 160, 160, 40);

        Admin_booking.setBackground(new java.awt.Color(153, 204, 255));
        Admin_booking.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Admin_booking.setText("Bookings");
        Admin_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_bookingActionPerformed(evt);
            }
        });
        panel1.add(Admin_booking);
        Admin_booking.setBounds(10, 210, 160, 40);

        Admin_Packages.setBackground(new java.awt.Color(153, 204, 255));
        Admin_Packages.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Admin_Packages.setText("Packages");
        Admin_Packages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_PackagesActionPerformed(evt);
            }
        });
        panel1.add(Admin_Packages);
        Admin_Packages.setBounds(10, 260, 160, 40);

        Admin_agents.setBackground(new java.awt.Color(153, 204, 255));
        Admin_agents.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Admin_agents.setText("Agents");
        Admin_agents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Admin_agentsActionPerformed(evt);
            }
        });
        panel1.add(Admin_agents);
        Admin_agents.setBounds(10, 110, 160, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(show_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(show_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 70, 680, 430);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customers");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 690, 52);

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void show_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_custActionPerformed
        // TODO add your handling code here
        show_cust cust = new show_cust();
        dispose();
        cust.show();
    }//GEN-LAST:event_show_custActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        // TODO add your handling code here:
        Admin_dashboard admin = new Admin_dashboard();
        dispose();
        admin.show();
    }//GEN-LAST:event_Back1ActionPerformed

    private void Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_Cancel1ActionPerformed

    private void Admin_AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_AdminActionPerformed
        // TODO add your handling code here:
        Admin_admin admin = new Admin_admin();
        dispose();
        admin.show();
    }//GEN-LAST:event_Admin_AdminActionPerformed

    private void Admin_customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_customersActionPerformed
        // TODO add your handling code here:
        Admin_customer cust = new Admin_customer();
        dispose();
        cust.show();
    }//GEN-LAST:event_Admin_customersActionPerformed

    private void Admin_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_bookingActionPerformed
        // TODO add your handling code here:
        Admin_booking book = new Admin_booking();
        dispose();
        book.show();
    }//GEN-LAST:event_Admin_bookingActionPerformed

    private void Admin_PackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_PackagesActionPerformed
        // TODO add your handling code here:
        Admin_package pack = new Admin_package();
        dispose();
        pack.show();
    }//GEN-LAST:event_Admin_PackagesActionPerformed

    private void Admin_agentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Admin_agentsActionPerformed
        // TODO add your handling code here:
        Admin_agent agent = new Admin_agent();
        dispose();
        agent.show();
    }//GEN-LAST:event_Admin_agentsActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Admin_dashboard admin = new Admin_dashboard();
        dispose();
        admin.show();
    }//GEN-LAST:event_backActionPerformed

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancel1ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        Admin_dashboard admin = new Admin_dashboard();
        dispose();
        admin.show();
    }//GEN-LAST:event_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin_Admin;
    private javax.swing.JButton Admin_Packages;
    private javax.swing.JButton Admin_agents;
    private javax.swing.JButton Admin_booking;
    private javax.swing.JButton Admin_customers;
    private javax.swing.JButton Back1;
    private javax.swing.JButton Cancel1;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    private javax.swing.JButton show_cust;
    // End of variables declaration//GEN-END:variables
}