/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: ObserverTest.java
 * Description: Unit tests for observer notifications when meals are logged.
 */

package edu.bu.met.cs665;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests observer wiring between {@link DailyLog} and subscribers.
 */
public class ObserverTest {
    @Test
    public void testObserverIsNotifiedWhenMealIsAdded() {
        User user = new User("Test User", 25, 170, 70, new WeightLossStrategy());
        DailyLog log = new DailyLog(LocalDate.now(), user);

        TestObserver observer = new TestObserver();
        log.attachObserver(observer);

        Meal meal = new Meal("Dinner");
        meal.addFoodItem(new FoodItem.Builder("Pasta", 900).build());

        log.addMeal(meal);

        assertTrue(observer.wasNotified());
    }

    /**
     * Test double used to capture observer notifications.
     */
    private static class TestObserver implements DailyLogObserver {
        private boolean notified = false;

        @Override
        public void update(DailyLog log, User user) {
            notified = true;
        }

        public boolean wasNotified() {
            return notified;
        }
    }
}
