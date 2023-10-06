package com.engeto.Hotel;

import java.time.LocalDate;

public class Booking {
    private Guest guest;
    private Room room;
    private int numberOfRoom;
    private int numberOfGuest;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean workVacation;

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Booking(Guest guest, Room room) {
        this.guest = guest;
        this.room = room;
    }

    public Booking(LocalDate endDate) {
        endDate = endDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void endDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfGuest() {
        return numberOfGuest;
    }

    public void setNumberOfGuest(int numberOfGuest) {
        this.numberOfGuest = numberOfGuest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setDate(LocalDate date) {
        startDate = date;
    }

    public boolean isWorkVacation() {
        return workVacation;
    }

    public void setWorkVacation(boolean workVacation) {
        this.workVacation = workVacation;
    }



    public Booking(String name, int numberOfRoom, int numberOfGuest, LocalDate startDate,LocalDate endDate,
                   boolean workVacation) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfGuest = numberOfGuest;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workVacation = workVacation;
    }






}
