package com.consumers;

import java.util.function.BiConsumer;

public class TestBiConsumer {

    public static void main(String[] args) {
        BiConsumer<String,String> printConsumer=(s,s1) -> System.out.println(s+" "+s1);
        printConsumer.accept("Welcome ","to");
        printConsumer.accept("Bi-Consumer ","POC");
    }
}
