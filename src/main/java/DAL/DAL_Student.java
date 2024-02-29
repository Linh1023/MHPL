/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.DTO_Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAL_Student {
    
    Connection conn = null;
    private ResultSet RsStudent = null;
    private PreparedStatement PsStudent = null;
    
    public ArrayList<DTO_Person> getAllStudent(){
        ArrayList<DTO_Person> arrayStudent = new ArrayList<DTO_Person>();
        conn = ConnectToSQL.conn();
        try {
            PsStudent = conn.prepareStatement("SELECT * FROM `person` WHERE HireDate IS NULL");
            RsStudent = PsStudent.executeQuery();
            while(RsStudent.next()){
                DTO_Person person_DTO = new DTO_Person();
                person_DTO.setPersonID(RsStudent.getInt("PersonID"));
                person_DTO.setFirstName(RsStudent.getString("FirstName").trim());
                person_DTO.setLastName(RsStudent.getString("LastName").trim());
                person_DTO.setHireDate(RsStudent.getDate("HireDate"));
                person_DTO.setEnrollmentDate(RsStudent.getDate("EnrollmentDate"));
                arrayStudent.add(person_DTO);
            }
            return arrayStudent;
        } catch (Exception e) {
             e.printStackTrace();
              return null;
        } finally {
            //ConnectToSQL.closeConnection(conn);
        }
    }
    
    public ArrayList<DTO_Person> FindStudent(String ComboboxValue, String search){
        ArrayList<DTO_Person> arrayList = new ArrayList<DTO_Person>();
        conn = ConnectToSQL.conn();
        try {
            PsStudent = conn.prepareStatement("SELECT * FROM person WHERE " + ComboboxValue + "=? AND HireDate IS NULL");
            PsStudent.setString(1, search);
            RsStudent = PsStudent.executeQuery();
            while(RsStudent.next()){
                DTO_Person person_DTO = new DTO_Person();
                person_DTO.setPersonID(RsStudent.getInt("PersonID"));
                person_DTO.setFirstName(RsStudent.getString("FirstName").trim());
                person_DTO.setLastName(RsStudent.getString("LastName").trim());
                person_DTO.setHireDate(RsStudent.getDate("HireDate"));
                person_DTO.setEnrollmentDate(RsStudent.getDate("EnrollmentDate"));
                arrayList.add(person_DTO);
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
          return null;
        } finally {
            
        }
    }
    public ArrayList<DTO_Person> findStudentByID(int id) {
    ArrayList<DTO_Person> arrayList = new ArrayList<>();
    conn = ConnectToSQL.conn();
    try {
        System.out.println("789");
        PsStudent = conn.prepareStatement("SELECT * FROM person WHERE PersonID = ? AND HireDate IS NULL");
        PsStudent.setInt(1, id);
        RsStudent = PsStudent.executeQuery();
        System.out.println("1011");
        while (RsStudent.next()) {
            System.out.println("1415");
            DTO_Person personDTO = new DTO_Person();
            personDTO.setPersonID(RsStudent.getInt("PersonID"));
            personDTO.setFirstName(RsStudent.getString("FirstName").trim());
            personDTO.setLastName(RsStudent.getString("LastName").trim());
            personDTO.setHireDate(RsStudent.getDate("HireDate"));
            personDTO.setEnrollmentDate(RsStudent.getDate("EnrollmentDate"));
            arrayList.add(personDTO);
        }
        System.out.println("1213");
        return arrayList;
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    } finally {
        // Đóng các tài nguyên (ResultSet, PreparedStatement) ở đây nếu cần
    }
}

    
}
