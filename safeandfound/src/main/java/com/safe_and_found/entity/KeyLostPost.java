package com.safe_and_found.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class KeyLostPost{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String blockNumber;
    private String roomNumber;
    private boolean cashPrize;
    private String whatsappNumber;
    private String tag;

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



    public String getBlock() {
        return blockNumber;
    }

    public void setBlock(String block) {
        this.blockNumber = block;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
