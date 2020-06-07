package com.practice;

import java.util.HashMap;
import java.util.Map;

public class PairOfNumberWithProvidedSum {

    public static void main(String[] args) {
        int numbers[] = {2,3,5,1,5,7,8,9,6,2,0};
        int sum=10;
        Map<Integer,Integer> map = new HashMap<>();
        for (int number : numbers) {
            int diff = sum - number;
            if(map.containsKey(diff)){
                map.put(diff,number);
                System.out.println(diff+" -- "+number);
            } else {
                map.put(number,0);
            }
        }

    }
}
