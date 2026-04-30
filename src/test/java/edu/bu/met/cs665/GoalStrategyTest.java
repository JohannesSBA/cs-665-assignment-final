/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: GoalStrategyTest.java
 * Description: Unit tests validating strategy switching and calorie-goal outputs.
 */

package edu.bu.met.cs665;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests strategy-based calorie-goal calculations for users.
 */
public class GoalStrategyTest {
    @Test
    public void testUserCanSwitchGoalStrategy() {
        User user = new User("Test User", 25, 170, 70, new WeightLossStrategy());

        assertEquals(1800, user.getDailyCalorieGoal());

        user.setGoalStrategy(new MaintenanceStrategy());
        assertEquals(2200, user.getDailyCalorieGoal());

        user.setGoalStrategy(new MuscleGainStrategy());
        assertEquals(2600, user.getDailyCalorieGoal());
    }
}
