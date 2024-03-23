package com.durga.objectLockAndAtomicVariables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Durganaresh - 3/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class ReadWriteLockExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        ReadWriteCounter counter = new ReadWriteCounter();

        Runnable readTask = () -> System.out.println(Thread.currentThread().getName() +
                " Read Task : " + counter.getCount());

        Runnable writeTask = () -> System.out.println(Thread.currentThread().getName() +
                " Write Task : " + counter.incrementAndGetCount());

        executorService.submit(readTask);
        executorService.submit(readTask);

        executorService.submit(writeTask);

        executorService.submit(readTask);
        executorService.submit(readTask);

        executorService.shutdown();
    }
}
