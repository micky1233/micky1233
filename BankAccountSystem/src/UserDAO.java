import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    Connection conn;

    public UserDAO() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_system", "root", "Michael@123"); // replace yourpassword
            System.out.println("Connected to DB.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean signup(String email, String password) {
        try {
            String sql = "INSERT INTO users (email, password) VALUES (?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email.trim());
            pst.setString(2, password.trim());
            int result = pst.executeUpdate();
            System.out.println("Signup rows: " + result);
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean login(String email, String password) {
        try {
            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, email.trim());
            pst.setString(2, password.trim());
            ResultSet rs = pst.executeQuery();
            boolean success = rs.next();
            System.out.println("Login success: " + success);
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
