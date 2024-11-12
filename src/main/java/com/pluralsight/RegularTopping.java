package com.pluralsight;

public class RegularTopping extends Topping {
    //Constructor
    public RegularTopping(String name) {
        super(name);
    }

    @Override
    public double calculateTotalPrice(int size) {
        return 0.0; // Regular Topping's price are fixed
    }
}
