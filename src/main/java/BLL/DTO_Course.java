/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author PC
 */
public class DTO_Course {
    int courseID, credits,departmentID;
    String title;

    
    public DTO_Course() {
        this.courseID = 0;
        this.credits = 0;
        this.departmentID = 0;
        this.title = null;
    }
    
    
    
    public DTO_Course(int courseID, int credits, int departmentID, String title) {
        this.courseID = courseID;
        this.credits = credits;
        this.departmentID = departmentID;
        this.title = title;
    }
    
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
}
