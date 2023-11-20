/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author fx506
 */
public final class Sayuran extends Tanaman{
    private  String metodePenanaman;
    private  String musimTanam;
    private static Connection con;
    private static Statement st;
    
    static database.Database db = new database.Database();
    static ArrayList<Sayuran> arraySayuran = new ArrayList<>();
    
    public Sayuran(String idtanaman, String nama, String kondisiTanaman, String idadmin, String metodePenanaman, String musimTanam) {
        super(idtanaman, nama, kondisiTanaman, idadmin);
        this.metodePenanaman = metodePenanaman;
        this.musimTanam = musimTanam;
    }

    public String getMetodePenanaman() {
        return metodePenanaman;
    }

    public void setMetodePenanaman(String metodePenanaman) {
        this.metodePenanaman = metodePenanaman;
    }
    

    public String getMusimTanam() {
        return musimTanam;
    }

    public void setMusimTanam(String musimTanam) {
        this.musimTanam = musimTanam;
    }

    public static Statement getSt() {
        return st;
    }

    public static void setSt(Statement st) {
        Sayuran.st = st;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String getKondisiTanaman() {
        return kondisiTanaman;
    }

    @Override
    public void setKondisiTanaman(String kondisiTanaman) {
        this.kondisiTanaman = kondisiTanaman;
    }

    
    

    public static ArrayList<Sayuran> readSayuran() throws SQLException{
        arraySayuran.clear();
        String query = "SELECT tanaman.*, sayuran.metode_penanaman, sayuran.musim_tanam FROM tanaman INNER JOIN sayuran ON tanaman.id_tanaman = sayuran.id_tanaman";
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String id = rs.getString("id_tanaman");
            String nama = rs.getString("nama_tanaman");
            String kondisi = rs.getString("kondisi_tanaman");
            String idAdmin = rs.getString("admin_id_admin");
            String metode = rs.getString("metode_penanaman");
            String musim = rs.getString("musim_tanam");
            Sayuran sayurBaru = new Sayuran(id, nama, kondisi, idAdmin, metode, musim);
            arraySayuran.add(sayurBaru);
        }return arraySayuran;
    }
    
    public static String[] getRow(String id) throws SQLException{
        String query = String.format("SELECT tanaman.*, sayuran.metode_penanaman, sayuran.musim_tanam FROM tanaman INNER JOIN sayuran ON tanaman.id_tanaman = sayuran.id_tanaman WHERE tanaman.id_tanaman = '%s'", id);
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String idtanaman = rs.getString("id_tanaman");
            String nama = rs.getString("nama_tanaman");
            String kondisi = rs.getString("kondisi_tanaman");
            String idAdmin = rs.getString("admin_id_admin");
            String metode = rs.getString("metode_penanaman");
            String musim = rs.getString("musim_tanam");
            Sayuran buahBaru = new Sayuran(idtanaman, nama, kondisi, idAdmin, metode, musim);
            String[] rowData = {buahBaru.getId(),buahBaru.getNama(),buahBaru.getKondisiTanaman(),buahBaru.getAdminId(),buahBaru.getMetodePenanaman(),buahBaru.getMusimTanam()};
            return rowData;
        }
        return null;
    }
    
    public static void createsayur(String idtanaman, String nama, String kondisiTanaman, String idadmin, String metodePenanaman, String musimTanam) throws SQLException{
        Sayuran sayuranBaru = new Sayuran(idtanaman, nama, kondisiTanaman, idadmin, metodePenanaman, musimTanam);
        arraySayuran.add(sayuranBaru);
        String query = String.format("INSERT INTO sayuran VALUES ('%s','%s','%s')",
                sayuranBaru.getId(),sayuranBaru.getMetodePenanaman(),sayuranBaru.getMusimTanam());
        db.executeUpdateQuery(query);
    }
   
    public static void deletesayur(String idsayur) throws SQLException{
        for (Sayuran sayuran : arraySayuran) {
            if (sayuran.getId().equals(idsayur)) {
                arraySayuran.remove(sayuran);
                String query = String.format("DELETE FROM sayuran WHERE id_tanaman = '%s'", sayuran.getId());
                db.executeUpdateQuery(query);
                break;
            }
        }
    }
    
    public static void updatesayuran(String idsayur, String metodePenanaman, String musimTanam) throws SQLException{
        for (Sayuran sayuran : arraySayuran) {
            if (sayuran.getId().equals(idsayur)) {
                sayuran.setMetodePenanaman(metodePenanaman);
                sayuran.setMusimTanam(musimTanam);
                String query = String.format("UPDATE sayuran SET metode_penanaman = '%s', musim_tanam = '%s' WHERE id_tanaman = '%s' ",
                        sayuran.getMetodePenanaman(),sayuran.getMusimTanam(),sayuran.getId());
                db.executeUpdateQuery(query);
                break;
            }
        }
    }
}
