/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.Instructor;
import java.sql.PreparedStatement;
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
                Instructor i = new Instructor();
                i.setPersonID(rs.getInt("PersonID"));
                i.setFirstName(rs.getString("FirstName"));
                i.setLastName(rs.getString("LastName"));
                i.setHireDate(rs.getDate("HireDate"));
                list.add(i);
            }
        }
        return list;
    }
    
    public ArrayList readInstructorNotInCI(int courseID) throws SQLException {
        String query = "SELECT * FROM person WHERE PersonID NOT IN (SELECT PersonID from courseinstructor WHERE CourseID = ? )AND HireDate > 0";
        PreparedStatement ps = DAL_Instructor.getConnection().prepareStatement(query);
        ps.setInt(1, courseID);
        ResultSet rs = ps.executeQuery();
        ArrayList list = new ArrayList();
        if (rs != null) {
            while (rs.next()) {
                Instructor s = new Instructor();

                s.setPersonID(rs.getInt("PersonID"));
                s.setFirstName(rs.getString("FirstName"));
                s.setLastName(rs.getString("LastName"));
                s.setHireDate(rs.getDate("HireDate"));
                
                list.add(s);
            }
        }
        return list;
    }
    
    public Instructor getInstructor(int personID) throws SQLException {
        String query = "SELECT * FROM Person WHERE HireDate >0 AND PersonID = ? ";

        PreparedStatement p = DAL_Instructor.getConnection().prepareStatement(query);
        p.setInt(1, personID);
        ResultSet rs = p.executeQuery();
        
        Instructor s = new Instructor();
        if (rs != null) {
            while (rs.next()) {
                s.setPersonID(rs.getInt("PersonID"));
                s.setFirstName(rs.getString("FirstName"));
                s.setLastName(rs.getString("LastName"));
                s.setHireDate(rs.getDate("HireDate"));
            }
        }
        return s;
    }
}
