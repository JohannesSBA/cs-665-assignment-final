/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: SummaryObserver.java
 * Description: Observer that prints a concise daily summary snapshot.
 */

package edu.bu.met.cs665;

/**
 * Prints a summary view of consumed calories, remaining calories, and macro targets.
 */
public class SummaryObserver implements DailyLogObserver {
    @Override
    public void update(DailyLog log, User user) {
        DailyGoalSnapshot snapshot = log.captureSnapshot();
        MacroTargets targets = snapshot.getMacroTargets();

        System.out.println("Summary -> Consumed: " + snapshot.getCaloriesConsumed()
                + " kcal, Remaining: " + String.format("%.0f", snapshot.getRemainingCalories()) + " kcal");
        System.out.println("Macro targets -> Protein: " + String.format("%.0f", targets.getProteinGrams())
                + "g, Carbs: " + String.format("%.0f", targets.getCarbGrams())
                + "g, Fat: " + String.format("%.0f", targets.getFatGrams()) + "g");
    }
}
