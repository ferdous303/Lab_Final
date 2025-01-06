/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.services;

public class NotificationFilter implements Filter {
    @Override
    public String process(String data) {
        System.out.println("Processing notification filter...");
        // Example transformation: add a timestamp to the notification
        return "Notification [" + System.currentTimeMillis() + "]: " + data;
    }
}