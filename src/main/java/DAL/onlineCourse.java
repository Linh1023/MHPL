/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author DO THE TUNG
 */
public class onlineCourse {
   public  int courseId;
    public String url;
    public onlineCourse(){}
    public onlineCourse(int courseId, String url) {
        this.courseId = courseId;
        this.url = url;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
    
    
   
 
    
}
