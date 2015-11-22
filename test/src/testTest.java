/**
 * Created by h on 21.11.15.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testTest {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/forJava";
    private static final String user = "root";
    private static final String password = "123";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;


    public static void main(String args[]) {
        String query = "INSERT INTO Books (id, name, author) \\n\" +\n" +
                "               \" VALUES (3, 'Head First Java', 'Kathy Sieara');";


        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt.executeUpdate(query);




        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
            try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }

        }
    }




}
