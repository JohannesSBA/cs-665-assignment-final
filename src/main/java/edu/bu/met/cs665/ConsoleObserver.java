/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: ConsoleObserver.java
 * Description: Observer that prints a basic event message whenever the log updates.
 */

package edu.bu.met.cs665;

/**
 * Emits a lightweight console event when meals are added to the daily log.
 */
public class ConsoleObserver implements DailyLogObserver {
    @Override
    public void update(DailyLog log, User user) {
        System.out.println("Log updated for " + user.getName() + " on " + log.getDate()
                + ". Total calories so far: " + log.getDailyCalories());
    }
}
