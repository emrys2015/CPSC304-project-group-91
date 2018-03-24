import oracle.jdbc.OracleDriver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class DBDriver implements ActionListener {
    public void Driver(){
        try
        {
            // Load the Oracle JDBC driver
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            // may be oracle.jdbc.driver.OracleDriver as of Oracle 11g
        }
        catch (SQLException ex)
        {
            System.out.println("Message: " + ex.getMessage());
            System.exit(-1);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
