package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //write your code here
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        maximum = numbers[0];
        minimum = numbers[0];

        for (int i = 0; i < 20; i++) {
            maximum = numbers[i] > maximum ? numbers[i] : maximum;
            minimum = numbers[i] < minimum ? numbers[i] : minimum;
        }

        System.out.print(maximum + " " + minimum);
    }
}
