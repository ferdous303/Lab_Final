/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trs.main;

/**
 *
 * @author XPS
 */
import com.trs.model.User;
import com.trs.view.View;
import com.trs.controller.Controller;
import com.trs.services.PaymentGateway;


public class Main {
    public static void main(String[] args) {
        // Initialize components
        User userModel = new User();
        View userView = new View();
        Controller controller = new Controller(userModel, userView);
        PaymentGateway paymentGateway = new PaymentGateway();
    

        // Add users
        controller.addUser("Alice");
        controller.addUser("Bob");

        // Display group details
        controller.displayGroupDetails();

        // Create and display a trip
        controller.createTrip("Trip to Paris", "2025-05-10", "TravelCo");
        controller.displayTripInfo();

        // Process payment
        paymentGateway.processPayment("Alice", 500.0);

       
    }
}