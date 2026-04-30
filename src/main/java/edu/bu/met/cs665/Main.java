/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: Main.java
 * Description: Entry point for the nutrition tracking demo application.
 */

package edu.bu.met.cs665;

import java.time.LocalDate;

/**
 * Runs a sample workflow that creates a user, logs meals, and prints totals.
 */
public class Main {
  public static void main(String[] args) {
    User user = new User("Johannes", 23, 165, 70, new MuscleGainStrategy());

    FoodItem chicken = new FoodItem.Builder("Chicken Breast", 220)
            .protein(40)
            .fat(5)
            .servingSize("200g")
            .build();

    FoodItem rice = new FoodItem.Builder("Rice", 300)
            .carbs(65)
            .servingSize("1.5 cups")
            .build();

    FoodItem potatoes = new FoodItem.Builder("potatoes", 150)
            .carbs(34)
            .servingSize("100 grams")
            .build();

    Meal lunch = new Meal("Lunch");
    lunch.addFoodItem(chicken);
    lunch.addFoodItem(rice);
    lunch.addFoodItem(potatoes);

    DailyLog log = new DailyLog(LocalDate.now(), user);
    log.attachObserver(new NotificationService());
    log.addMeal(lunch);

    System.out.println("Total calories: " + log.getDailyCalories());
    System.out.println("Goal: " + user.getDailyCalorieGoal());
  }
}
