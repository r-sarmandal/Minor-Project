package com.safe_and_found.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IdLostPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String registrationNumber;
    private String studentName;
    private boolean cashPrize;
    private String whatsappNumber;

    public boolean isCashPrize() {
        return cashPrize;
    }

    public void setCashPrize(boolean cashPrize) {
        this.cashPrize = cashPrize;
    }

    public String getWhatsappNumber() {
        return whatsappNumber;
    }

    public void setWhatsappNumber(String whatsappNumber) {
        this.whatsappNumber = whatsappNumber;
    }



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
