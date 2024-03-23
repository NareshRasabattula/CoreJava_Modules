package com.durga.callableAndFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author Durganaresh - 3/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hard
 * work. There is no shortcut to success.
 */
public class InvokeAllExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        var executorService = Executors.newFixedThreadPool(5);

        Callable<String> task1;
        task1 = () -> {
            Thread.sleep(2000);
            return "Result of Task1";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(1000);
            return "Result of Task2";
        };

        Callable<String> task3 = () -> {
            Thread.sleep(5000);
            return "Result of Task3";
        };

        List<Callable<String>> taskList = Arrays.asList(task1, task2, task3);

        List<Future<String>> futures = executorService.invokeAll(taskList);

        for(Future<String> future: futures) {
            // The result is printed only after all the futures are complete. (i.e. after 5 seconds)
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
