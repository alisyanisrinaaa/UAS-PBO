package Database;

import static Database.Karyawan.arrayKaryawan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;




public class Admin {
    private String idadmin;
    private String namaadmin;
    private String noHpadmin;
    private String usernameadmin;
    private String passwordadmin;
    private static Connection con;
    private static Statement st;

    static database.Database db = new database.Database();
    static ArrayList<Admin> arrayadmin = new ArrayList<>();

    public Admin(String idadmin, String namaadmin, String noHpadmin, String usernameadmin, String passwordadmin) {
        this.idadmin = idadmin;
        this.namaadmin = namaadmin;
        this.noHpadmin = noHpadmin;
        this.usernameadmin = usernameadmin;
        this.passwordadmin = passwordadmin;
    }

    public String getIdadmin() {
        return idadmin;
    }

    public String getNamaadmin() {
        return namaadmin;
    }

    public String getNoHpadmin() {
        return noHpadmin;
    }

    public String getUsernameadmin() {
        return usernameadmin;
    }

    public String getPasswordadmin() {
        return passwordadmin;
    }

    public static Connection getCon() {
        return con;
    }

    public static Statement getSt() {
        return st;
    }

    public static ArrayList<Admin> getArrayadmin() {
        return arrayadmin;
    }

   public static ArrayList<Admin> readadmin() throws SQLException{
        arrayadmin.clear();
        String query = "SELECT * FROM admin";
        ResultSet rs = db.executeSelectQuery(query);
                
        while (rs.next()) {            
            String id = rs.getString("id_admin");
            String nama = rs.getString("nama_admin");
            String nohp = rs.getString("nohp_admin");;
            String name = rs.getString("name");
            String password = rs.getString("password");

            Admin adminbaru = new Admin(id, nama, nohp, name, password);
            arrayadmin.add(adminbaru);
        }return arrayadmin;
    }
}
