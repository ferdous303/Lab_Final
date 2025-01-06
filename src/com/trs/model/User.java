/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.model;

/**
 *
 * @author XPS
 */ 
import java.util.ArrayList;

public class User {
    private ArrayList<String> users = new ArrayList<>(); // List of users

    // Add a user to the group
    public void addUser(String userName) {
        if (userName == null || userName.trim().isEmpty()) {
            throw new IllegalArgumentException("User name cannot be empty!");
        }
        users.add(userName);
    }

    // Remove a user from the group
    public void removeUser(String userName) {
        if (users.contains(userName)) {
            users.remove(userName);
        } else {
            throw new IllegalArgumentException("User not found in the group!");
        }
    }

    // Get the list of users
    public ArrayList<String> getUsers() {
        return users;
    }
}
