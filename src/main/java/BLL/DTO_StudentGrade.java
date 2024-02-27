/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.math.BigDecimal;
import java.sql.Date;

/**
 *
 * @author PC
 */
public class DTO_StudentGrade {
      private int enrollmentID;
    private int courseID;
    private int studentId;
    private BigDecimal grade;
    private String name;
    private Date enrollmentDateTime;
    
    
    public DTO_StudentGrade() {
        this.enrollmentID = 0;
        this.courseID = 0;
        this.studentId = 0;
        this.grade = null;
        this.name = null;
        this.enrollmentDateTime = null;
    }
    

    public DTO_StudentGrade(int enrollmentID, int courseID, int studentId, BigDecimal grade, String name, Date enrollmentDateTime) {
        this.enrollmentID = enrollmentID;
        this.courseID = courseID;
        this.studentId = studentId;
        this.grade = grade;
        this.name = name;
        this.enrollmentDateTime = enrollmentDateTime;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEnrollmentDateTime() {
        return enrollmentDateTime;
    }

    public void setEnrollmentDateTime(Date enrollmentDateTime) {
        this.enrollmentDateTime = enrollmentDateTime;
    }
    
}


