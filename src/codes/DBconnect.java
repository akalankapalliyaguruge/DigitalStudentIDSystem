package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBconnect {

    public static Connection connect() {
        Connection conn = null;

        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/digitalstudentidsystem", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return conn;
    }

}
