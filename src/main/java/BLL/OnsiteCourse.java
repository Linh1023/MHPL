/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;


/**
 *
 * @author PC
 */
public class OnsiteCourse extends Course{
//    private int courseIDOnSite;
    private String location;
    private String days;
    private String time;
// int courseIDOnSite
    public OnsiteCourse() {}
    public OnsiteCourse( String location, String days, String time) {
//        this.courseIDOnSite = courseIDOnSite;
        this.location = location;
        this.days = days;
        this.time = time;
    }

    public OnsiteCourse( String location, String days, String time, int courseID, int credits, int departmentID, String title) {
        super(courseID, credits, departmentID, title);
        this.location = location;
        this.days = days;
        this.time = time;
    }

//    public int getCourseIDOnSite() {
//        return courseIDOnSite;
//    }

//    public void setCourseIDOnSite(int courseIDOnSite) {
//        this.courseIDOnSite = courseIDOnSite;
//    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    
    
    
    
}