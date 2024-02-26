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
    courseDAL  stdDal;
   public courseBLL()
   {
       stdDal = new courseDAL();
       
   }
   
//   code load list student in BLL
   
  public int addCouse(course s) throws SQLException {
        int result = stdDal.insertCourse(s);
        return result;
    }
  public java.util.List LoadCourse (int page) throws SQLException
  {
        int numofrecords = 30;
        ArrayList list = stdDal.readCourse();
        int size = list.size();
        int from, to;
        from = (page - 1) * numofrecords;
        to = page * numofrecords;

        return  list.subList(from, Math.min(to, size)); 
  }
}
