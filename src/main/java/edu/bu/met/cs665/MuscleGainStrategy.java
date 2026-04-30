/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: MuscleGainStrategy.java
 * Description: Strategy implementation that returns a calorie-surplus target.
 */

package edu.bu.met.cs665;

/**
 * Calculates a fixed calorie goal for muscle gain.
 */
public class MuscleGainStrategy implements GoalStrategy {
    @Override
    public double calculateGoal(User user) {
        return 2600;
    }
}
