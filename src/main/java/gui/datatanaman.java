/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import Database.Buah;
import Database.Sayuran;
import Database.Tanaman;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fx506
 */
public class datatanaman extends javax.swing.JFrame {

    public datatanaman() {
        initComponents();
        setTableSayur();
        setTableBuah();
    }
    
    private void clearSayur(){
        IDTANAMANSAYUR.setText("");
        NAMATANAMANSAYUR.setText("");
        KONDISITANAMANSAYUR.setText("");
        METODEPENANAMAN.setText("");
        MUSIMTANAM.setText("");
    } 
    
    private void clearBuah(){
        IDTANAMANBUAH.setText("");
        NAMATANAMANBUAH.setText("");
        KONDISITANAMANBUAH.setText("");
        BENTUKBUAH.setText("");
        TINGKATKEMATANGAN.setText("");
    } 
    
    private void setTableSayur(){
        try {
            DefaultTableModel modelSayur = (DefaultTableModel) jTable1.getModel();
            modelSayur.setRowCount(0);
            ArrayList<Sayuran> dataSayur = Sayuran.readSayuran();
            for (Sayuran sayuran : dataSayur) {
                String id = sayuran.getId();
                String nama = sayuran.getNama();
                String kondisi = sayuran.getKondisiTanaman();
                String metoda = sayuran.getMetodePenanaman();
                String musim = sayuran.getMusimTanam();
                String[] row = {id,nama,kondisi,metoda,musim};
                modelSayur.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(datatanamankaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setTableBuah(){
        try {
            DefaultTableModel modeBuah = (DefaultTableModel) jTable2.getModel();
            modeBuah.setRowCount(0);
            ArrayList<Buah> dataBuah = Buah.readBuah();
            for (Buah buah : dataBuah) {
                String id = buah.getId();
                String nama = buah.getNama();
                String kondisi = buah.getKondisiTanaman();
                String bentuk = buah.getBentukBuah();
                String tingkat = buah.getTingkatKematangan();
                String[] row = {id,nama,kondisi,bentuk,tingkat};
                modeBuah.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(datatanamankaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnUpdateSayur = new javax.swing.JButton();
        btnUpdateBuah = new javax.swing.JButton();
        deleteBuah = new javax.swing.JButton();
        deleteSayur = new javax.swing.JButton();
        IDTANAMANSAYUR = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NAMATANAMANSAYUR = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        KONDISITANAMANSAYUR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        METODEPENANAMAN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MUSIMTANAM = new javax.swing.JTextField();
        IDTANAMANBUAH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NAMATANAMANBUAH = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        KONDISITANAMANBUAH = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        BENTUKBUAH = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TINGKATKEMATANGAN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        jTable2.setBackground(new java.awt.Color(0, 102, 51));
        jTable2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA TANAMAN", "KONDISI TANAMAN", "BENTUK BUAH", "TINGKAT KEMATANGAN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 670, 170));

        jTable1.setBackground(new java.awt.Color(0, 102, 51));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA TANAMAN", "KONDISI TANAMAN", "METODE PENANAMAN", "MUSIM TANAM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 670, 170));

        btnUpdateSayur.setBackground(new java.awt.Color(0, 102, 51));
        btnUpdateSayur.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateSayur.setText("UPDATE");
        btnUpdateSayur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSayurActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateSayur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 230, -1, -1));

        btnUpdateBuah.setBackground(new java.awt.Color(0, 102, 51));
        btnUpdateBuah.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateBuah.setText("UPDATE");
        btnUpdateBuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBuahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateBuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 470, -1, -1));

        deleteBuah.setBackground(new java.awt.Color(0, 102, 51));
        deleteBuah.setForeground(new java.awt.Color(255, 255, 255));
        deleteBuah.setText("DELETE");
        deleteBuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBuahActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        deleteSayur.setBackground(new java.awt.Color(0, 102, 51));
        deleteSayur.setForeground(new java.awt.Color(255, 255, 255));
        deleteSayur.setText("DELETE");
        deleteSayur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSayurActionPerformed(evt);
            }
        });
        getContentPane().add(deleteSayur, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));
        getContentPane().add(IDTANAMANSAYUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, 140, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAMA TANAMAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));
        getContentPane().add(NAMATANAMANSAYUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 140, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KONDISI TANAMAN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));
        getContentPane().add(KONDISITANAMANSAYUR, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 140, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("METODE PENANAMAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, -1, -1));
        getContentPane().add(METODEPENANAMAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 260, 140, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MUSIM TANAM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, -1, -1));
        getContentPane().add(MUSIMTANAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 140, -1));
        getContentPane().add(IDTANAMANBUAH, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 140, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAMA TANAMAN");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, -1, -1));
        getContentPane().add(NAMATANAMANBUAH, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 440, 140, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("KONDISI TANAMAN");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, -1, -1));
        getContentPane().add(KONDISITANAMANBUAH, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 470, 140, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BENTUK BUAH");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, -1, -1));
        getContentPane().add(BENTUKBUAH, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 500, 140, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TINGKAT KEMATANGAN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, -1, -1));
        getContentPane().add(TINGKATKEMATANGAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Green Modern Plant Store Login Page Desktop Prototype (5).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        showdata datatanaman = new showdata();
        datatanaman.setVisible(true);
        datatanaman.pack();
        datatanaman.setLocationRelativeTo(null);
        datatanaman.setDefaultCloseOperation(datatanaman.EXIT_ON_CLOSE);
        this.dispose();
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int selectedrow = jTable1.getSelectedRow();
            Object value = jTable1.getValueAt(selectedrow, 0);
            String[] data = Sayuran.getRow(value.toString());
            IDTANAMANSAYUR.setText(data[0]);
            NAMATANAMANSAYUR.setText(data[1]);
            KONDISITANAMANSAYUR.setText(data[2]);
            METODEPENANAMAN.setText(data[4]);
            MUSIMTANAM.setText(data[5]);
        } catch (SQLException ex) {
            Logger.getLogger(datatanaman.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try {
            int selectedrow = jTable2.getSelectedRow();
            Object value = jTable2.getValueAt(selectedrow, 0);
            String[] data = Buah.getRow(value.toString());
            IDTANAMANBUAH.setText(data[0]);
            NAMATANAMANBUAH.setText(data[1]);
            KONDISITANAMANBUAH.setText(data[2]);
            BENTUKBUAH.setText(data[4]);
            TINGKATKEMATANGAN.setText(data[5]);

        } catch (SQLException ex) {
            Logger.getLogger(datatanaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void deleteSayurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSayurActionPerformed
        try {
            String idSayur = IDTANAMANSAYUR.getText();
            Sayuran.deletesayur(idSayur);
            Tanaman.deleteTanaman(idSayur);
            setTableSayur();
            JOptionPane.showMessageDialog(null, "BERHASIL MENGHAPUS SAYUR");
            clearSayur();
        } catch (SQLException ex) {
            Logger.getLogger(datatanaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteSayurActionPerformed

    private void deleteBuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBuahActionPerformed
        try {
            String idBuah = IDTANAMANBUAH.getText();
            Buah.deletebuah(idBuah);
            Tanaman.deleteTanaman(idBuah);
            setTableBuah();
            JOptionPane.showMessageDialog(null, "BERHASIL MENGHAPUS BUAH");
            clearBuah();
        } catch (SQLException ex) {
            Logger.getLogger(datatanaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBuahActionPerformed

    private void btnUpdateSayurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSayurActionPerformed
        try {
            String idTanaman = IDTANAMANSAYUR.getText();
            String namaTanaman = NAMATANAMANSAYUR.getText();
            String kondisiTanaman = KONDISITANAMANSAYUR.getText();
            String metodePenanaman = METODEPENANAMAN.getText();
            String musimTanam = MUSIMTANAM.getText();
            Sayuran.updatesayuran(idTanaman, metodePenanaman, musimTanam);
            Tanaman.updateTanaman(idTanaman, namaTanaman, kondisiTanaman);
            setTableSayur();
            JOptionPane.showMessageDialog(null, "BERHASIL MENGUPDATE SAYUR");
            clearSayur();
        } catch (SQLException ex) {
            Logger.getLogger(datatanaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateSayurActionPerformed

    private void btnUpdateBuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBuahActionPerformed
        try {
            String idTanaman = IDTANAMANBUAH.getText();
            String namaTanaman = NAMATANAMANBUAH.getText();
            String kondisiTanaman = KONDISITANAMANBUAH.getText();
            String bentukbuah = BENTUKBUAH.getText();
            String tingkatkematangan = TINGKATKEMATANGAN.getText();
            Buah.updatebuah(idTanaman, bentukbuah, tingkatkematangan);
            Tanaman.updateTanaman(idTanaman, namaTanaman, kondisiTanaman);
            setTableBuah();
            JOptionPane.showMessageDialog(null, "BERHASIL MENGUPDATE BUAH");
            clearBuah();
        } catch (SQLException ex) {
            Logger.getLogger(datatanaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateBuahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datatanaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BENTUKBUAH;
    private javax.swing.JTextField IDTANAMANBUAH;
    private javax.swing.JTextField IDTANAMANSAYUR;
    private javax.swing.JTextField KONDISITANAMANBUAH;
    private javax.swing.JTextField KONDISITANAMANSAYUR;
    private javax.swing.JTextField METODEPENANAMAN;
    private javax.swing.JTextField MUSIMTANAM;
    private javax.swing.JTextField NAMATANAMANBUAH;
    private javax.swing.JTextField NAMATANAMANSAYUR;
    private javax.swing.JTextField TINGKATKEMATANGAN;
    private javax.swing.JButton btnUpdateBuah;
    private javax.swing.JButton btnUpdateSayur;
    private javax.swing.JButton deleteBuah;
    private javax.swing.JButton deleteSayur;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
