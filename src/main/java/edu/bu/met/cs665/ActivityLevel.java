/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: ActivityLevel.java
 * Description: Activity-level enum with multipliers used in calorie-goal formulas.
 */

package edu.bu.met.cs665;

/**
 * Represents activity profiles used to scale base calorie needs.
 */
public enum ActivityLevel {
    SEDENTARY(1.2),
    LIGHT(1.375),
    MODERATE(1.55),
    VERY_ACTIVE(1.725);

    private final double multiplier;

    ActivityLevel(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
