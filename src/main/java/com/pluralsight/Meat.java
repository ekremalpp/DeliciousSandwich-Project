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
                price = 1.00;  // 4" için fiyat
                break;
            case 8:
                price = 2.00;  // 8" için fiyat
                break;
            case 12:
                price = 3.00;  // 12" için fiyat
                break;
        }
        return price;
    }
    @Override
    public String toString() {
        return "Meat: " + getName();  // Topping ismini basitçe ekliyoruz
    }
}
