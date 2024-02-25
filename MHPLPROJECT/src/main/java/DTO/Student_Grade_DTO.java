/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author ASUS
 */
public class Student_Grade_DTO {
    private int EnrollmentID;
    private int CourseID;
    private int StudentID;
    private String Grade;
    public Student_Grade_DTO()
    {
        
    }
    public Student_Grade_DTO(int EnrollmentID, int CourseID, int StudentID, String Grade){
        this.EnrollmentID = EnrollmentID;
        this.CourseID = CourseID;
        this.StudentID = StudentID;
        this.Grade = Grade;
    }
    public int getEnrollmentID()
    {
        return EnrollmentID;
    }
    public void setEnrollmentID(int EnrollmentID)
    {
        this.EnrollmentID = EnrollmentID;
    }
    
    public int getCourseID(){
        return CourseID;
    }
    public void setCourseID(int CourseID)
    {
        this.CourseID = CourseID;
    }
    public int getStudentID()
    {
        return StudentID;
    }
    public void setStudentID(int StudentID)
    {
        this.StudentID = StudentID;
    }
    public String getGrade()
    {
        return Grade;
    }
    public void setGrade(String Grade)
    {
        this.Grade = Grade;
    }
    
}

