/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.sql.Time;

/**
 *
 * @author PC
 */
public class DTO_OnSiteCourse extends DTO_Course{
    private int courseIDOnSite;
    private String location;
    private String days;
    private Time time;

    public DTO_OnSiteCourse(int courseIDOnSite, String location, String days, Time time) {
        this.courseIDOnSite = courseIDOnSite;
        this.location = location;
        this.days = days;
        this.time = time;
    }

    public DTO_OnSiteCourse(int courseIDOnSite, String location, String days, Time time, int courseID, int credits, int departmentID, String title) {
        super(courseID, credits, departmentID, title);
        this.courseIDOnSite = courseIDOnSite;
        this.location = location;
        this.days = days;
        this.time = time;
    }

    public int getCourseIDOnSite() {
        return courseIDOnSite;
    }

    public void setCourseIDOnSite(int courseIDOnSite) {
        this.courseIDOnSite = courseIDOnSite;
    }

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

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    
    
    
    
}
