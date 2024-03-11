/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_Instructor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class BLL_Instructor {
    DAL.DAL_Instructor insDAL;
    public BLL_Instructor() {
        insDAL = new DAL_Instructor();
    }
    
    public List loadInstructors() throws SQLException {
        return insDAL.readInstructors();
    }
    
    public List listInstructorNotInCI(int courseID) throws SQLException {
        ArrayList list = insDAL.readInstructorNotInCI(courseID);
        return list;
    }
    
    public boolean isInstructorExistInList(List list, int personID) {
        for(int i = 0 ; i < list.size(); i++){
            Instructor o = (Instructor) list.get(i);
            if(o.getPersonID() == personID) return true;
        }
        return false;
    }
    
    public Instructor getInstructor(int personID) throws SQLException {
        return insDAL.getInstructor(personID);
    }
    
}
 