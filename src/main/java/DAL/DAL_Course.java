/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.Course;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAL_Course extends MyDatabaseManager {

    public DAL_Course() {
        DAL_Course.connectDB();
    }

    public int insertCourse(Course s) throws SQLException {
        String query = "INSERT  course ( Title, Credits,DepartmentID) VALUES ( ?,?, ?)";
                System.out.println(query);
        PreparedStatement p = DAL_Course.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
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
        PreparedStatement p = DAL_Course.getConnection().prepareStatement(query);
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
        ResultSet rs = DAL_Course.doReadQuery(query);
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
        System.out.println(query);
        ResultSet rs = DAL_Course.doReadQuery(query);
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

    public ArrayList find(int type) {
        String query = "SELECT a.CourseID, a.Title, a.Credits, a.DepartmentID ";
        if (type == 0) {
            query += ",b.url ,c.Location,c.Days,c.Time "
                    + "From course as a "
                    + "LEFT JOIN onsitecourse AS c ON a.CourseID = c.CourseID "
                    + "LEFT JOIN onlinecourse AS b ON a.CourseID = b.CourseID ";
        }
        if (type == 1) {
            query += ",c.Location,c.Days,c.Time ,NUll as url "
                    + "From course as a "
                    + "RIGHT JOIN onsitecourse AS c ON a.CourseID = c.CourseID ";
        }
        if (type == 2) {
            query += ", b.url ,NULL AS Location,NULL AS Days,NULL AS Time "
                    + "From course as a "
                    + "RIGHT JOIN onlinecourse AS b ON a.CourseID = b.CourseID ";
        }
        try {
            return readCourseFull(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAL_Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(query);
        return null;
    }

    public ArrayList find(String value, int filter, int type) {
        String query = "SELECT a.CourseID, a.Title, a.Credits, a.DepartmentID ";
        if (type == 0) {
            query += ",b.url ,c.Location,c.Days,c.Time "
                    + "From course as a "
                    + "LEFT JOIN onsitecourse AS c ON a.CourseID = c.CourseID "
                    + "LEFT JOIN onlinecourse AS b ON a.CourseID = b.CourseID ";
        }
        if (type == 1) {
            query += ",c.Location,c.Days,c.Time ,NUll as url "
                    + "From course as a "
                    + "RIGHT JOIN onsitecourse AS c ON a.CourseID = c.CourseID ";
        }
        if (type == 2) {
            query += ", b.url ,NULL AS Location,NULL AS Days,NULL AS Time "
                    + "From course as a "
                    + "RIGHT JOIN onlinecourse AS b ON a.CourseID = b.CourseID ";
        }

        if (filter == 0) {
            query += "WHERE a.Title LIKE '%" + value + "%';";
        } else {
            if (filter == 1) {
                query += "WHERE a.Credits = " + value + ";";
            } else if (filter == 2) {
                query += "WHERE a.DepartmentID = " + value + ";";
            }
        }
        try {
            return readCourseFull(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAL_Course.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean DeleteCourse(int courseID) throws SQLException {
        String query = "DELETE FROM course WHERE courseID = ?";
        System.out.println(query);
        PreparedStatement p = DAL_Course.getConnection().prepareStatement(query);
        p.setInt(1, courseID);
        p.executeUpdate();
        return true;
    }

    public Course getCourse(int courseID) throws SQLException {
        String query = "SELECT * FROM Course WHERE CourseID = ? ";
        System.out.println(query);

        PreparedStatement p = DAL_Instructor.getConnection().prepareStatement(query);
        p.setInt(1, courseID);
        ResultSet rs = p.executeQuery();

        Course s = new Course();
        if (rs != null) {
            while (rs.next()) {
                s.setCourseId(rs.getInt("CourseID"));
                s.setTitle(rs.getString("Title"));
                s.setCredits(rs.getInt("Credits"));
                s.setDepartmentID(rs.getInt("DepartmentID"));
            }
        }
        return s;
    }


    public boolean InCourseIntructor(int courseID) throws SQLException {
        String query = "SELECT * FROM courseinstructor WHERE CourseID = ?";
        System.out.println(query);
        PreparedStatement p = DAL_Course.getConnection().prepareStatement(query);
        p.setInt(1, courseID);
        ResultSet result = p.executeQuery();
        if (result.next()) {
            return true;
        } else {
            return false;
        }
    }
}
