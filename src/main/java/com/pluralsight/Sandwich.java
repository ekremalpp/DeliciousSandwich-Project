package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements IPriceable{
    private String breadType;
    private int size;
    private List<Topping> toppings = new ArrayList<>();
    private boolean toasted;

}
