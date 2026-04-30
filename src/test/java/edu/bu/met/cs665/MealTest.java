/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: MealTest.java
 * Description: Unit tests validating meal calorie totals from added food items.
 */

package edu.bu.met.cs665;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests calorie accumulation behavior for {@link Meal}.
 */
public class MealTest {
    @Test
    public void testMealCalculatesTotalCalories() {
        FoodItem eggs = new FoodItem.Builder("Eggs", 140).build();
        FoodItem toast = new FoodItem.Builder("Toast", 120).build();

        Meal breakfast = new Meal("Breakfast");
        breakfast.addFoodItem(eggs);
        breakfast.addFoodItem(toast);

        assertEquals(260, breakfast.getTotalCalories());
    }
}
