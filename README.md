# Travelling Management System

## Overview

This project is a **Trip Management System** that allows users to manage group trips, including adding and removing users, displaying trip details, making schedules, sending notifications, and integrating with external services like payment gateways, location tracking, and weather updates. 

The system uses the **Model-View-Controller (MVC)** architecture pattern along with the **Pipe and Filter** design pattern for data processing. It integrates external services such as **Payment Gateway**, **Location**, and **Weather** to simulate real-world interactions.

## Architecture Style

### 1. **Model-View-Controller (MVC) Pattern**

The **MVC** architecture separates the application into three interconnected components, which makes it easier to manage and maintain:

- **Model:** Represents the core data and business logic of the application. In this project, the `User`, `TripInfo`, `Client`, and `Server` classes represent the model.
- **View:** Represents the user interface and displays the data to the user. The `View` class handles how trip details, group information, and notifications are shown.
- **Controller:** Acts as an intermediary between the model and the view, handling user input and updating the view based on the model's data. The `Controller` class manages user actions like adding/removing users and sending notifications.

### 2. **Pipe and Filter Pattern**

The **Pipe and Filter** pattern is used to process data through a series of transformations (filters). In this project, the `Pipe` class handles processing a series of filters applied to trip-related data (such as notifications, schedules, etc.). Each filter transforms the data and passes it to the next stage.

### 3. **Observer Pattern** (optional, if implemented in future updates)

The **Observer** pattern can be applied in scenarios where multiple components need to be notified about changes in the state of the application (e.g., when a user's trip schedule is updated). Though not yet implemented, this pattern would allow for notifying users or the system when specific changes occur.

## Principles Used

### 1. **Separation of Concerns**

Each class is responsible for a specific part of the application:
- **Model:** Contains data and logic.
- **View:** Handles user interaction and display.
- **Controller:** Manages the flow of data between the model and view.

This separation ensures that the application is modular and maintainable, allowing for easier updates and modifications.

### 2. **Single Responsibility Principle (SRP)**

Each class in the project has a single responsibility:
- `User`: Manages user data.
- `View`: Displays data and updates.
- `Controller`: Handles user interactions and manages business logic.
- `PaymentGateway`, `Location`, and `Weather`: Handle external service interactions.

This ensures that classes are not overly complex and do one thing well, making the codebase more maintainable and testable.

### 3. **Encapsulation**

The classes ensure that the internal state is hidden and only accessible through well-defined methods. For example, the `User` class encapsulates user data and provides methods to interact with it (such as `addUser`, `removeUser`, etc.), but the internal list of users is private and cannot be accessed directly.

### 4. **Modularity**

By organizing the application into different packages based on the functionality (e.g., `model`, `view`, `controller`, `external`), the code is modular. This allows for better code organization, easier maintenance, and the ability to extend or modify functionality with minimal impact on other components.

### 5. **Loose Coupling**

The components of the system (model, view, controller) interact with each other in a loosely coupled manner. The controller handles communication between the model and the view, but neither the model nor the view depends directly on each other. This allows for flexibility in modifying or extending the application without affecting other parts of the system.

## How to Run the Project

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/trip-management-system.git
