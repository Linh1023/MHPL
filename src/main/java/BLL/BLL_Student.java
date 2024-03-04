/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DAL_Student;
import java.sql.SQLException;
import java.util.ArrayList;
public class BLL_Student {
    DAL_Student dalthongtinsv = new DAL_Student();
    
    public ArrayList<DTO_Person> getAllStudent(){
        return dalthongtinsv.getAllStudent();
    }
    public ArrayList<DTO_Person> searchStudent(String ComboboxValue, String search ){
        return dalthongtinsv.FindStudent(ComboboxValue, search);
    }

    public ArrayList<DTO_Person> searchStudentByID(int idValue) {
        return dalthongtinsv.findStudentByID(idValue);
    }
    public int insertStudent(DTO_Person person) throws SQLException{
        return dalthongtinsv.insertPerson(person);
    }
    public int deleteStudent(int personID) throws SQLException {
        return dalthongtinsv.deleteStudent(personID);
    }
    public int updateStudentName(DTO_Person person) throws SQLException {
        return dalthongtinsv.updateStudentName(person);
    }
}
