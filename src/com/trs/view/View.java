/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.view;

/**
 *
 * @author XPS
 */

import java.util.ArrayList;
public class View {
    // Display group details
    public void displayGroupDetails(ArrayList<String> users) {
        System.out.println("\nGroup Members:");
        if (users.isEmpty()) {
            System.out.println("No members in the group.");
        } else {
            for (String user : users) {
                System.out.println("- " + user);
            }
        }
    }

    // Display trip info
    public void displayTripInfo(String tripInfo) {
        System.out.println("\nTrip Information:");
        System.out.println(tripInfo);
    }

    // Display schedule
    public void displaySchedule(String schedule) {
        System.out.println("\nSchedule:");
        System.out.println(schedule);
    }

    // Display notification
    public void displayNotification(String notification) {
        System.out.println("\nNotification: " + notification);
    }
}