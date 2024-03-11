/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_OnlineCourse;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLL_OnlineCourse {

    DAL_OnlineCourse stdDal;

    public BLL_OnlineCourse() {
        stdDal = new DAL_OnlineCourse();
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
    public int DeleteCouse(int courseId) throws SQLException {
        int result_up = stdDal.DeleteCourse(courseId);
        System.out.println("Update BLL " + result_up);
        return result_up;
    }
}
