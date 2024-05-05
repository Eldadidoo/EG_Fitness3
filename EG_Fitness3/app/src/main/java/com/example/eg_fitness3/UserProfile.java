package com.example.eg_fitness3;

import java.util.Date;

public class UserProfile {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String gender;
    private String weight;
    private String height;

    // Constructor
        public UserProfile(String firstName, String lastName,String weight, String height, Date birthDate, String gender) {
        this.firstName = this.firstName;
        this.lastName = this.lastName;
        this.birthdate = birthdate;
        this.gender = this.gender;
    }

    // Getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
