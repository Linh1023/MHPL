/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.courseDAL;
import DAL.course;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DO THE TUNG
 */
public class courseBLL {

    courseDAL stdDal;

    public courseBLL() {
        stdDal = new courseDAL();

    }

//   code load list student in BLL
    public int addCourse(course s) throws SQLException {
        int result = stdDal.insertCourse(s);
        return result;
    }

    public int EditCourse(course s) throws SQLException {
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
