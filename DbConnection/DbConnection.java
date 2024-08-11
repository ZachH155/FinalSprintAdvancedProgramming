package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static final String URL = "jbdc:postgresql://localhost:5432FinalSprintdatabase";
    public static final String USER = "postgres";
    public static final String PASSWORD = "Postgres312"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}