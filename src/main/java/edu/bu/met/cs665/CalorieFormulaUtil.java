/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: CalorieFormulaUtil.java
 * Description: Utility helper for base metabolic and daily energy calculations.
 */

package edu.bu.met.cs665;

/**
 * Shared calorie-formula helper used by goal strategy implementations.
 */
public final class CalorieFormulaUtil {
    private CalorieFormulaUtil() {
    }

    public static double calculateMaintenanceCalories(User user) {
        double bmr = (10 * user.getWeight()) + (6.25 * user.getHeight()) - (5 * user.getAge()) + 5;
        return bmr * user.getActivityLevel().getMultiplier();
    }
}
