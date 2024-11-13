package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Sandwich> sandwiches = new ArrayList<>();
    private List<Drink> drinks = new ArrayList<>();
    private List<Chips> chips = new ArrayList<>();

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }
    public double calculateTotalPrice() {
        double total = 0.0;


         // Adding the prices of sandwiches
        total += sandwiches.stream().mapToDouble(Sandwich::calculatePrice).sum();


        // Adding the prices of Drinks
        total += drinks.stream().mapToDouble(Drink::calculatePrice).sum();

        //Adding the price of Chips
        total += chips.stream().mapToDouble(Chips::calculatePrice).sum();

        return total;
    }

    public void generateReceipt() {
        OrderFileManager fileManager = new OrderFileManager();
        fileManager.saveReceipt(this);  // saving receipt
    }

    @Override
    public String toString() {
        return "Order{" +
                "sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chips=" + chips +
                ", totalPrice=" + calculateTotalPrice() +
                '}';
    }


}
