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

}
