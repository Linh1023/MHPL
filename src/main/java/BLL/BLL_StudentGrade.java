/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_StudentGrade;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class BLL_StudentGrade {
    DAL_StudentGrade dAL_StudentGrade = new DAL_StudentGrade();
    
    public ArrayList<DTO_OnSiteCourse> readOnSiteCourse () {
        return  dAL_StudentGrade.readOnSiteCourse();
    }
    
    public ArrayList<DTO_OnlineCourse> readOnlineCourse () {
        return  dAL_StudentGrade.readOnlineCourse();
    }
    
    
}
