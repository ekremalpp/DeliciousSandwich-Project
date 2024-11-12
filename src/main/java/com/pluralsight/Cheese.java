package com.pluralsight;

public class Cheese extends Topping{
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double calculateTotalPrice(int size) {
      double price = 0.0;

      switch (size) {
          case 4:
              price = 0.75; // for 4"
              break;
          case 8:
              price = 1.50; // for 8"
              break;
          case 12:
              price = 2.25; // for12"
              break;
      }
      return price;
    }
}
