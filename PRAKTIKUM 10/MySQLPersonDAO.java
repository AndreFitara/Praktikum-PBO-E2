import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * File      : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO menggunakan MySQL
 * Pembuat   : Andre Fitara Agun Ni'am Muta'ali
 * Tanggal   : 15/05/2025
 */

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/pbo","root","01122002andre");
        //kerjakan mysql query
        String query = "INSERT INTO PERSON(name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}