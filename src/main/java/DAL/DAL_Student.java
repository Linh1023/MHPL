/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAL_Student {
    
    Connection conn = null;
    private ResultSet RsStudent = null;
    private PreparedStatement PsStudent = null;
    
    public ArrayList<Person> getAllStudent(){
        ArrayList<Person> arrayStudent = new ArrayList<Person>();
        conn = MyDatabaseManager.conn();
        try {
            PsStudent = conn.prepareStatement("SELECT * FROM `person` WHERE HireDate IS NULL");
            RsStudent = PsStudent.executeQuery();
            while(RsStudent.next()){
                Person person_DTO = new Person();
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
    
    public ArrayList<Person> FindStudent(String ComboboxValue, String search){
        ArrayList<Person> arrayList = new ArrayList<Person>();
        conn = MyDatabaseManager.conn();
        try {
            PsStudent = conn.prepareStatement("SELECT * FROM person WHERE " + ComboboxValue + " LIKE ?  AND HireDate IS NULL");
            PsStudent.setString(1,"%" +search+"%");
            RsStudent = PsStudent.executeQuery();
            while(RsStudent.next()){
                Person person_DTO = new Person();
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
    public ArrayList<Person> findStudentByID(int id) {
    ArrayList<Person> arrayList = new ArrayList<>();
    conn = MyDatabaseManager.conn();
    try {
        PsStudent = conn.prepareStatement("SELECT * FROM person WHERE PersonID = ? AND HireDate IS NULL");
        PsStudent.setInt(1, id);
        RsStudent = PsStudent.executeQuery();
        System.out.println("1011");
        while (RsStudent.next()) {
            System.out.println("1415");
            Person personDTO = new Person();
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
    public int insertPerson(Person person) throws SQLException {
        
        conn = MyDatabaseManager.conn();
        try {
            String query = "INSERT INTO Person (FirstName, LastName, EnrollmentDate) VALUES (?, ?, ?)";
            PsStudent = conn.prepareStatement(query);
            PsStudent.setString(1, person.getFirstName());
            PsStudent.setString(2, person.getLastName());
            PsStudent.setDate(3, new java.sql.Date(person.getEnrollmentDate().getTime()));
            System.out.println("1234");
            return PsStudent.executeUpdate();
        }
        catch(Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int deleteStudent(int personID) throws SQLException {
        String query = "DELETE FROM person WHERE PersonID = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, personID);
            return preparedStatement.executeUpdate();
        }
    }
    public int updateStudentName(Person person) throws SQLException {
        String query = "UPDATE person SET FirstName = ?, LastName = ? WHERE PersonID = ?";
        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, person.getFirstName());
            preparedStatement.setString(2, person.getLastName());
            preparedStatement.setInt(3, person.getPersonID());
            return preparedStatement.executeUpdate();
        }
    }

    
}
