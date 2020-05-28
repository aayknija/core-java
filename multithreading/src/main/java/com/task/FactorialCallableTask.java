package com.task;

import java.util.concurrent.Callable;

public class FactorialCallableTask implements Callable<Long> {
    private long number;
    public FactorialCallableTask(long number){
        this.number=number;
    }
    public long factorial(long number){
        if(number == 0){
            return 1;
        }
        return number * factorial(number-1);
    }

    public Long call() throws Exception {
        return factorial(number);
    }
}
