package com;

import com.task.FactorialCallableTask;
import com.task.FactorialTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCalculatorWithCallableApp {
    public static void main(String[] args) throws Exception{
        System.out.println("Start : Main thread");
        ExecutorService executor= Executors.newSingleThreadExecutor();
        for(int i =1;i<20;i++){
            Future<Long> answer = executor.submit(new FactorialCallableTask(i));
            System.out.println(" The factorial of number:"+i+" is "+answer.get());
        }
        // To shutdown the executor
       executor.shutdown();
        System.out.println("Exit : Main thread");
    }
}
