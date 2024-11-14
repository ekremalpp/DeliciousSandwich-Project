package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MeatTest {

    @Test
    public void calculateTotalPrice_ValidSize_ReturnsCorrectPrice() {
        // Arrange
        Meat steak = new Meat("Steak");

        // Act & Assert
        // Testing for size 4
        assertEquals(1.00, steak.calculateTotalPrice(4));

        // Testing for size 8
        assertEquals(2.00, steak.calculateTotalPrice(8));

        // Testing for size 12
        assertEquals(3.00, steak.calculateTotalPrice(12));
    }
}