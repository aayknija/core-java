package com.consumers;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        Consumer<String> printConsumer=(s) -> System.out.println(s);
        printConsumer.accept("Welcome ");
        printConsumer.accept("to ");
        printConsumer.accept("Consumer ");
        printConsumer.accept("POC ");
    }
}
