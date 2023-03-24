package com.safe_and_found.entity;

import jakarta.persistence.Entity;

@Entity
public class KeyLostPost extends LostPost{
    private String blockNumber;
    private String roomNumber;

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
}
