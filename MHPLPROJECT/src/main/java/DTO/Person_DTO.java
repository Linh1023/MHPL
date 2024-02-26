/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Person_DTO {
    private int PersonID;
    private String LastName;
    private String FirstName;
    private Date HireDate;
    private Date EnrollmentDate;
     
    public Person_DTO()
    {}
    public Person_DTO(int PersonID, String LastName, String FirstName,Date HireDate, Date EnrollmentDate)
    {
        this.PersonID = PersonID;
        this.LastName = LastName;
        this.FirstName = FirstName;
        this.HireDate= HireDate;
        this.EnrollmentDate = EnrollmentDate;
    }
    public int getPersonID()
    {
        return PersonID;
    }
    public void setPersonID(int PersonID)
    {
        this.PersonID =PersonID;
    }
    public String getLastName()
    {
        return LastName;
    }
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }
    public String getFirstName ()
    {
       return FirstName;
    }
    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }
    public Date getHireDate()
    {
        return HireDate;
    }
    public void setHireDate(Date HireDate)
    {
        this.HireDate = HireDate;
    }
    public Date getEnrollmentDate()
    {
        return EnrollmentDate;
    }
    public void setEnrollmentDate(Date EnrollmentDate)
    {
        this.EnrollmentDate = EnrollmentDate;
    }       
         
    
  
    
    
}
