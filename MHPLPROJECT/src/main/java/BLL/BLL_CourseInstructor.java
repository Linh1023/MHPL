/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CourseInstructorDAL;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BLL_CourseInstructor {
    CourseInstructorDAL cidal;
    public BLL_CourseInstructor() {
        cidal = new CourseInstructorDAL();
    }
    
    public List loadCourseInstructor(int page) throws SQLException {
        int numOfRecords = 15;
        ArrayList list = cidal.readCourseInstructor();
        int size = list.size();
        int from,to;
        from = (page - 1) * numOfRecords;
        to = from + numOfRecords;
         return list.subList(from, Math.min(to ,size));
    }
    
}
