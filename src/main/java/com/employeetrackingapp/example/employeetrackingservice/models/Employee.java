package com.employeetrackingapp.example.employeetrackingservice.models;


import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id; // Long is a type of number

    @Column(name="full_name")
    private String fullName;

    @Column(name="age")
    private int age;

    @Column(name="employee_number")
    private String employeeNumber;

    @Column(name="email")
    private String email;

    public Employee() {
    }

    public Employee(String fullName, int age, String employeeNumber, String email) {
        this.fullName = fullName;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
