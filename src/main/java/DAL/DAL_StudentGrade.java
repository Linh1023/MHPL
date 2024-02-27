/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import BLL.*;
import java.sql.Time;

/**
 *
 * @author PC
 */
public class DAL_StudentGrade {
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement pst;
    private ArrayList<DTO_StudentGrade> arrayListStudentGrade;
    
    private DTO_StudentGrade dTO_StudentGrade;
    
    public ArrayList<DTO_StudentGrade> readStudentGrade (String course) {
        conn = ConnectToSQL.conn();
        arrayListStudentGrade = new ArrayList<DTO_StudentGrade>();
        try {
            String sqlQuery = "SELECT * FROM studentgrade, person where StudentId = PersonID and CourseID = " + course;
             pst = conn.prepareStatement(sqlQuery);
             rs = pst.executeQuery();
             while (rs.next()) {
             dTO_StudentGrade = new DTO_StudentGrade ();
             dTO_StudentGrade.setEnrollmentID(rs.getInt("EnrollmentID"));
             dTO_StudentGrade.setCourseID(rs.getInt("CourseID"));
             dTO_StudentGrade.setStudentId(rs.getInt("StudentID"));
             dTO_StudentGrade.setGrade(rs.getBigDecimal("Grade"));
             dTO_StudentGrade.setName(rs.getString("Firstname") + " " + rs.getString("Lastname"));
             dTO_StudentGrade.setEnrollmentDateTime(rs.getDate("EnrollmentDate"));

             arrayListStudentGrade.add(dTO_StudentGrade);
             }
             
            return arrayListStudentGrade;
        } catch (Exception e) {
            return null;
        } 
    } 
    
    public ArrayList<DTO_OnlineCourse> readOnlineCourse() {
        conn = ConnectToSQL.conn();
        ArrayList<DTO_OnlineCourse> arrayListOnlineCourse = new ArrayList<DTO_OnlineCourse>() ;
        try {
            String sqlQuery = "SELECT * FROM course, onlinecourse where course.CourseID = onlinecourse.CourseID" ;
             pst = conn.prepareStatement(sqlQuery);
             rs = pst.executeQuery();
             while (rs.next()) {
              int courseIDOnlline  = rs.getInt("onlinecourse.CourseID");
              String url = rs.getString("url");
              int courseID = rs.getInt("course.CourseID");
              int credits = rs.getInt("Credits");
              int departmentID = rs.getInt("DepartmentID");
              String title = rs.getString ("Title");
              DTO_OnlineCourse dTO_OnlineCourse = new DTO_OnlineCourse(courseIDOnlline, url,courseID , credits, departmentID, title);
              arrayListOnlineCourse.add(dTO_OnlineCourse);
             }
            return arrayListOnlineCourse;
        } catch (Exception e) {
            return null;
        } 
    }
    
    public ArrayList<DTO_OnSiteCourse> readOnSiteCourse() {
        conn = ConnectToSQL.conn();
        ArrayList<DTO_OnSiteCourse> arrayListOnSiteCourse = new ArrayList<DTO_OnSiteCourse>() ;
        try {
            String sqlQuery = "SELECT * FROM course, onsitecourse where course.CourseID = onsitecourse.CourseID" ;
             pst = conn.prepareStatement(sqlQuery);
             rs = pst.executeQuery();
             while (rs.next()) {
              int courseIDOnSite  = rs.getInt("onsitecourse.CourseID");
              String location = rs.getString("Location");
              String days = rs.getString("Days");
              Time time = rs.getTime("Time");
              int courseID = rs.getInt("course.CourseID");
              int credits = rs.getInt ("Credits");
              int departmentID = rs.getInt ("DepartmentID");
              String title = rs.getString("Title");
              DTO_OnSiteCourse dTO_OnSiteCourse = new DTO_OnSiteCourse( courseIDOnSite,  location,  days,  time,  courseID,  credits,  departmentID,  title);
              arrayListOnSiteCourse.add(dTO_OnSiteCourse);
             }
            return arrayListOnSiteCourse;
        } catch (Exception e) {
            return null;
        } 
    }
    
    
    
    
    
    
    
    

    public static void main(String[] args) {
        DAL_StudentGrade dAL_StudentGrade = new DAL_StudentGrade();
       ArrayList<DTO_StudentGrade> arrayListStudentGrade = new ArrayList<DTO_StudentGrade>();
       arrayListStudentGrade = dAL_StudentGrade.readStudentGrade("2021");
       for (int i = 0 ; i< arrayListStudentGrade.size(); i ++) {
           System.out.print(arrayListStudentGrade.get(i).getEnrollmentID());
//           System.out.println( "--" + arrayListStudentGrade.get(i).getName());
       }
//        System.out.println(arrayListStudentGrade.size());
    }
    
    
    
    
    
}
