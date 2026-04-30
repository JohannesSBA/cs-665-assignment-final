/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: NotificationService.java
 * Description: Console-based observer that prints status for calorie-goal progress.
 */

package edu.bu.met.cs665;

/**
 * Sends simple console notifications in response to daily log updates.
 */
public class NotificationService implements DailyLogObserver {
    @Override
    public void update(DailyLog log, User user) {
        DailyGoalSnapshot snapshot = log.captureSnapshot();
        if (snapshot.getCaloriesConsumed() > snapshot.getCalorieGoal()) {
            System.out.println("Warning: daily calorie goal exceeded.");
        } else if (snapshot.getCaloriesConsumed() == (int) snapshot.getCalorieGoal()) {
            System.out.println("Daily calorie goal reached.");
        }
    }
}
