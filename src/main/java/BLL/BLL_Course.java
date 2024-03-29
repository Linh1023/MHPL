/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_Course;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DO THE TUNG
 */
public class BLL_Course {

    DAL_Course stdDal;

    public BLL_Course() {
        stdDal = new DAL_Course();

    }

//   code load list student in BLL
    public int addCourse(Course s) throws SQLException {
        int result = stdDal.insertCourse(s);
        System.out.println(s.getTitle());
        return result;
    }

    public int EditCourse(Course s) throws SQLException {
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

    public ArrayList readCourseFull() throws SQLException {
        ArrayList result = stdDal.readCourseFull();
        return result;
    }

    public ArrayList find(String value, int filter, int type) {
        ArrayList result = new ArrayList();
        result = stdDal.find(value, filter, type);
        return result;
    }

    public ArrayList find(int type) {
        ArrayList result = new ArrayList();
        result = stdDal.find(type);
        return result;
    }

    public boolean DeleteCourse(int courseId) throws SQLException {
        if (stdDal.InCourseIntructor(courseId)) {
            System.out.println("trong íntructor");
            return false;
        } else {
            System.out.println("ngoài íntructor");
            return stdDal.DeleteCourse(courseId);
        }
    }

    public Course getCourse(int courseID) throws SQLException {
        return stdDal.getCourse(courseID);
    }
    
    public boolean inOnlineCourse(int courseID) throws SQLException {
        return stdDal.inOnlineCourse(courseID);
    }
}
