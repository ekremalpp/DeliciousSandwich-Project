package com.pluralsight;

public class BLT extends Sandwich {

    public BLT(int size) {
        super("white", size);  // 8" white bread by default
        // Predefined toppings for BLT
        addTopping(new Meat("Bacon"));
        addTopping(new Cheese("Cheddar"));
        addTopping(new RegularTopping("Lettuce"));
        addTopping(new RegularTopping("Tomato"));
        addTopping(new RegularTopping("Ranch"));
        setToasted(true);  // BLT is always toasted
    }

    @Override
    public String toString() {
        return "BLT Sandwich\n" + super.toString();
    }
}
