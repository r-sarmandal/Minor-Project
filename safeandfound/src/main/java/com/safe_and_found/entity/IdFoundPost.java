package com.safe_and_found.entity;

import jakarta.persistence.Entity;

@Entity
public class IdFoundPost extends FoundPost {
    private String registrationNumber;
    private String studentName;

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


}
