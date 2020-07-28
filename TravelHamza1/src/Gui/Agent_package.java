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
public class Agent_package extends javax.swing.JFrame {

    /**
     * Creates new form Agent_package
     */
    public Agent_package() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        Agent_agents = new javax.swing.JButton();
        Agent_customers = new javax.swing.JButton();
        Agent_booking = new javax.swing.JButton();
        Agent_Packages = new javax.swing.JButton();
        add_book = new javax.swing.JButton();
        show_book = new javax.swing.JButton();
        search_pkg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Packages");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel2.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        cancel.setBackground(new java.awt.Color(0, 0, 102));
        cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel);
        cancel.setBounds(450, 290, 115, 36);

        back.setBackground(new java.awt.Color(0, 0, 102));
        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(320, 290, 109, 36);

        panel1.setBackground(new java.awt.Color(102, 102, 102));
        panel1.setMaximumSize(new java.awt.Dimension(500, 500));
        panel1.setPreferredSize(new java.awt.Dimension(200, 200));
        panel1.setLayout(null);

        Agent_agents.setBackground(new java.awt.Color(153, 204, 255));
        Agent_agents.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Agent_agents.setText("Agents");
        Agent_agents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agent_agentsActionPerformed(evt);
            }
        });
        panel1.add(Agent_agents);
        Agent_agents.setBounds(10, 80, 160, 40);

        Agent_customers.setBackground(new java.awt.Color(153, 204, 255));
        Agent_customers.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Agent_customers.setText("Customers");
        Agent_customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agent_customersActionPerformed(evt);
            }
        });
        panel1.add(Agent_customers);
        Agent_customers.setBounds(10, 130, 160, 40);

        Agent_booking.setBackground(new java.awt.Color(153, 204, 255));
        Agent_booking.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Agent_booking.setText("Bookings");
        Agent_booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agent_bookingActionPerformed(evt);
            }
        });
        panel1.add(Agent_booking);
        Agent_booking.setBounds(10, 180, 160, 40);

        Agent_Packages.setBackground(new java.awt.Color(153, 204, 255));
        Agent_Packages.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        Agent_Packages.setText("Packages");
        Agent_Packages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agent_PackagesActionPerformed(evt);
            }
        });
        panel1.add(Agent_Packages);
        Agent_Packages.setBounds(10, 230, 160, 40);

        jPanel1.add(panel1);
        panel1.setBounds(0, 0, 180, 420);

        add_book.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        add_book.setText("Book Packages");
        add_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bookActionPerformed(evt);
            }
        });
        jPanel1.add(add_book);
        add_book.setBounds(240, 110, 190, 50);

        show_book.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        show_book.setText("View Packages");
        show_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_bookActionPerformed(evt);
            }
        });
        jPanel1.add(show_book);
        show_book.setBounds(340, 170, 190, 50);

        search_pkg.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        search_pkg.setText("Search Package");
        search_pkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_pkgActionPerformed(evt);
            }
        });
        jPanel1.add(search_pkg);
        search_pkg.setBounds(450, 110, 190, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Agent_dashboard panel = new Agent_dashboard();
        dispose();
        panel.show();
    }//GEN-LAST:event_backActionPerformed

    private void Agent_agentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agent_agentsActionPerformed
        // TODO add your handling code here:
        Agent_agent agent = new Agent_agent();
        dispose();
        agent.show();
    }//GEN-LAST:event_Agent_agentsActionPerformed

    private void Agent_customersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agent_customersActionPerformed
        // TODO add your handling code here:
        Agent_customer cust = new Agent_customer();
        dispose();
        cust.show();
    }//GEN-LAST:event_Agent_customersActionPerformed

    private void Agent_bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agent_bookingActionPerformed
        // TODO add your handling code here:
        Agent_booking book = new Agent_booking();
        dispose();
        book.show();
    }//GEN-LAST:event_Agent_bookingActionPerformed

    private void Agent_PackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agent_PackagesActionPerformed
        // TODO add your handling code here:
        Agent_package pack = new Agent_package();
        dispose();
        pack.show();
    }//GEN-LAST:event_Agent_PackagesActionPerformed

    private void add_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bookActionPerformed
        // TODO add your handling code here:
        add_book book = new add_book();
        dispose();
        book.show();
    }//GEN-LAST:event_add_bookActionPerformed

    private void show_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_bookActionPerformed
        // TODO add your handling code here:
        showpkg_agent pkg = new showpkg_agent();
        dispose();
        pkg.show();
    }//GEN-LAST:event_show_bookActionPerformed

    private void search_pkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_pkgActionPerformed
        // TODO add your handling code here:
        searchpkg_agent pkg = new searchpkg_agent();
        dispose();
        pkg.show();
    }//GEN-LAST:event_search_pkgActionPerformed

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
            java.util.logging.Logger.getLogger(Agent_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agent_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agent_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agent_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agent_package().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agent_Packages;
    private javax.swing.JButton Agent_agents;
    private javax.swing.JButton Agent_booking;
    private javax.swing.JButton Agent_customers;
    private javax.swing.JButton add_book;
    private javax.swing.JButton back;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    private javax.swing.JButton search_pkg;
    private javax.swing.JButton show_book;
    // End of variables declaration//GEN-END:variables
}