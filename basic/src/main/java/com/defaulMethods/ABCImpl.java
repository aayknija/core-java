package com.defaulMethods;

public class ABCImpl implements A , B , C {
    public static void main(String[] args) {
        A abc = new ABCImpl();
        abc.print();
    }

    @Override
    public void print() {
        System.out.println("From ABCImpl");
    }
}
