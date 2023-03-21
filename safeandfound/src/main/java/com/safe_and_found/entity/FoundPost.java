package com.safe_and_found.entity;

import jakarta.persistence.Entity;

@Entity
public class FoundPost extends Post {
    private String foundAtLocation;
    private String submittedTo;

    public String getFoundAtLocation() {
        return foundAtLocation;
    }

    public void setFoundAtLocation(String foundAtLocation) {
        this.foundAtLocation = foundAtLocation;
    }

    public String getSubmittedTo() {
        return submittedTo;
    }

    public void setSubmittedTo(String submittedTo) {
        this.submittedTo = submittedTo;
    }



}
