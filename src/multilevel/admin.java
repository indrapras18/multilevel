/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilevel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class admin extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form admin
     *
     * @throws java.sql.SQLException
     */
    public admin() throws SQLException {
        initComponents();
        initCount();
    }

    public void initCount() throws SQLException {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mbaknis", "root", "");
            String sql = "select count(*) from staff";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                total_admin.setText(rs.getString(1));
            }

            sql = "select count(*) from stok_menu";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                material.setText(rs.getString(1));
            }

            sql = "select sum(jumlah) from stok_kr";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                pendapatan.setText(rs.getString(1));
            }
        } catch (Exception e) {

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

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        material = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        total_admin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pendapatan = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 40));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 190, 40));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Staff");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, 90));

        woy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(woy, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 90, 20));

        material.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        material.setForeground(new java.awt.Color(255, 255, 255));
        material.setText("-");
        getContentPane().add(material, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 70, 90));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Material");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 100, 90));

        total_admin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        total_admin.setForeground(new java.awt.Color(255, 255, 255));
        total_admin.setText("-");
        getContentPane().add(total_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 40, 90));

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 190, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Pendapatan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 120, 90));

        pendapatan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pendapatan.setForeground(new java.awt.Color(255, 255, 255));
        pendapatan.setText("-");
        getContentPane().add(pendapatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 64, 80, 80));

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 190, 40));

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 190, 40));

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/adminpage.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new staff().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new admin().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // Exit
        subclass exit = new subclass();
        exit.Exit();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new absen().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new setting().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new MaterialStok().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiLevelLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel material;
    private javax.swing.JLabel pendapatan;
    private javax.swing.JLabel total_admin;
    public static final javax.swing.JLabel woy = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
