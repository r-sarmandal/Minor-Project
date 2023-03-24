package com.safe_and_found.entity;

import jakarta.persistence.Entity;

@Entity
public class LostPost extends Post {
    private String description;
    private boolean cashPrize;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCashPrize() {
        return cashPrize;
    }

    public void setCashPrize(boolean cashPrize) {
        this.cashPrize = cashPrize;
    }


}
