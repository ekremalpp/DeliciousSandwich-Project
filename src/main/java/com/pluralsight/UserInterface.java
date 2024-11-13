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

    public void addSandwich() {
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

    public void addToppings(Sandwich sandwich) {
        System.out.println("\nWould you like to add toppings to your sandwich? (y/n)");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("y")) {
            // We offer topping options
            while (true) {
                System.out.println("Choose your topping (1) Meat, (2) Cheese, (3) Regular,  (0) No more toppings:");
                int toppingSelection = getUserSelection();

                if (toppingSelection == 0) {
                    break;
                }
                Topping selectedTopping = null;
                switch (toppingSelection) {
                    case 1:
                        System.out.println("Choose your meat type (1) Steak, (2) Ham, (3) Salami, (4) Roast Beef, (5) Chicken, (6) Bacon");
                        int meatSelection = getUserSelection();
                        if (meatSelection == 1) {
                            selectedTopping = new Meat("Steak");
                        } else if (meatSelection == 2) {
                            selectedTopping = new Meat("Ham");
                        } else if (meatSelection == 3) {
                            selectedTopping = new Meat("Salami");
                        } else if (meatSelection == 4) {
                            selectedTopping = new Meat("Roast Beef");
                        } else if (meatSelection == 5) {
                            selectedTopping = new Meat("Chicken");
                        } else if (meatSelection == 6) {
                            selectedTopping = new Meat("Bacon");
                        }
                        break;
                    case 2:
                        System.out.println("Choose your cheese type (1) American, (2) Provolone, (3) Cheddar, (4) Swiss");
                        int cheeseSelection = getUserSelection();
                        if (cheeseSelection == 1) {
                            selectedTopping = new Cheese("American");
                        } else if (cheeseSelection == 2) {
                            selectedTopping = new Cheese("Provolone");
                        } else if (cheeseSelection == 3) {
                            selectedTopping = new Cheese("Cheddar");
                        } else if (cheeseSelection == 4) {
                            selectedTopping = new Cheese("Swiss");
                        }
                        break;
                    case 3:
                        System.out.println("Choose your regular topping (1) Lettuce, (2) Peppers, (3) Onions, (4) Tomatoes, (5) Jalepenos, (6) Cucumbers, (7) Pickles, (8) Guacamole, (9) Mushrooms");
                        int regularSelection = getUserSelection();
                        if (regularSelection == 1) {
                            selectedTopping = new RegularTopping("Lettuce");
                        } else if (regularSelection == 2) {
                            selectedTopping = new RegularTopping("Peppers");
                        } else if (regularSelection == 3) {
                            selectedTopping = new RegularTopping("Onions");
                        } else if (regularSelection == 4) {
                            selectedTopping = new RegularTopping("Tomatoes");
                        } else if (regularSelection == 5) {
                            selectedTopping = new RegularTopping("Jalepenos");
                        } else if (regularSelection == 6) {
                            selectedTopping = new RegularTopping("Cucumbers");
                        } else if (regularSelection == 7) {
                            selectedTopping = new RegularTopping("Pickles");
                        } else if (regularSelection == 8) {
                            selectedTopping = new RegularTopping("Guacamole");
                        } else if (regularSelection == 9) {
                            selectedTopping = new RegularTopping("Mushrooms");
                        }
                        break;
                    default:
                        System.out.println("Invalid selection. Please try again.");
                        continue;

                }
                if (selectedTopping != null) {
                    sandwich.addTopping(selectedTopping);
                    System.out.println(selectedTopping.getName() + " added!");
                }
            }
        } else {
            System.out.println("No toppings added.");
        }

            }

    public void addDrink() {
        System.out.println("\nAdding a drink...");


        System.out.println("Choose your drink flavor:");
        for (int i = 0; i < Drink.FLAVORS.length; i++) {
            System.out.println((i + 1) + ") " + Drink.FLAVORS[i]);
        }

        int flavorSelection = getUserSelection();  // We get the drink selection from the user
        String selectedFlavor = Drink.FLAVORS[flavorSelection - 1];  // Selected Drink type

        System.out.println("Choose your drink size (small, medium, large): ");
        String size = scanner.nextLine();

        //Creating a new drink and adding it to the order
        Drink drink = new Drink(size, selectedFlavor);
        currentOrder.addDrink(drink);

        System.out.println("Drink added!");
    }

    public void addChips() {
        System.out.println("\nAdding chips...");
        System.out.println("Choose chip type (regular, nacho, bbq): ");
        String type = scanner.nextLine();

        // // New chip is created and added to the order
        Chips chips = new Chips(type);
        currentOrder.addChips(chips);

        System.out.println("Chips added!");
    }


    // Completing the order and calculating the price
    public void checkout() {
        System.out.println("\nCheckout:");
        System.out.println("Order details:");
        System.out.println(currentOrder);  // It shows order details


        System.out.println("Total price: " + currentOrder.calculateTotalPrice());


        System.out.println("Do you want to confirm the order? (y/n)");

        String confirmation = scanner.nextLine();
        if (confirmation.equalsIgnoreCase("y")) {
            currentOrder.generateReceipt();  //Creating order receipt
            System.out.println("Thank you for your order! Your receipt has been saved.");
        } else {
            System.out.println("Order cancelled.");
        }
    }

    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        currentOrder = new Order(); 
    }

        }





