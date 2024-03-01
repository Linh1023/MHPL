/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.OnsiteCourseDAL;
import DAL.OnsiteCourse;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DO THE TUNG
 */
public class OnsiteCourseBLL {

    OnsiteCourseDAL stdDal;

    public OnsiteCourseBLL() {
        stdDal = new OnsiteCourseDAL();

    }

//   code load list student in BLL
    public int addCourse(OnsiteCourse s) throws SQLException {
        int result = stdDal.insertCourse(s);
        System.out.println("insert BLL onsiteCourse");
        return result;
    }

    public int EditCourse(OnsiteCourse s) throws SQLException {
        int result_up = stdDal.updateCourse(s);
        System.out.println("Update BLL onsiteCourse");
        return result_up;
    }

    public ArrayList LoadCourse_No_Frac_page() throws SQLException {
        ArrayList list = stdDal.readCourse();
        System.out.println("read BLL onsiteCourse");
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
