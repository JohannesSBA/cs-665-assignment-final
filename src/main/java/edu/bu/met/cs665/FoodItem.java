/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: FoodItem.java
 * Description: Immutable food item entity with nutrition data and builder-based creation.
 */

package edu.bu.met.cs665;

/**
 * Represents a food entry with calories, macros, and serving details.
 */
public class FoodItem {
    private final String name;
    private final int calories;
    private final double protein;
    private final double carbs;
    private final double fat;
    private final String servingSize;

    private FoodItem(Builder builder) {
        this.name = builder.name;
        this.calories = builder.calories;
        this.protein = builder.protein;
        this.carbs = builder.carbs;
        this.fat = builder.fat;
        this.servingSize = builder.servingSize;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFat() {
        return fat;
    }

    public String getServingSize() {
        return servingSize;
    }

    /**
     * Builder for constructing {@link FoodItem} instances with optional macro details.
     */
    public static class Builder {
        private final String name;
        private final int calories;
        private double protein;
        private double carbs;
        private double fat;
        private String servingSize = "unspecified";

        public Builder(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public Builder protein(double protein) {
            this.protein = protein;
            return this;
        }

        public Builder carbs(double carbs) {
            this.carbs = carbs;
            return this;
        }

        public Builder fat(double fat) {
            this.fat = fat;
            return this;
        }

        public Builder servingSize(String servingSize) {
            this.servingSize = servingSize;
            return this;
        }

        public FoodItem build() {
            return new FoodItem(this);
        }
    }
}
