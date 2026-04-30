/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: MacroTargets.java
 * Description: Daily macro targets represented in grams of protein, carbs, and fat.
 */

package edu.bu.met.cs665;

/**
 * Represents macro nutrition goals for a single day.
 */
public class MacroTargets {
    private final double proteinGrams;
    private final double carbGrams;
    private final double fatGrams;

    public MacroTargets(double proteinGrams, double carbGrams, double fatGrams) {
        this.proteinGrams = proteinGrams;
        this.carbGrams = carbGrams;
        this.fatGrams = fatGrams;
    }

    public double getProteinGrams() {
        return proteinGrams;
    }

    public double getCarbGrams() {
        return carbGrams;
    }

    public double getFatGrams() {
        return fatGrams;
    }
}
