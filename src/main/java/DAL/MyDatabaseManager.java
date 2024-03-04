/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DO THE TUNG
 */
public class MyDatabaseManager {

    private static Connection c;
    private static Statement s;

    private static String host, port, dbName, dbUser, dbPassword;

    public static void connectDB() {
        host = "localhost";
        port = "3306";
        dbUser = "root";
        dbName = "school";
        dbPassword = "";
        String dbPath = "jdbc:mysql://" + host + ":" + port + "/"
                + dbName + "?useUnicode=yes&characterEncoding=UTF-8";
        try {
            c = (Connection) DriverManager.getConnection(dbPath, dbUser, dbPassword);
            s = c.createStatement();

            System.out.println("Connected DB");
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
    }
    public static Connection getConnection() {
        return c;
    }
    public static ResultSet doReadQuery(String sql) {
        ResultSet rs = null;

        try {
            rs = s.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(MyDatabaseManager.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static Connection conn () {
        try {
            String url = "jdbc:mysql://localhost:3306/school";
            String user = "root";
            String passWord = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,user,passWord);
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
  
    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MyDatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
