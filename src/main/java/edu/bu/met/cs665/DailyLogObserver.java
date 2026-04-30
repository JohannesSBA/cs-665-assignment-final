/**
 * Name: Johannes Bekele
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/30/2026
 * File Name: DailyLogObserver.java
 * Description: Observer contract for receiving updates when a daily log changes.
 */

package edu.bu.met.cs665;

/**
 * Defines how subscribers react to updates from a {@link DailyLog}.
 */
public interface DailyLogObserver {
    void update(DailyLog log, User user);
}
