package com.pluralsight;

public class PhillyCheeseSteak extends Sandwich {

    public PhillyCheeseSteak(int size) {
        super("white", size);  // 8" white bread by default
        // Predefined toppings for Philly Cheese Steak
        addTopping(new Meat("Steak"));
        addTopping(new Cheese("American Cheese"));
        addTopping(new RegularTopping("Peppers"));
        addTopping(new RegularTopping("Mayo"));
        setToasted(true);  // Philly Cheese Steak is always toasted
    }

    @Override
    public String toString() {
        return "Philly Cheese Steak Sandwich\n" + super.toString();
    }
}