package com.defaulMethods;

public interface C {
    default void print(){
        System.out.println("From Interface C");
    }
}
