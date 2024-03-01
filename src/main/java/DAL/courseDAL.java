/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CourseDAL extends MyDatabaseManager {

    public CourseDAL() {
        CourseDAL.connectDB();
    }

    public int insertCourse(Course s) throws SQLException {
        String query = "INSERT  course ( Title, Credits,DepartmentID) VALUES ( ?,?, ?)";
        PreparedStatement p = CourseDAL.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        p.setString(1, s.getTitle());
        p.setInt(2, s.getCredits());
        p.setInt(3, s.getDepartmentID());
        if (p.executeUpdate() > 0) {
            System.out.println("DAL insert course");
            ResultSet generatedKeys = p.getGeneratedKeys();
            if (generatedKeys.next()) {
                int newId = generatedKeys.getInt(1);
                return newId;
            }
        }
        return 0;
    }

    public int updateCourse(Course s) throws SQLException {
        String query = "Update course SET Title = ? , Credits = ?,DepartmentID=? "
                + " WHERE courseID  = ?";
        PreparedStatement p = CourseDAL.getConnection().prepareStatement(query);
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
        ResultSet rs = CourseDAL.doReadQuery(query);
        ArrayList list = new ArrayList();

        if (rs != null) {
            while (rs.next()) {
                Course s = new Course();

                s.setCourseId(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setCredits(rs.getInt("credits"));
                s.setDepartmentID(rs.getInt("DepartmentId"));

                list.add(s);
            }
        } else {
            list = null;
        }
        System.out.println("DAL read course");
        return list;
    }

    public ArrayList readCourseFull() throws SQLException {
        String query = "select a.CourseID ,a.Title,a.Credits,a.DepartmentID,b.url, c.Location, c.Days, c.Time "
                + "from course as a "
                + "Left join onlinecourse as b on a.CourseID =b.CourseID "
                + "left join onsitecourse as c on a.CourseID =c.CourseID;";
        return readCourseFull(query);
    }

    public ArrayList readCourseFull(String query) throws SQLException {
        ResultSet rs = CourseDAL.doReadQuery(query);
        ArrayList list = new ArrayList();
        if (rs != null) {
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
        }
        

        return list;
    }

    public ArrayList find(String text, int type) {
        String query = null;
        if (type == 0) {
            query = "SELECT a.CourseID, a.Title, a.Credits, a.DepartmentID, b.url, c.Location, c.Days, c.Time "
                    + "FROM course AS a "
                    + "LEFT JOIN onlinecourse AS b ON a.CourseID = b.CourseID "
                    + "LEFT JOIN onsitecourse AS c ON a.CourseID = c.CourseID "
                    + "WHERE LOWER(a.Title) LIKE '%" + text + "%';";
            System.out.println(query);
        }
        if (type == 1) {
            query = "SELECT a.CourseID, a.Title, a.Credits, a.DepartmentID, b.url, c.Location, c.Days, c.Time "
                    + "FROM course AS a "
                    + "LEFT JOIN onlinecourse AS b ON a.CourseID = b.CourseID "
                    + "LEFT JOIN onsitecourse AS c ON a.CourseID = c.CourseID "
                    + "WHERE a.Credits = "+text + ";";
        }
        if (type == 2) {
            query = "SELECT a.CourseID, a.Title, a.Credits, a.DepartmentID, b.url, c.Location, c.Days, c.Time "
                    + "FROM course AS a "
                    + "LEFT JOIN onlinecourse AS b ON a.CourseID = b.CourseID "
                    + "LEFT JOIN onsitecourse AS c ON a.CourseID = c.CourseID "
                    + "WHERE a.DepartmentID = "+text + ";";
        }
        if (type == 3) {
            query = "SELECT a.CourseID, a.Title, a.Credits, a.DepartmentID, b.url, c.Location, c.Days, c.Time "
                    + "FROM course AS a "
                    + "LEFT JOIN onsitecourse AS c ON a.CourseID = c.CourseID "
                    + "LEFT JOIN onlinecourse AS b ON a.CourseID = b.CourseID "
                    + "WHERE b.url IS NOT NULL";
        }
        if (type == 4) {
            query = "SELECT a.CourseID, a.Title, a.Credits, a.DepartmentID, b.url, c.Location, c.Days, c.Time "
                    + "FROM course AS a "
                    + "LEFT JOIN onsitecourse AS c ON a.CourseID = c.CourseID "
                    + "LEFT JOIN onlinecourse AS b ON a.CourseID = b.CourseID "
                    + "WHERE c.Location IS NOT NULL";
        }
        try {
            return readCourseFull(query);
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
