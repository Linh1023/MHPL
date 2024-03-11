/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.CourseInstructor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DAL_CourseInstructor extends MyDatabaseManager {

    public DAL_CourseInstructor() {
        DAL_CourseInstructor.connectDB();
    }

    public ArrayList readCourseInstructor() throws SQLException {
        String query = "SELECT courseinstructor.CourseID,course.Title,courseinstructor.PersonID, CONCAT(person.Firstname,' ',person.Lastname) as Name FROM courseinstructor"
                + " LEFT JOIN course ON courseinstructor.CourseID = course.CourseID"
                + " LEFT JOIN person ON courseinstructor.PersonID = person.PersonID";
        ArrayList<CourseInstructor> list = new ArrayList();
        ResultSet rs = DAL_CourseInstructor.doReadQuery(query);
        if (rs != null) {
            while (rs.next()) {
                CourseInstructor ci = new CourseInstructor();
                ci.setCourseID(rs.getInt("CourseID"));
                ci.setCourseTitle(rs.getString("Title"));
                ci.setPersonID(rs.getInt("PersonID"));
                ci.setPersonName(rs.getString("Name"));
                list.add(ci);
            }
        }
        return list;
    }

    public int insertCourseInstructor(int courseID, int personID) throws SQLException {
        String query = "INSERT INTO courseinstructor (CourseID, PersonID) VALUES (?,?)";
        PreparedStatement ps = DAL_CourseInstructor.getConnection().prepareStatement(query);
        ps.setInt(1, courseID);
        ps.setInt(2, personID);
        int result = ps.executeUpdate();
        return result;
    }

    public int updateCourseInstructor(int courseID, int personID, int newPersonID) throws SQLException {
        String query = "Update courseinstructor SET PersonID = ? "
                + " WHERE CourseID = ? AND PersonID = ?";
        PreparedStatement p = DAL_CourseInstructor.getConnection().prepareStatement(query);
        p.setInt(1, newPersonID);
        p.setInt(2, courseID);
        p.setInt(3, personID);
        int result = p.executeUpdate();
        return result;
    }

    public int deleteCourseInstructor(int courseID, int personID) throws SQLException {
        String query = "DELETE FROM courseinstructor WHERE CourseID = ? AND PersonID = ?";
        PreparedStatement ps = DAL_CourseInstructor.getConnection().prepareStatement(query);
        ps.setInt(1, courseID);
        ps.setInt(2, personID);
        int result = ps.executeUpdate();
        return result;
    }

    public ArrayList searchCourseInstructor(String keyword, int selected) throws SQLException {
        String query = "SELECT courseinstructor.CourseID,course.Title,courseinstructor.PersonID, CONCAT(person.Firstname,' ',person.Lastname) as Name FROM courseinstructor"
                + " LEFT JOIN course ON courseinstructor.CourseID = course.CourseID"
                + " LEFT JOIN person ON courseinstructor.PersonID = person.PersonID";
        switch (selected) {
            case 0:
                query += " WHERE course.Title LIKE ? ";
                break;
            case 1:
                query += " WHERE CONCAT(person.Firstname,' ',person.Lastname) LIKE ? ";
                break;
            case 2:
                query += " WHERE courseinstructor.CourseID LIKE ? ";
                break;
            case 3:
                query += " WHERE courseinstructor.PersonID LIKE ? ";
                break;
            default:
                throw new AssertionError();
        }
        PreparedStatement p = DAL_CourseInstructor.getConnection().prepareStatement(query);
        p.setString(1, "%" + keyword + "%");
        ResultSet rs = p.executeQuery();
        ArrayList list = new ArrayList();
        if (rs != null) {
            while (rs.next()) {
                CourseInstructor ci = new CourseInstructor();
                ci.setCourseID(rs.getInt("CourseID"));
                ci.setCourseTitle(rs.getString("Title"));
                ci.setPersonID(rs.getInt("PersonID"));
                ci.setPersonName(rs.getString("Name"));
                list.add(ci);
            }
        }
        return list;
    }

}
