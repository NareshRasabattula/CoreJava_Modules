package com.durga.concurrencyIssuesAndSynchronization;

/**
 * @author Durganaresh - 3/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class SynchronizedCounter {
    private int count = 0;

    // Synchronized Method
    public synchronized void increment() {
        System.out.println(Thread.currentThread().getName());
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
