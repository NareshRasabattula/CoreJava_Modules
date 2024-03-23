package com.durga.concurrencyIssuesAndSynchronization;

/**
 * @author Durganaresh - 3/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class FineGrainedSynchronizedCounter {
    private int count = 0;

    public void increment() {
        // Synchronized Block
        synchronized (this) {
            count = count + 1;
        }
    }

    public int getCount() {
        return count;
    }
}
