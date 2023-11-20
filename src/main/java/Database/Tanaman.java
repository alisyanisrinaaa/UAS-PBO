/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;



import java.sql.*;
import java.util.ArrayList;



/**
 *
 * @author fx506
 */
public class Tanaman {

    public String id;
    public  String nama;
    public  String kondisiTanaman;
    public  String adminId;
    private static Connection con;
    private static Statement st;
    
    static database.Database db = new database.Database();
    static ArrayList<Tanaman> arrayTanaman = new ArrayList<>();
    
    
    public Tanaman(String id, String nama, String kondisiTanaman,String idAdmin){
        this.id = id;
        this.nama = nama;
        this.kondisiTanaman = kondisiTanaman;
        this.adminId = idAdmin;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getKondisiTanaman() {
        return kondisiTanaman;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKondisiTanaman(String kondisiTanaman) {
        this.kondisiTanaman = kondisiTanaman;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }
    
    public static ArrayList<Tanaman> readTanaman() throws SQLException{
        arrayTanaman.clear();
        String query = "SELECT * FROM Tanaman";
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String id = rs.getString("id_tanaman");
            String nama = rs.getString("nama_tanaman");
            String kondisi = rs.getString("kondisi_tanaman");
            String idAdmin = rs.getString("admin_id_admin");
            Tanaman barangBaru = new Tanaman(id, nama, kondisi, idAdmin);
            arrayTanaman.add(barangBaru);
        }return arrayTanaman;
    }
    
    public static void createTanaman(String idTanaman, String namaTanaman, String kondisiTanaman,String idAdmin) throws SQLException{
        Tanaman tanamanBaru = new Tanaman(idTanaman, namaTanaman, kondisiTanaman, idAdmin);
        arrayTanaman.add(tanamanBaru);
        String query = String.format("INSERT INTO tanaman VALUES ('%s','%s','%s','%s')",
                tanamanBaru.getId(),tanamanBaru.getNama(),tanamanBaru.getKondisiTanaman(),tanamanBaru.getAdminId());
        db.executeUpdateQuery(query);
    }
    
    public static void deleteTanaman(String id) throws SQLException{
        for (Tanaman tanaman : arrayTanaman) {
            if (tanaman.getId().equals(id)) {
                arrayTanaman.remove(tanaman);
                String query = String.format("DELETE FROM tanaman WHERE id_tanaman = '%s'", tanaman.getId());
                db.executeUpdateQuery(query);
                break;
            }
        }
    }
    
    public static void updateTanaman(String idTanaman, String namaTanaman, String kondisiTanaman) throws SQLException{
        for (Tanaman tanaman : arrayTanaman) {
            if (tanaman.getId().equals(idTanaman)) {
                tanaman.setNama(namaTanaman);
                tanaman.setKondisiTanaman(kondisiTanaman);
                String query = String.format("UPDATE tanaman SET nama_tanaman = '%s', kondisi_tanaman = '%s' WHERE id_tanaman = '%s' ",
                        tanaman.getNama(),tanaman.getKondisiTanaman(),tanaman.getId());
                db.executeUpdateQuery(query);
                break;
            }
        }
    }
}
