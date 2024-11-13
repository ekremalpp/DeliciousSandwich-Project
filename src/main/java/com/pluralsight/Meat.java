package com.pluralsight;

public class Meat extends Topping{
    //Constructor
    public Meat(String name) {
        super(name);
    }
    @Override
    public double calculateTotalPrice(int size) {
        double price = 0.0;

        switch (size) {
            case 4:
                price = 1.00;
                break;
            case 8:
                price = 2.00;
                break;
            case 12:
                price = 3.00;
                break;
        }
        return price;
    }
    @Override
    public String toString() {
        return "Meat: " + getName();
    }
}
