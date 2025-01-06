/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.services;

public class WeatherFilter implements Filter {
    @Override
    public String process(String data) {
        System.out.println("Processing weather filter...");
        // Example transformation: Append weather info
        return data + " with clear skies.";
    }
}

