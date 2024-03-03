/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CourseDAL;
import DAL.Course;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DO THE TUNG
 */
public class CourseBLL {

    CourseDAL stdDal;

    public CourseBLL() {
        stdDal = new CourseDAL();

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
        ArrayList result =stdDal.readCourseFull();
        return result;       
    }
    public ArrayList find(String value,int filter,int type){
        ArrayList result =new ArrayList();
       result =stdDal.find(value,filter,type);
        return result; 
    }
    public ArrayList find(int type){
        ArrayList result =new ArrayList();
       result =stdDal.find(type);
        return result; 
    }
     public int DeleteCouse(int courseId) throws SQLException {
        int result_up = stdDal.DeleteCourse(courseId);
        System.out.println("Update BLL " + result_up);
        return result_up;
    }
}
