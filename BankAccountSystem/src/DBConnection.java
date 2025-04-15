// DBConnection.java
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:bank.db");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
