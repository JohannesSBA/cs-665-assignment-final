/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: WeightLossStrategy.java
 * Description: Strategy implementation that returns a calorie-deficit target.
 */

package edu.bu.met.cs665;

/**
 * Calculates a fixed calorie goal for weight loss.
 */
public class WeightLossStrategy implements GoalStrategy {
    @Override
    public double calculateGoal(User user) {
        return 1800;
    }
}
