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
public class Karyawan {
    private String id;
    private String nama;
    private String noHp;
    private String jabatan;
    private String idkaryawan;
    private String username;
    private String password;
    private static Connection con;
    private static Statement st;
    
    static database.Database db = new database.Database();
    static ArrayList<Karyawan> arrayKaryawan = new ArrayList<>();
    
    public Karyawan(String id, String nama, String noHp, String jabatan, String idkaryawan, String username, String password) {
        this.id = id;
        this.nama = nama;
        this.noHp = noHp;
        this.jabatan = jabatan;
        this.idkaryawan = idkaryawan;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getIdkaryawan() {
        return idkaryawan;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static Connection getCon() {
        return con;
    }

    public static Statement getSt() {
        return st;
    }

    public static ArrayList<Karyawan> getArrayKaryawan() {
        return arrayKaryawan;
    }

    
    
    public static ArrayList<Karyawan> readkaryawan() throws SQLException{
        arrayKaryawan.clear();
        String query = "SELECT * FROM karyawan";
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String id = rs.getString("id_karyawan");
            String nama = rs.getString("nama_karyawan");
            String nohp = rs.getString("nohp_karyawan");
            String jabatan = rs.getString("jabatan");
            String karyawan = rs.getString("karyawan_id_karyawan");
            String name = rs.getString("name");
            String password = rs.getString("password");

            Karyawan karyawanbaru = new Karyawan(id, nama, nohp, jabatan, karyawan, name, password);
            arrayKaryawan.add(karyawanbaru);
        }return arrayKaryawan;
    }
}
