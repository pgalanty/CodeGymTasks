package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = new String[10];
        int[] intArray = new int [10];

        for (int i = 0; i < 10; i++) {
            stringArray[i] = reader.readLine();
            intArray[i] = stringArray[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(intArray[i]);
        }

    }
}
