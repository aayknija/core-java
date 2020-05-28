package com.task;

public class FactorialTask implements Runnable {
    private long number;
    public FactorialTask(long number){
        this.number=number;
    }
    public long factorial(long number){
        if(number == 0){
            return 1;
        }
        return number * factorial(number-1);
    }
    public void run() {
        System.out.println(" Current thread name: "+Thread.currentThread().getName()+" The factorial of number:"+this.number+" is "+factorial(number));
    }
}
