package com.defaulMethods;

public interface B {
    default void print(){
        System.out.println("From Interface B");
    }
    static void p(){
        System.out.println("From static method Interface B");
    }
}
