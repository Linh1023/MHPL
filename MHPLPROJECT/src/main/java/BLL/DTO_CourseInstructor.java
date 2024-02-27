/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author PC
 */
public class DTO_CourseInstructor {
    private int courseID, personID;
    private String courseTitle, personName;
    
    public DTO_CourseInstructor() {
    }

    public DTO_CourseInstructor(int courseID, int personID, String courseTitle, String personName) {
        this.courseID = courseID;
        this.personID = personID;
        this.courseTitle = courseTitle;
        this.personName = personName;
    }

    public int getCourseID() {
        return courseID;
    }

    public int getPersonID() {
        return personID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getPersonName() {
        return personName;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
