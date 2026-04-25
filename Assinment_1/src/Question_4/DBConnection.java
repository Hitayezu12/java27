import java.sql.*;

public class DBConnection {

    static Connection conn;

    static {
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkLogin(String user, String pass) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM users WHERE username=? AND password=?");
            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void register(String user, String pass) {
        try {
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users(username, password) VALUES(?, ?)");
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}