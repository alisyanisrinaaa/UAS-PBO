/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

/**
 *
 * @author fx506
 */
public class showdata extends javax.swing.JFrame {

    public showdata() {
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

        back = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        data = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 190, 40));

        riwayat.setBackground(new java.awt.Color(255, 255, 255));
        riwayat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        riwayat.setForeground(new java.awt.Color(0, 0, 0));
        riwayat.setText("RIWAYAT TANAM");
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 380, 60));

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        data.setForeground(new java.awt.Color(0, 0, 0));
        data.setText("DATA TANAMAN");
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        getContentPane().add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 380, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Green Modern Plant Store Login Page Desktop Prototype (10).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        menuadmin showdata = new menuadmin("001");
        showdata.setVisible(true);
        showdata.pack();
        showdata.setLocationRelativeTo(null);
        showdata.setDefaultCloseOperation(menuadmin.EXIT_ON_CLOSE);
        this.dispose();
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        datatanaman showdata = new datatanaman();
        showdata.setVisible(true);
        showdata.pack();
        showdata.setLocationRelativeTo(null);
        showdata.setDefaultCloseOperation(datatanaman.EXIT_ON_CLOSE);
        this.dispose();
        setVisible(false);
    }//GEN-LAST:event_dataActionPerformed

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        riwayattanam showdata = new riwayattanam();
        showdata.setVisible(true);
        showdata.pack();
        showdata.setLocationRelativeTo(null);
        showdata.setDefaultCloseOperation(riwayattanam.EXIT_ON_CLOSE);
        this.dispose();
        setVisible(false);
    }//GEN-LAST:event_riwayatActionPerformed

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
            java.util.logging.Logger.getLogger(showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton riwayat;
    // End of variables declaration//GEN-END:variables
}
