package com.pluralsight;

public class Sauce extends Topping {
    //Constructor
    public Sauce(String name) {
        super(name);
    }

    @Override
    public double calculateTotalPrice(int size) {
        return 0.0; //sauce prices are fixed
    }
}
