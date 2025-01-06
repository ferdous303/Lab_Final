/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.services;

public class LocationFilter implements Filter {
    @Override
    public String process(String data) {
        System.out.println("Processing location filter...");
        // Example transformation: Convert location name to uppercase
        return "Location: " + data.toUpperCase();
    }
}
