package helpers;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class MySqlDB {

    //JDBC driver name
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    ResultSet rs;
    Connection conn;
    Statement stmt;


    public ResultSet executeQuery(String sqlQuery, String databaseName) throws IOException, SQLException {

        FileReader reader = new FileReader("conf/mysqlDbConf.properties");
        Properties p = new Properties();
        p.load(reader);
        String DB_URL = "jdbc:mysql://" + p.getProperty("database.hostname") + "/" + databaseName;
        conn = null;
        stmt = null;
        rs = null;

        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = (Connection) DriverManager.getConnection(DB_URL, p.getProperty("database.username"), p.getProperty("database.password"));

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlQuery);
                //stmt.executeUpdate(sqlQuery);
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } /*finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }*///end try

        return rs;
    }
    public int updateQuery( String sqlQuery, String databaseName) throws IOException {

        FileReader reader = new FileReader("conf/mysqlDbConf.properties");
        Properties p = new Properties();
        p.load(reader);
        String DB_URL = "jdbc:mysql://" + p.getProperty("database.hostname") + "/" + databaseName;
        conn = null;
        stmt = null;
        int i=-5;

        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = (Connection) DriverManager.getConnection(DB_URL, p.getProperty("database.username"), p.getProperty("database.password"));

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
                i= stmt.executeUpdate(sqlQuery);


        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return i;
    }


    public void closeConnection() throws SQLException {

        //STEP 5: Clean-up environment
        //rs.close();
        stmt.close();
        conn.close();
        System.out.println("Closing DB connection and  statement");
    }


}
