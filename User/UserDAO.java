package User;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DbConnection.DbConnection;

public class UserDAO {

    public void addUser(User user) {
        String sql = "INSERT INTO accounts (username, userpass, useremail, userrole) VALUES (?, ?, ?, ?)";

        try (Connection postgresConnection = DbConnection.getConnection();){
            
            PreparedStatement pStatement = postgresConnection.prepareStatement(sql);

            pStatement.setString(1, user.getUsername());
            pStatement.setString(2, user.getPassword());
            pStatement.setString(3, user.getEmail());
            pStatement.setString(4, user.getRole());

            pStatement.executeUpdate()  ;

        } catch (Exception e) {
            System.err.println("Connection to database failed");
        }
    }
}
