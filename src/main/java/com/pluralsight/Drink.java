package com.pluralsight;

public class Drink implements IPriceable{
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    @Override
    public double calculatePrice() {
        double price = 0.0;

        switch (size.toLowerCase()) {
            case "small":
                price = 2.00;
                break;
            case "medium":
                price = 2.50;
                break;
            case "large":
                price = 3.00;
                break;
        }
        return price;
    }
    @Override
    public String toString() {
        return "Drink: " + flavor + " (" + size + ")";
    }
    public static String[] FLAVORS = {"Fanta", "Coca-Cola", "Fruit Juice"};
}
