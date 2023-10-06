package com.engeto.Hotel;

public class Room {
    private int numberOfBeds;

    private int numberOfRoom;

    private boolean hasBalcony;

    private boolean isSeaView;
    private int priceOfNights;

    public Room(int numberOfRoom, int numberOfBeds, boolean hasBalcony, boolean isSeaView, int priceOfNights) {
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.isSeaView = isSeaView;
        this.priceOfNights = priceOfNights;
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public void setBalcony(boolean balcony) {
        hasBalcony = balcony;
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

    public int getNumberOfRoom() {

        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {

        this.numberOfRoom = numberOfRoom;
    }
}

