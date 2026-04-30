/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: Meal.java
 * Description: Meal aggregate that groups food items and computes total calories.
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a meal containing one or more food items.
 */
public class Meal {
    private final String mealName;
    private final List<FoodItem> items;

    public Meal(String mealName) {
        this.mealName = mealName;
        this.items = new ArrayList<>();
    }

    public void addFoodItem(FoodItem item) {
        items.add(item);
    }

    public int getTotalCalories() {
        int total = 0;
        for (FoodItem item : items) {
            total += item.getCalories();
        }
        return total;
    }

    public String getMealName() {
        return mealName;
    }

    public List<FoodItem> getItems() {
        return new ArrayList<>(items);
    }
}
