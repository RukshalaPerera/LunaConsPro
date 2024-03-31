package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")

public class employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_Id")
    private String emailId;

    public employee(){

    }

    public employee(String firstName,String lastName,String emailId){
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    //id
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    //firstName
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //LastName

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //emailId

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
