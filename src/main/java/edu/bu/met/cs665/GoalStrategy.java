/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: GoalStrategy.java
 * Description: Strategy abstraction for calculating a user daily calorie goal.
 */

package edu.bu.met.cs665;

/**
 * Defines the contract for calorie goal calculation strategies.
 */
public interface GoalStrategy {
    double calculateGoal(User user);
}
