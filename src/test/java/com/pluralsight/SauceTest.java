package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SauceTest {

    @Test
    public void calculateTotalPrice_ReturnsZero() {
        // Arrange
        Sauce marinaraSauce = new Sauce("Mayo");
        Sauce alfredoSauce = new Sauce("Mustard");
        Sauce bbqSauce = new Sauce("Ranch");

        // Act & Assert
        assertEquals(0.0, marinaraSauce.calculateTotalPrice(1));
        assertEquals(0.0, alfredoSauce.calculateTotalPrice(2));
        assertEquals(0.0, bbqSauce.calculateTotalPrice(3));
    }
}