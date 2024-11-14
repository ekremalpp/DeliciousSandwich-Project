package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ChipsTest {

    @Test
    public void calculatePrice_ReturnsFixedPrice() {
        // Arrange
        Chips regularChips = new Chips("Regular");
        Chips nachoChips = new Chips("Nacho");
        Chips bbqChips = new Chips("BBQ");

        // Act & Assert

        assertEquals(1.50, regularChips.calculatePrice());
        assertEquals(1.50, nachoChips.calculatePrice());
        assertEquals(1.50, bbqChips.calculatePrice());
    }
}