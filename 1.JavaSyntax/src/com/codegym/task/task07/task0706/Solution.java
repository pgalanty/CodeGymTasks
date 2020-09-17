package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < 15; i++) {
            houses[i] = Integer.parseInt(reader.readLine());

            if (i%2 == 0) {
                sumEven = sumEven + houses[i];
            }
            if (i%2 == 1)
                sumOdd = sumOdd + houses[i];
        }

        if (sumOdd > sumEven)
            System.out.println("Odd-numbered houses have more residents.");
        else if (sumEven > sumOdd)
            System.out.println("Even-numbered houses have more residents.");

    }
}
