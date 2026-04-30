/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: FoodItemTest.java
 * Description: Unit tests that verify food item builder behavior and field mapping.
 */

package edu.bu.met.cs665;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for {@link FoodItem} and its builder.
 */
public class FoodItemTest {
    @Test
    public void testBuilderCreatesFoodItemCorrectly() {
        FoodItem item = new FoodItem.Builder("Chicken Breast", 220)
                .protein(40)
                .carbs(0)
                .fat(5)
                .servingSize("200g")
                .build();

        assertEquals("Chicken Breast", item.getName());
        assertEquals(220, item.getCalories());
        assertEquals(40, item.getProtein());
        assertEquals(0, item.getCarbs());
        assertEquals(5, item.getFat());
        assertEquals("200g", item.getServingSize());
    }
}
