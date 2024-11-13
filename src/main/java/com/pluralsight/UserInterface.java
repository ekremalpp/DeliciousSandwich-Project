package com.pluralsight;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner = new Scanner(System.in);
    Order currentOrder = new Order(); // The object that will hold the current order

    //Main Menu: Receives main menu selection from the user
    public void displayMainMenu() {
        while (true) {
            System.out.println("\nWelcome to DeliciousSandwiches!");
            System.out.println("1) New Order");
            System.out.println("2) Exit");

            int selection = getUserSelection();  //We get selection from the user

            switch (selection) {
                case 1:
                    createNewOrder();  //
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    return;  //
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    public void createNewOrder() {

        System.out.println("\nCreating a new order...");

        // //Entering the order menu
        while (true) {
            System.out.println("\nOrder Menu:");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int selection = getUserSelection();



        }
    }
    public int getUserSelection() {
        try {
            return Integer.parseInt(scanner.nextLine()); //We get selection from the user
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void addSandwich() {
        System.out.println("\nAdding a sandwich...");


        System.out.println("Choose your bread (white, wheat, rye, wrap): ");
        String breadType = scanner.nextLine();

        System.out.println("Choose sandwich size (4, 8, 12): ");
        int size = Integer.parseInt(scanner.nextLine());


        Sandwich sandwich = new Sandwich(breadType, size);
        currentOrder.addSandwich(sandwich);

        System.out.println("Sandwich added!");

        // Topping (Meat, Cheese, Regular)
        addToppings(sandwich);
    }

}


