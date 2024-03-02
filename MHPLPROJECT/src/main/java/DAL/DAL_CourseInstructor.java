/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.DTO_CourseInstructor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class CourseInstructorDAL extends MyDatabaseManager {

    public CourseInstructorDAL() {
        CourseInstructorDAL.connectDB();
    }

    public ArrayList readCourseInstructor() throws SQLException {
        String query = "SELECT courseinstructor.CourseID,course.Title,courseinstructor.PersonID, CONCAT(person.Firstname,' ',person.Lastname) as Name FROM `courseinstructor`"
                + " LEFT JOIN `course` ON courseinstructor.CourseID = course.CourseID"
                + " LEFT JOIN `person` ON courseinstructor.PersonID = person.PersonID";
        ArrayList<DTO_CourseInstructor> list = new ArrayList();
        ResultSet rs = CourseInstructorDAL.doReadQuery(query);
        if (rs != null) {
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
                DTO_CourseInstructor ci = new DTO_CourseInstructor();
                ci.setCourseID(rs.getInt("CourseID"));
                ci.setCourseTitle(rs.getString("Title"));
                ci.setPersonID(rs.getInt("PersonID"));
                ci.setPersonName(rs.getString("Name"));
                list.add(ci);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        try {
            new CourseInstructorDAL().readCourseInstructor();
        } catch (SQLException ex) {
            Logger.getLogger(CourseInstructorDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
