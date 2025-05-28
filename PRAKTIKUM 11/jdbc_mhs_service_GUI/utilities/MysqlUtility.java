package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLUtility {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_mhs";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        Connection koneksi = null;
        try {
            koneksi = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Koneksi berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
            throw e;
        }
        return koneksi;
    }

    public static void closeConnection(Connection koneksi) {
        if (koneksi != null) {
            try {
                koneksi.close();
            } catch (SQLException e) {
                System.out.println("Error saat menutup koneksi: " + e.getMessage());
            }
        }
    }
}
