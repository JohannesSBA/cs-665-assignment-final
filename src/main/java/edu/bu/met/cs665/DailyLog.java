/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: DailyLog.java
 * Description: Daily meal log that tracks calories and notifies registered observers.
 */

package edu.bu.met.cs665;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Maintains meal entries for a specific date and associated user.
 */
public class DailyLog {
    private final LocalDate date;
    private final User user;
    private final List<Meal> meals;
    private final List<DailyLogObserver> observers;

    public DailyLog(LocalDate date, User user) {
        this.date = date;
        this.user = user;
        this.meals = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
        notifyObservers();
    }

    public int getDailyCalories() {
        int total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalCalories();
        }
        return total;
    }

    public double getDailyProtein() {
        double total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalProtein();
        }
        return total;
    }

    public double getDailyCarbs() {
        double total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalCarbs();
        }
        return total;
    }

    public double getDailyFat() {
        double total = 0;
        for (Meal meal : meals) {
            total += meal.getTotalFat();
        }
        return total;
    }

    public DailyGoalSnapshot captureSnapshot() {
        double goal = user.getDailyCalorieGoal();
        int calories = getDailyCalories();

        // Example macro split: 30% protein, 40% carbs, 30% fat.
        MacroTargets macroTargets = new MacroTargets(
                (goal * 0.30) / 4,
                (goal * 0.40) / 4,
                (goal * 0.30) / 9
        );

        return new DailyGoalSnapshot(date, goal, calories, macroTargets);
    }

    public void attachObserver(DailyLogObserver observer) {
        observers.add(observer);
    }

    public void detachObserver(DailyLogObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (DailyLogObserver observer : observers) {
            observer.update(this, user);
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Meal> getMeals() {
        return new ArrayList<>(meals);
    }
}
