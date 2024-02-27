/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ConnectToSQL {
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
  
    public static void main(String[] args) {
    Connection conn = ConnectToSQL.conn();
        System.out.println(conn);
    }
    
}
