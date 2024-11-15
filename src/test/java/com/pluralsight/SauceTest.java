package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SauceTest {

    @Test
    public void calculateTotalPrice_ReturnsZero() {
        // Arrange
        Sauce MayoSauce = new Sauce("Mayo");
        Sauce MustardSauce = new Sauce("Mustard");
        Sauce RanchSauce = new Sauce("Ranch");

        // Act & Assert
        assertEquals(0.0, MayoSauce.calculateTotalPrice(1));
        assertEquals(0.0, MustardSauce.calculateTotalPrice(2));
        assertEquals(0.0, RanchSauce.calculateTotalPrice(3));
    }
}