package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];

        //write your code here
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int temp;
        for (int j = 0; j < 5; j++) {
            for (int i = 1; i < 5; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    temp = numbers[i - 1];
                    numbers[i-1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }



    }
}
