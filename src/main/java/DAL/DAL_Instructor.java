/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.DTO_Instructor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class DAL_Instructor extends MyDatabaseManager{
    public DAL_Instructor() {
        DAL_Instructor.connectDB();
    }
    
    public ArrayList readInstructors() throws SQLException {
        String query = "SELECT * FROM Person WHERE HireDate > 0 ";
        ResultSet rs = DAL_Instructor.doReadQuery(query);
        ArrayList list = new ArrayList();
        if(rs != null) {
            while(rs.next()) {
                DTO_Instructor i = new DTO_Instructor();
                i.setPersonID(rs.getInt("PersonID"));
                i.setFirstName(rs.getString("FirstName"));
                i.setLastName(rs.getString("LastName"));
                i.setHireDate(rs.getDate("HireDate"));
                list.add(i);
            }
        }
        return list;
    }
}
