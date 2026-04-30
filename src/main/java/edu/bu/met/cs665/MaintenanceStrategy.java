/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: MaintenanceStrategy.java
 * Description: Strategy implementation that returns a maintenance calorie target.
 */

package edu.bu.met.cs665;

/**
 * Calculates a calorie goal for weight maintenance.
 */
public class MaintenanceStrategy implements GoalStrategy {
    @Override
    public double calculateGoal(User user) {
        return CalorieFormulaUtil.calculateMaintenanceCalories(user);
    }
}
