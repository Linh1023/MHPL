/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OnsiteCourseDAL extends MyDatabaseManager {

    public OnsiteCourseDAL() {
        OnsiteCourseDAL.connectDB();
    }

    public int insertCourse(OnsiteCourse s) throws SQLException {
        String query = "INSERT  onsitecourse ( CourseID ,Location, Days,Time) VALUES ( ?,?,?, ?)";
        PreparedStatement p = OnsiteCourseDAL.getConnection().prepareStatement(query);
        p.setInt(1, s.getCourseId());
        p.setString(2, s.getLocation());
        p.setString(3, s.getDays());
        p.setString(4, s.getTime());
        System.out.println("DAL insert courseonsite");
        int result = p.executeUpdate();
        return result;
    }

    public int updateCourse(OnsiteCourse s) throws SQLException {
        String query = "Update onsitecourse SET Location = ? , Days = ?,Time=? "
                + " WHERE courseID  = ?";
        PreparedStatement p = OnsiteCourseDAL.getConnection().prepareStatement(query);
        p.setString(1, s.getLocation());
        p.setString(2, s.getDays());
        p.setString(3, s.getTime());
        p.setInt(4, s.getCourseId());
        int result = p.executeUpdate();
        System.out.println("DAL update courseonsite");
        return result;
    }

    public ArrayList readCourse() throws SQLException {
        String query = "SELECT * FROM onsitecourse ";
        ResultSet rs = OnsiteCourseDAL.doReadQuery(query);
        ArrayList list = new ArrayList();

        if (rs != null) {
            while (rs.next()) {
                OnsiteCourse s = new OnsiteCourse();
                s.setCourseId(rs.getInt("CourseID"));
                s.setLocation(rs.getString("Location"));
                s.setDays(rs.getString("Days"));
                s.setTime(rs.getString("Time"));

                list.add(s);
            }
        }
        System.out.println("DAL read courseonsite");
        return list;
    }

}
