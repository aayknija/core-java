package com.defaulMethods;

public interface A {
    default void print(){
        System.out.println("From Interface A");
    }
    static void p(){
        System.out.println("From static method Interface A");
    }
}
