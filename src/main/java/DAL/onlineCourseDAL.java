/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class onlineCourseDAL extends MyDatabaseManager {

    public onlineCourseDAL() {
        onlineCourseDAL.connectDB();
    }

    public int insertCourse(onlineCourse s) throws SQLException {
        String query = "INSERT  onlinecourse ( url) VALUES (?)";
        PreparedStatement p = onlineCourseDAL.getConnection().prepareStatement(query);
        p.setString(1, s.getUrl());
        p.setInt(2, s.getCourseId());
        int result = p.executeUpdate();
        System.out.println("DAL insert courseonline");
        return result;
    }

    public int updateCourse(onlineCourse s) throws SQLException {
        String query = "Update onlinecourse SET url = ?"
                + " WHERE courseID  = ?";
        PreparedStatement p = onlineCourseDAL.getConnection().prepareStatement(query);
        p.setString(1, s.getUrl());
        p.setInt(2, s.getCourseId());
        int result = p.executeUpdate();
        System.out.println("DAL update courseonline");
        return result;
    }

    public ArrayList readCourse() throws SQLException {
        String query = "SELECT * FROM onlinecourse ";
        ResultSet rs = onlineCourseDAL.doReadQuery(query);
        ArrayList list = new ArrayList();
        if (rs != null) {
            while (rs.next()) {
                onlineCourse s = new onlineCourse();
                s.setCourseId(rs.getInt("CourseID"));
                s.setUrl(rs.getString("url"));
                list.add(s);
            }
        }
        System.out.println("DAL read courseonline");
        return list;
    }

}
