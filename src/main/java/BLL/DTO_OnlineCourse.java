/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

/**
 *
 * @author PC
 */
public class DTO_OnlineCourse extends DTO_Course{
    int courseIDOnlline;
    String url;

    public DTO_OnlineCourse(int courseIDOnlline, String url) {
        this.courseIDOnlline = courseIDOnlline;
        this.url = url;
    }

    public DTO_OnlineCourse(int courseIDOnlline, String url, int courseID, int credits, int departmentID, String title) {
        super(courseID, credits, departmentID, title);
        this.courseIDOnlline = courseIDOnlline;
        this.url = url;
    }

    public int getCourseIDOnlline() {
        return courseIDOnlline;
    }

    public void setCourseIDOnlline(int courseIDOnlline) {
        this.courseIDOnlline = courseIDOnlline;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    
    
    
    
    
    
}
