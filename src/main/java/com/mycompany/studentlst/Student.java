package com.mycompany.studentlst;

/**
 *
 * @author MoaathAlrajab
 */
public class Student { 
    
    private String name;

    //To Do 01: add a constructor to this class
    // Constructor - takes a name and sets it for the student
    public Student(String name){
        this.name = name;
    }
    
    // To Do 02: Add setters and getters

    // Setter - sets name
    public void setName (String name){
        this.name = name;
    }

    // Getters - gets name
    public String getName() {
        return name;
    }
}
