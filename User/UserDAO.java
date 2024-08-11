package User;

public class UserDAO {

    public void addUser(User user) {
        String sql = "INSERT INTO accounts (username, userpass, useremail, userrole) VALUES (?, ?, ?, ?)";

        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
