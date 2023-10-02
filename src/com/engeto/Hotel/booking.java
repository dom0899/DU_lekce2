package com.engeto.Hotel;

import java.time.LocalDate;

public class booking {
    private int numberOfRooms;
    private int numberOfGuest;
    private String name;
    private LocalDate Date;
    private LocalDate Date2;
    private boolean workVacation;

    public booking(LocalDate date2) {
        Date2 = date2;
    }

    public LocalDate getDate2() {
        return Date2;
    }

    public void setDate2(LocalDate date2) {
        Date2 = date2;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
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

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public boolean isWorkVacation() {
        return workVacation;
    }

    public void setWorkVacation(boolean workVacation) {
        this.workVacation = workVacation;
    }



    public booking(String name, int numberOfRooms, int numberOfGuest, LocalDate Date,LocalDate Date2, boolean workVacation) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfGuest = numberOfGuest;
        this.name = name;
        this.Date = Date;
        this.Date2 = Date2;
        this.workVacation = workVacation;
    }






}
