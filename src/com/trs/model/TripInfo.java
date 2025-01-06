/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.model;

/**
 *
 * @author XPS
 */
public class TripInfo {
    private String title;
    private String date;
    private String company;

    // Constructor
    public TripInfo(String title, String date, String company) {
        if (title.isEmpty() || date.isEmpty() || company.isEmpty()) {
            throw new IllegalArgumentException("Trip details cannot be empty!");
        }
        this.title = title;
        this.date = date;
        this.company = company;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getCompany() {
        return company;
    }

    // Display trip info
    public String displayTripInfo() {
        return "Trip Title: " + title + "\nDate: " + date + "\nCompany: " + company;
    }
}
