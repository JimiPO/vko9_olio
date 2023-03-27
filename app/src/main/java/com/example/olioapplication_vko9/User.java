package com.example.olioapplication_vko9;

public class User{
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getDegreeProgram() {
        return this.degreeProgram;
    }
    public User(String firstName, String lastName, String email, String degreeProgram){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
    }
}
