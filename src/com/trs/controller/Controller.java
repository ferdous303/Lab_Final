/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.controller;

/**
 *
 * @author XPS
 */

import com.trs.model.User;
import com.trs.model.TripInfo;
import com.trs.view.View;

public class Controller {
    private User model;
    private View view;
    private TripInfo tripInfo;

    // Constructor
    public Controller(User model, View view) {
        this.model = model;
        this.view = view;
    }

    // Add a user
    public void addUser(String userName) {
        try {
            model.addUser(userName);
            view.displayNotification("User added: " + userName);
        } catch (IllegalArgumentException e) {
            view.displayNotification(e.getMessage());
        }
    }

    // Remove a user
    public void removeUser(String userName) {
        try {
            model.removeUser(userName);
            view.displayNotification("User removed: " + userName);
        } catch (IllegalArgumentException e) {
            view.displayNotification(e.getMessage());
        }
    }

    // Create a trip
    public void createTrip(String title, String date, String company) {
        tripInfo = new TripInfo(title, date, company);
        view.displayNotification("Trip created successfully!");
    }

    // Display trip info
    public void displayTripInfo() {
        if (tripInfo != null) {
            view.displayTripInfo(tripInfo.displayTripInfo());
        } else {
            view.displayNotification("No trip info available.");
        }
    }

    // Display group details
    public void displayGroupDetails() {
        view.displayGroupDetails(model.getUsers());
    }
}