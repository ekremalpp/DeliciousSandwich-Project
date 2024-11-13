package com.pluralsight;

public class Drink implements IPriceable{
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }
}
