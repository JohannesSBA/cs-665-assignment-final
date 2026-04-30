/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: GoalProgressObserver.java
 * Description: Observer that prints percent completion toward the daily calorie goal.
 */

package edu.bu.met.cs665;

/**
 * Reports how far the user is toward their daily calorie goal.
 */
public class GoalProgressObserver implements DailyLogObserver {
    @Override
    public void update(DailyLog log, User user) {
        DailyGoalSnapshot snapshot = log.captureSnapshot();
        System.out.println("Goal progress: " + String.format("%.1f", snapshot.getProgressPercent()) + "%");
    }
}
