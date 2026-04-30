/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: User.java
 * Description: User profile model that stores personal data and calorie goal strategy.
 */

package edu.bu.met.cs665;

/**
 * Represents an application user whose daily goal is determined by a strategy.
 */
public class User {
    private final String name;
    private final double weight;
    private final double height;
    private final int age;
    private final ActivityLevel activityLevel;
    private GoalStrategy goalStrategy;

    public User(String name, double weight, double height, int age, GoalStrategy goalStrategy) {
        this(name, weight, height, age, ActivityLevel.MODERATE, goalStrategy);
    }

    public User(String name, double weight, double height, int age,
                ActivityLevel activityLevel, GoalStrategy goalStrategy) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.activityLevel = activityLevel;
        this.goalStrategy = goalStrategy;
    }

    public double getDailyCalorieGoal() {
        return goalStrategy.calculateGoal(this);
    }

    public void setGoalStrategy(GoalStrategy goalStrategy) {
        this.goalStrategy = goalStrategy;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }
}
