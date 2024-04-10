# Customized Task: Fantasy Creatures of Italy

## Deadline
This assignment needs to be submitted before the next class.

## Instructions
For submitting the assignment, follow the instructions provided in the assignments section of the course materials.

## Preparation
- Please review Module 2: "Looking Inside Classes" from your course material.
- Access the OLI material through Canvas or directly from the provided webpage.

## Learning Goals
This task focuses on:
* Designing and implementing Java classes
* Working with instance fields
* Implementing a constructor method
* Adding getters and setters
* Utilizing the dot operator
* Outputting information to the terminal
* Understanding the `main` method
* Exploring variable scope and shadowing

## Assignment Structure

At the heart of Italy's magical forests, mythical creatures called "Fantasia" roam freely. Your mission is to create a digital representation of these creatures using Java.

### Task 1: Initializing Your Journey
Start by creating a Java file named `Fantasia.java` inside the `src` folder. This file will define the `Fantasia` class.

In the `main` method of the `Fantasia` class, declare the following variables for a creature called "Azzurro" and assign them appropriate values:
- `String` name: Azzurro
- `int` healthPoints: 20
- `int` strength: 8
- `int` magic: 10
- `boolean` isFriendly: true

Make sure you test your code to verify it works as expected.

### Task 2: Creating Multiple Creatures
Try to create two more unique "Fantasia" creatures using the method described above. This will help you recognize the impracticality of managing multiple creatures this way, setting the stage for a more elegant solution using objects and classes.

### Task 3: Introduction to Fields
Transform the variables into class fields. Make sure these fields are declared within the class but outside any methods.

Inside the `main` method, instantiate a new "Fantasia" object, and then assign values to its fields directly. This is a shift from using local variables in the main method to utilizing class fields that represent the creature's attributes.

### Task 4: Implementing Getters and Setters
To adhere to good object-oriented design principles, modify the access modifiers of your fields to `private`. Then, implement appropriate getters and setters for each field. This setup ensures controlled access to the object's state.

### Task 5: Using a Constructor
Refine your creature creation process by introducing a constructor method. This method should allow you to specify the creature's attributes when the object is instantiated.

Replace previous object initializations in the `main` method with calls to this new constructor. This change should demonstrate the utility of constructor methods for initializing object state.

### Task 6: Adding More Creatures
With the constructor in place, add two more creatures to showcase the improved process of creating and initializing objects.

### Task 7: Displaying Creature Information
Implement a method named `printInfo()` that outputs the creature's details to the console. This method will enhance how you present information about the creatures.

### Task 8: Creature Interactions
Add functionality that allows creatures to interact with each other. For example, implement a method that simulates a friendly encounter between two creatures and prints the details of their interaction. You may customize the interaction as you see fit.

### Task 9: Explore Variable Shadowing
Examine and understand the concept of variable shadowing. Consider scenarios where local variables may obscure class fields and how to resolve such conflicts using `this` keyword.

## Submission Checklist
- Create the `Fantasia` class with proper attributes.
- Implement getters and setters for class attributes.
- Introduce a constructor method for initializing new objects.
- Utilize the constructor for creating new "Fantasia" creatures.
- Display creature information with the `printInfo()` method.
- Simulate and print details of creature interactions.
- Understand and address variable shadowing implications.

## Additional Notes
If you encounter any issues or have questions, feel free to post on the course discussion board or reach out during lab sessions.

Remember, this assignment is a stepping stone toward mastering Java's object-oriented features. Enjoy your journey through the magical woods of Italy and the fascinating world of programming!
