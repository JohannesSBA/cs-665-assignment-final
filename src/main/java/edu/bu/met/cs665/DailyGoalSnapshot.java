/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: DailyGoalSnapshot.java
 * Description: Immutable summary of calorie goals and progress for a single day.
 */

package edu.bu.met.cs665;

import java.time.LocalDate;

/**
 * Captures daily calorie goal progress and related macro targets.
 */
public class DailyGoalSnapshot {
    private final LocalDate date;
    private final double calorieGoal;
    private final int caloriesConsumed;
    private final MacroTargets macroTargets;

    public DailyGoalSnapshot(LocalDate date, double calorieGoal, int caloriesConsumed, MacroTargets macroTargets) {
        this.date = date;
        this.calorieGoal = calorieGoal;
        this.caloriesConsumed = caloriesConsumed;
        this.macroTargets = macroTargets;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getCalorieGoal() {
        return calorieGoal;
    }

    public int getCaloriesConsumed() {
        return caloriesConsumed;
    }

    public MacroTargets getMacroTargets() {
        return macroTargets;
    }

    public double getRemainingCalories() {
        return calorieGoal - caloriesConsumed;
    }

    public double getProgressPercent() {
        if (calorieGoal <= 0) {
            return 0;
        }
        return (caloriesConsumed / calorieGoal) * 100.0;
    }
}
