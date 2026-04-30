/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: GoalStrategyTest.java
 * Description: Unit tests validating strategy switching and calorie-goal outputs.
 */

package edu.bu.met.cs665;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests strategy-based calorie-goal calculations for users.
 */
public class GoalStrategyTest {
    @Test
    public void testUserCanSwitchGoalStrategy() {
        User user = new User("Test User", 70, 175, 23, ActivityLevel.MODERATE, new WeightLossStrategy());

        double weightLoss = user.getDailyCalorieGoal();

        user.setGoalStrategy(new MaintenanceStrategy());
        double maintenance = user.getDailyCalorieGoal();

        user.setGoalStrategy(new MuscleGainStrategy());
        double muscleGain = user.getDailyCalorieGoal();

        assertTrue(weightLoss < maintenance);
        assertTrue(maintenance < muscleGain);
    }
}
