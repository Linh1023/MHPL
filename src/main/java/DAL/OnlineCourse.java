/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author DO THE TUNG
 */
public class OnlineCourse extends Course{
    public String url;
    public OnlineCourse(){}
    public OnlineCourse(int courseId, String url) {
        this.courseId = courseId;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
