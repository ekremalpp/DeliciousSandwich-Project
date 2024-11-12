package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements IPriceable{
    private String breadType;
    private int size;
    private List<Topping> toppings = new ArrayList<>();
    private boolean toasted;

    public Sandwich(String breadType, int size) {
        this.breadType = breadType;
        this.size = size;
    }

    @Override
    public double calculatePrice() {
        double price = 0.0;
        //Price Of Sandwich
        switch (size) {
            case 4:
                price = 5.50;
                break;
            case 8:
                price = 7.00;
                break;
            case 12:
                price = 8.50;
                break;
        }
        // Adding Price Of Toppings
        for (Topping topping : toppings) {
            price+= topping.calculateTotalPrice(size);
        }
        return price;
    }
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

}
