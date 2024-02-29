/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_StudentGrade;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public ArrayList<DTO_StudentGrade> readStudentGrade (String course) {
        return dAL_StudentGrade.readStudentGrade(course);
    }
    
    public int editGrade (int enrollmentID, BigDecimal grade) {
        return dAL_StudentGrade.editGrade(enrollmentID, grade);
    }
    
    public int deleteStudentGrade (int enrollmentID) {
        return dAL_StudentGrade.deleteStudentGrade(enrollmentID);
    }
    
    public int addStudentGrade (DTO_StudentGrade dTO_StudentGrade) {
        return dAL_StudentGrade.addStudentGrade(dTO_StudentGrade);
    }
    
    public Boolean hasStudentGrade (String studentID, String courseID) {
        int StudentID = Integer.parseInt(studentID);
        int CourseID = Integer.parseInt(courseID);
        return dAL_StudentGrade.hasStudentGrade(StudentID, CourseID);
    }
    
    public String checkAndAddStudentGrade (String courseID, String studentID) {
        if (studentID.equals("") == false ) {
          if (hasStudentGrade(studentID, courseID) == false) {
            DTO_StudentGrade  dTO_StudentGrade = new DTO_StudentGrade();
            dTO_StudentGrade.setCourseID( Integer.parseInt(courseID) );
            dTO_StudentGrade.setStudentId(Integer.parseInt(studentID));
            addStudentGrade(dTO_StudentGrade);
             return "Thêm thành công";
          } else {
              return "Sinh viên này đã tồn tại trong khóa học !";
          }
        } else {
             return "Vui lòng chọn sinh viên !";
        }
    }
    
   public String checkStudentID (String studentID){
       String regex = "^[0-9]+$";
         if (studentID.equals("")) {
           return "Không được để trống !";
       } else if (studentID.matches(regex)==false) {
           return "StudentID phải là số !";
       }
       else {
           return "Correct";
       }
   }
    
    public DTO_Person readPerson (String personID) {
        int PersonID = Integer.parseInt(personID);
        return dAL_StudentGrade.readPerson(PersonID);
    }
    
    public String checkAndDeleteStudentGrade (String enrollmentID) {
        if (enrollmentID.equals("")) {
            return "Vui lòng chọn dữ liệu !";
        } else {
            int EnrollmentID = Integer.parseInt(enrollmentID);
            deleteStudentGrade(EnrollmentID);
            return "Xóa thành công";
        }
    }
    
    public String checkAndEditGrade (String grade, String enrollmentID) {
       String regex = "^\\d{1}(\\.\\d+)?$";
       if (enrollmentID.equals("")){
           return "Vui lòng chọn dữ liệu !";
       } else
       if (grade.equals("")) {
           return "Không được để trống Grade !";
       } else
       if (grade.matches(regex) == false ) {
           return "Định dạng phải là số và phần nguyên chỉ chứa 1 số !";
       }
       int EnrollmentID = Integer.parseInt(enrollmentID);
        BigDecimal Grade = new BigDecimal(grade);
        editGrade(EnrollmentID, Grade);
        return "Cập nhật thành công";
    }
    
    
    
    
}
