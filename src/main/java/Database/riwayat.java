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
public class riwayat {
    private String tanggaltanam;
    private String jumlahtanam;
    private String idkaryawan;
    private String idtanaman;
    
    static database.Database db = new database.Database();
    static ArrayList<riwayat> arrayriwayattanam = new ArrayList<>();
    
    public riwayat(String tanggaltanam, String jumlahtanam, String idkaryawan, String idtanaman){
        this.tanggaltanam = tanggaltanam;
        this.jumlahtanam = jumlahtanam;
        this.idkaryawan = idkaryawan;
        this.idtanaman = idtanaman;
    }

    public String getTanggaltanam() {
        return tanggaltanam;
    }

    public String getJumlahtanam() {
        return jumlahtanam;
    }

    public String getIdkaryawan() {
        return idkaryawan;
    }

    public String getIdtanaman() {
        return idtanaman;
    }

    public static ArrayList<riwayat> readriwayat() throws SQLException{
        arrayriwayattanam.clear();
        String query = "SELECT * FROM riwayat_tanam";
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String tanggal_tanam = rs.getString("tanggal_tanam");
            String jumlah_tanam = rs.getString("jumlah_tanam");
            String idkaryawan = rs.getString("karyawan_id_karyawan");
            String idtanaman = rs.getString("tanaman_id_tanaman");
            riwayat riwayatbaru = new riwayat(tanggal_tanam, jumlah_tanam, idkaryawan, idtanaman);
            arrayriwayattanam.add(riwayatbaru);
        }return arrayriwayattanam;
    }
    
    public static void createriwayat(String tanggal_tanam, String jumlah_tanam, String idkaryawan,String idtanaman) throws SQLException{
        riwayat riwayatbaru = new riwayat(tanggal_tanam, jumlah_tanam, idkaryawan, idtanaman);
        arrayriwayattanam.add(riwayatbaru);
        String query = String.format("INSERT INTO riwayat_tanam VALUES ('%s','%s','%s','%s')",
                riwayatbaru.getTanggaltanam(),riwayatbaru.getJumlahtanam(),riwayatbaru.getIdkaryawan(),riwayatbaru.getIdtanaman());
        db.executeUpdateQuery(query);
    }    
    
}
