package com.practice;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ParkingSlotsRequired {
    static int minParkingSpaces(int[][] parkingStartEndTimes) {
        int parkingSlotsRequired=0;
        Map<Integer,Integer> slots= new HashMap<>(parkingStartEndTimes.length);
        for(int i=0;i<parkingStartEndTimes.length-1;i++){
            if(!checkIfParkingSlotAvailable(parkingStartEndTimes[i][0],parkingStartEndTimes[i][1],slots)){
                slots.put(parkingStartEndTimes[i][0],parkingStartEndTimes[i][1]);
                parkingSlotsRequired++;
            }
        }
        return parkingSlotsRequired;

    }

    private static boolean checkIfParkingSlotAvailable(int startTime, int endTime, Map<Integer, Integer> slots) {
        boolean slotAvailable=false;
        if(slots != null && slots.size() > 0){
            for (Map.Entry<Integer, Integer> slotEntry : slots.entrySet()) {
                if(slotEntry.getValue() < startTime){
                    slotAvailable= true;
                    break;
                }
            }
        }
        return slotAvailable;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }
        int out = minParkingSpaces(parkingStartEndTimeList);
        System.out.println(out);
        wr.close();
        br.close();
    }
}
