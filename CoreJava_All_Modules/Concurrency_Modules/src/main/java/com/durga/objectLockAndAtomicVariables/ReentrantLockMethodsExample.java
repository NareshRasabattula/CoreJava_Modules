package com.durga.objectLockAndAtomicVariables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Durganaresh - 3/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class ReentrantLockMethodsExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        ReentrantLockMethodsCounter lockMethodsCounter = new ReentrantLockMethodsCounter();

        executorService.submit(() -> System.out.println("IncrementCount (First Thread) : " +
                lockMethodsCounter.incrementAndGet() + "\n"));

        executorService.submit(() -> System.out.println("IncrementCount (Second Thread) : " +
                lockMethodsCounter.incrementAndGet() + "\n"));

        executorService.shutdown();
    }
}
