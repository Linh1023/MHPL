/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DAL.course;
/**
 *
 * @author DO THE TUNG
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class courseDAL extends MyDatabaseManager {

    public courseDAL() {
        courseDAL.connectDB();
    }

    public int insertCourse(course s) throws SQLException {
//        String query = "Insert course (courseI, LastName, EnrollmentDate) VALUES (?, ?, ?)";
        String query = "INSERT  course ( Title, Credits,DepartmentID) VALUES ( ?,?, ?)";
        PreparedStatement p = courseDAL.getConnection().prepareStatement(query);
//        p.setInt(1, s.getCourseId());
        p.setString(1, s.getTitle());
        p.setInt(2, s.getCredits());
        p.setInt(3, s.getDepartmentID());
        System.out.println("test" + p);
        int result = p.executeUpdate();
        return result;
    }

      public int updateCourse(course s) throws SQLException {
        String query = "Update course SET Title = ? , Credits = ?,DepartmentID=? "
                + " WHERE courseID  = ?";
        PreparedStatement p = courseDAL.getConnection().prepareStatement(query);
        p.setString(1, s.getTitle());
        p.setInt(2, s.getCredits());
        p.setInt(3, s.getDepartmentID());
        p.setInt(4, s.getCourseId());
        int result = p.executeUpdate();
          System.out.println("Lop DAL"+p);
        return result;
    }
      
      
    public ArrayList readCourse() throws SQLException {
        String query = "SELECT * FROM course ";
        ResultSet rs = courseDAL.doReadQuery(query);
        ArrayList list = new ArrayList();

        if (rs != null) {
            int i = 1;

            while (rs.next()) {
                course s = new course();

                s.setCourseId(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setCredits(rs.getInt("credits"));
                s.setDepartmentID(rs.getInt("DepartmentId"));

                list.add(s);
            }
        }
        return list;
    }
    
    
        public int deleteCourse(int courseID) throws SQLException {
        String query = "DELETE FROM course WHERE courseID = ?";
        PreparedStatement p = courseDAL.getConnection().prepareStatement(query);
        p.setInt(1, courseID);
        int result = p.executeUpdate();

        return result;
    }

  public List findcourses(String title) throws SQLException {
//        String query = "SELECT * FROM course WHERE concat(FirstName, ' ', LastName)  LIKE ?";
 String query = "SELECT * FROM course WHERE title  LIKE ?";
        PreparedStatement p = courseDAL.getConnection().prepareStatement(query);
        p.setString(1, "%" + title + "%");
        ResultSet rs = p.executeQuery();
        List list = new ArrayList();

        if (rs != null) {
            int i = 1;

            while (rs.next()) {
                course s = new course();
                s.setCourseId(rs.getInt("courseid"));
                s.setTitle(rs.getString("Title"));
                s.setCourseId(rs.getInt("credits"));
                s.setDepartmentID(rs.getInt("DepartmentID"));
                list.add(s);
            }
        }
        return list;
    }

}
