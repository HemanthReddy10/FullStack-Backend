package com.hemanthcodes.studentsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//  it defines that a class can be mapped to a table
@Entity
public class Student {
    @Id //    For making the id primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // if we want to automatically generate the primary key value,// we can add the @GeneratedValue annotation.
    private int id;
    private String name;
    private String address;
//   Constructor: Constructor in java is used to create the instance of the class.
//   Constructors are almost similar to methods except for two things -
//   its name is the same as the class name and it has no return type.
//   Sometimes constructors are also referred to as special methods to initialize an object.
    public Student() {
    }
// Getters and setters:
//Getters and setters are used to protect your data, particularly when creating classes.
// For each instance variable, a getter method returns its value while a setter method sets or updates its value.
// Given this, getters and setters are also known as accessors and mutators, respectively.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
