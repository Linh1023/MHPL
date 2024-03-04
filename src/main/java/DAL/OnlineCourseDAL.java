/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;


import BLL.OnlineCourse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OnlineCourseDAL extends MyDatabaseManager {

    public OnlineCourseDAL() {
        OnlineCourseDAL.connectDB();
    }

    public int insertCourse(OnlineCourse s) throws SQLException {
        String query = "INSERT  onlinecourse ( CourseID, url) VALUES (?,?)";
        PreparedStatement p = OnlineCourseDAL.getConnection().prepareStatement(query);
        p.setInt(1, s.getCourseId());
        p.setString(2, s.getUrl());
        int result = p.executeUpdate();
        System.out.println("DAL insert courseonline");
        return result;
    }

    public int updateCourse(OnlineCourse s) throws SQLException {
        String query = "Update onlinecourse SET url = ?"
                + " WHERE courseID  = ?";
        PreparedStatement p = OnlineCourseDAL.getConnection().prepareStatement(query);
        p.setString(1, s.getUrl());
        p.setInt(2, s.getCourseId());
        int result = p.executeUpdate();
        System.out.println("DAL update courseonline");
        return result;
    }

    public ArrayList readCourse() throws SQLException {
        String query = "SELECT * FROM onlinecourse ";
        ResultSet rs = OnlineCourseDAL.doReadQuery(query);
        ArrayList list = new ArrayList();
        if (rs != null) {
            while (rs.next()) {
                OnlineCourse s = new OnlineCourse();
                s.setCourseId(rs.getInt("CourseID"));
                s.setUrl(rs.getString("url"));
                list.add(s);
            }
        }
        System.out.println("DAL read courseonline");
        return list;
    }
    public int DeleteCourse(int courseID) throws SQLException {
        String query = "DELETE FROM onlinecourse WHERE courseID = ?";
        PreparedStatement p = CourseDAL.getConnection().prepareStatement(query);
        p.setInt(1, courseID);
        int result = p.executeUpdate();

        return result;
    }

}
