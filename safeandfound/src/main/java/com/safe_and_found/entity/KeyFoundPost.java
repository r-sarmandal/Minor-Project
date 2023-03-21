package com.safe_and_found.entity;

import jakarta.persistence.Entity;

@Entity
public class KeyFoundPost extends FoundPost {
    private String blockNumber;
    private int roomNumber;

    public String getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
