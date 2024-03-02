/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_Instructor;
import java.sql.SQLException;
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
}
