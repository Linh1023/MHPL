/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OnlineCourseDAL;
import DAL.OnlineCourse;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

public class OnlineCourseBLL {

    OnlineCourseDAL stdDal;

    public OnlineCourseBLL() {
        stdDal = new OnlineCourseDAL();
    }

    public int addCourse(OnlineCourse s) throws SQLException {
        int result = stdDal.insertCourse(s);
        return result;
    }

    public int EditCourse(OnlineCourse s) throws SQLException {
        int result_up = stdDal.updateCourse(s);
        System.out.println("Update BLL " + result_up);
        return result_up;
    }

    public ArrayList LoadCourse_No_Frac_page() throws SQLException {
        ArrayList list = stdDal.readCourse();
        return list;
    }

    public List LoadCourse(int page) throws SQLException {
        int numofrecords = 30;
        ArrayList list = stdDal.readCourse();
        int size = list.size();
        int from, to;
        from = (page - 1) * numofrecords;
        to = page * numofrecords;
        return (List) list.subList(from, Math.min(to, size));
    }
}
