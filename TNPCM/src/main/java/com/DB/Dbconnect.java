package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnect {

    private static Connection conn;

    public static Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tnpcm", "root", "root");
                System.out.println("Connected to the database");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
}

/*ptplt
 * package com.DB;
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.SQLException;
 * 
 * public class Dbconnect {
 * 
 * 
 * private static Connection conn; public static Connection getConn() { try { if
 * (conn == null || conn.isClosed()) { // Check if the connection is null or
 * closed Class.forName("com.mysql.cj.jdbc.Driver"); conn =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/tnpcm", "root",
 * "root"); System.out.println("Connected to the database"); } } catch
 * (ClassNotFoundException e) { e.printStackTrace();
 * System.err.println("MySQL JDBC Driver not found"); } catch (SQLException e) {
 * e.printStackTrace(); System.err.println("Database connection error"); }
 * 
 * return conn; }
 * 
 * }
 */
/*
 * private static Connection conn;
 * 
 * public static Connection getConn() { try { if (conn == null) {
 * Class.forName("com.mysql.cj.jdbc.Driver"); conn =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/tnpcm", "root",
 * "root"); System.out.println("SUCCESS"); } System.out.println("success"); }
 * catch (ClassNotFoundException e) { e.printStackTrace(); } catch (SQLException
 * e) { e.printStackTrace(); }
 * 
 * return conn; }
 */