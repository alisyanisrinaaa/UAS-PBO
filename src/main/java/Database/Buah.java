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
public final class Buah extends Tanaman{
    private  String bentukBuah;
    private  String tingkatKematangan;
    private static Connection con;
    private static Statement st;
    
    static database.Database db = new database.Database();
    static ArrayList<Buah> arraybuah = new ArrayList<>();
    
    public Buah(String idtanaman, String nama, String kondisiTanaman, String idadmin, String bentukBuah, String tingkatKematangan) {
    super(idtanaman, nama, kondisiTanaman, idadmin);
    this.bentukBuah = bentukBuah;
    this.tingkatKematangan = tingkatKematangan;
    }

    public String getBentukBuah() {
        return bentukBuah;
    }

    public void setBentukBuah(String bentukBuah) {
        this.bentukBuah = bentukBuah;
    }

    public String getTingkatKematangan() {
        return tingkatKematangan;
    }

    public void setTingkatKematangan(String tingkatKematangan) {
        this.tingkatKematangan = tingkatKematangan;
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

    

    
    
    
    
    public static ArrayList<Buah> readBuah() throws SQLException{
        arraybuah.clear();
        String query = "SELECT tanaman.*, buah.bentuk_buah, buah.tingkat_kematangan FROM tanaman INNER JOIN buah ON tanaman.id_tanaman = buah.id_tanaman";
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String idtanaman = rs.getString("id_tanaman");
            String nama = rs.getString("nama_tanaman");
            String kondisi = rs.getString("kondisi_tanaman");
            String idAdmin = rs.getString("admin_id_admin");
            String bentuk = rs.getString("bentuk_buah");
            String tingkat = rs.getString("tingkat_kematangan");
            Buah buahBaru = new Buah(idtanaman, nama, kondisi, idAdmin, bentuk, tingkat);
            arraybuah.add(buahBaru);
        }return arraybuah;
    }
    
    public static String[] getRow(String id) throws SQLException{
        String query = String.format("SELECT tanaman.*, buah.bentuk_buah, buah.tingkat_kematangan FROM tanaman INNER JOIN buah ON tanaman.id_tanaman = buah.id_tanaman WHERE tanaman.id_tanaman = '%s'", id);
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String idtanaman = rs.getString("id_tanaman");
            String nama = rs.getString("nama_tanaman");
            String kondisi = rs.getString("kondisi_tanaman");
            String idAdmin = rs.getString("admin_id_admin");
            String bentuk = rs.getString("bentuk_buah");
            String tingkat = rs.getString("tingkat_kematangan");
            Buah buahBaru = new Buah(idtanaman, nama, kondisi, idAdmin, bentuk, tingkat);
            String[] rowData = {buahBaru.getId(),buahBaru.getNama(),buahBaru.getKondisiTanaman(),buahBaru.getAdminId(),buahBaru.getBentukBuah(),buahBaru.getTingkatKematangan()};
            return rowData;
        }
        return null;
    }
    
    public static void createbuah(String idtanaman, String nama, String kondisiTanaman, String idadmin, String bentukBuah, String tingkatKematangan) throws SQLException{
        Buah BuahBaru = new Buah(idtanaman, nama, kondisiTanaman, idadmin, bentukBuah, tingkatKematangan);
        arraybuah.add(BuahBaru);
        String query = String.format("INSERT INTO buah VALUES ('%s','%s','%s')",
                BuahBaru.getId(),BuahBaru.getBentukBuah(),BuahBaru.getTingkatKematangan());
        db.executeUpdateQuery(query);
    }
    
    public static void deletebuah(String idBuah) throws SQLException{
        for (Buah buah : arraybuah) {
            if (buah.getId().equals(idBuah)) {
                arraybuah.remove(buah);
                String query = String.format("DELETE FROM buah WHERE id_tanaman = '%s'", buah.getId());
                db.executeUpdateQuery(query);
                break;
            }
        }
    }
    
    public static void updatebuah(String idBuah, String bentuk, String tingkat) throws SQLException{
        for (Buah buah : arraybuah) {
            if (buah.getId().equals(idBuah)) {
                buah.setBentukBuah(bentuk);
                buah.setTingkatKematangan(tingkat);
                String query = String.format("UPDATE buah SET bentuk_buah = '%s', tingkat_kematangan = '%s' WHERE id_tanaman = '%s' ",
                        buah.getBentukBuah(),buah.getTingkatKematangan(),buah.getId());
                db.executeUpdateQuery(query);
                break;
            }
        }
    }
    
}
