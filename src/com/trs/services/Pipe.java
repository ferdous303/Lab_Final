/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Updated Pipe Class
package com.trs.services;

import java.util.List;

public class Pipe {
    private List<Filter> filters;

    // Constructor to initialize the list of filters
    public Pipe(List<Filter> filters) {
        this.filters = filters;
    }

    // Method to process data through the pipeline of filters
    public String process(String data) {
        for (Filter filter : filters) {
            data = filter.process(data);  // Pass data through each filter
        }
        return data;  // Return final transformed data
    }
}

