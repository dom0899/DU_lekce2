package com.engeto.Hotel;

public class Room {
    private int numberOfBeds;

    private int numberOfRooms;

    private boolean isBalcony;

    private boolean isSeaView;
    private int priceOfNights;

    public Room(int numberOfRooms, int numberOfBeds, boolean isBalcony, boolean isSeaView, int priceOfNights) {
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSeaView = isSeaView;
        this.priceOfNights = priceOfNights;
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return isBalcony;
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }

    public boolean isSeaView() {
        return isSeaView;
    }

    public void setSeaView(boolean seaView) {
        isSeaView = seaView;
    }

    public int getPriceOfNights() {
        return priceOfNights;
    }

    public void setPriceOfNights(int priceOfNights) {
        this.priceOfNights = priceOfNights;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}

