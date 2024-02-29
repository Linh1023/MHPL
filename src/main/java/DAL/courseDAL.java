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

public class courseDAL extends MyDatabaseManager {

    public courseDAL() {
        courseDAL.connectDB();
    }

    public int insertCourse(course s) throws SQLException {
        String query = "INSERT  course ( Title, Credits,DepartmentID) VALUES ( ?,?, ?)";
        PreparedStatement p = courseDAL.getConnection().prepareStatement(query);
        p.setString(1, s.getTitle());
        p.setInt(2, s.getCredits());
        p.setInt(3, s.getDepartmentID());
        int result = p.executeUpdate();
        System.out.println("DAL insert course");
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
        System.out.println("DAL update course");
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
        System.out.println("DAL read course");
        return list;
    }

    public ArrayList readCourseFull() throws SQLException {
        String query = "select a.CourseID ,a.Title,a.Credits,a.DepartmentID,b.url, c.Location, c.Days, c.Time "
                + "from course as a "
                + "Left join onlinecourse as b on a.CourseID =b.CourseID "
                + "left join onsitecourse as c on a.CourseID =c.CourseID;";
        ResultSet rs = courseDAL.doReadQuery(query);
        ArrayList list = new ArrayList();

        while (rs.next()) {
            list.add(new Object[]{
                rs.getInt("CourseID"),
                rs.getString("Title"),
                rs.getInt("Credits"),
                rs.getString("DepartmentID"),
                rs.getString("url"),
                rs.getString("Location"),
                rs.getString("Days"),
                rs.getString("Time")
            });
        }
        return list;
    }

}
