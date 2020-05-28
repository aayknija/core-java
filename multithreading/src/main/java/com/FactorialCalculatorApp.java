package com;

import com.task.FactorialTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FactorialCalculatorApp {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start : Main thread");
        //ExecutorService executor= Executors.newSingleThreadExecutor();
        ExecutorService executor= Executors.newFixedThreadPool(5);
        //ExecutorService executor= Executors.newCachedThreadPool();
        for(int i =1;i<20;i++){
            executor.execute(new FactorialTask(i));
        }
        // To shutdown the executor
       executor.shutdown();
        System.out.println("Exit : Main thread");
    }
}
