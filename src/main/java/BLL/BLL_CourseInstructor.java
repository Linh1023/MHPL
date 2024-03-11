/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_CourseInstructor;
import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BLL_CourseInstructor {
    DAL_CourseInstructor cidal;
    public BLL_CourseInstructor() {
        cidal = new DAL_CourseInstructor();
    }
    
    public List loadCourseInstructor() throws SQLException {
        ArrayList list = cidal.readCourseInstructor();
         return list;
    }
    
    public int addCourseInstructor(int courseID , int personID) throws SQLException {
        int result = cidal.insertCourseInstructor(courseID, personID);
        return result;
    }
    
    public int updateCourseInstructor(int courseID, int personID, int newPersonID) throws SQLException {
        int result = cidal.updateCourseInstructor(courseID, personID, newPersonID);
        return result;
    }
    
    public int deleteCourseInstructor(int courseID, int personID) throws SQLException{
        int result = cidal.deleteCourseInstructor(courseID, personID);
        return result;
    }
    
    public List findCourseInstructor(String keyword, int selected) throws SQLException {
        ArrayList list = cidal.searchCourseInstructor(keyword, selected);
        return list;
    }
}
