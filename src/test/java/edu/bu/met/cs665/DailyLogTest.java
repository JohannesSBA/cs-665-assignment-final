/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: DailyLogTest.java
 * Description: Unit tests for daily log calorie aggregation across meals.
 */

package edu.bu.met.cs665;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests calorie total calculations in {@link DailyLog}.
 */
public class DailyLogTest {
    @Test
    public void testDailyLogCalculatesCaloriesFromMultipleMeals() {
        User user = new User("Test User", 25, 170, 70, new MaintenanceStrategy());

        Meal breakfast = new Meal("Breakfast");
        breakfast.addFoodItem(new FoodItem.Builder("Eggs", 140).build());

        Meal lunch = new Meal("Lunch");
        lunch.addFoodItem(new FoodItem.Builder("Chicken Bowl", 600).build());

        DailyLog log = new DailyLog(LocalDate.now(), user);
        log.addMeal(breakfast);
        log.addMeal(lunch);

        assertEquals(740, log.getDailyCalories());
    }

    @Test
    public void testSnapshotIncludesGoalAndMacroTargets() {
        User user = new User("Test User", 70, 175, 23, ActivityLevel.LIGHT, new MaintenanceStrategy());
        Meal meal = new Meal(MealType.BREAKFAST);
        meal.addFoodItem(new FoodItem.Builder("Oats", 300).protein(10).carbs(55).fat(6).build());

        DailyLog log = new DailyLog(LocalDate.now(), user);
        log.addMeal(meal);

        DailyGoalSnapshot snapshot = log.captureSnapshot();
        assertEquals(300, snapshot.getCaloriesConsumed());
        assertTrue(snapshot.getCalorieGoal() > 0);
        assertTrue(snapshot.getMacroTargets().getProteinGrams() > 0);
        assertTrue(snapshot.getProgressPercent() > 0);
    }
}
