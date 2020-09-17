package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < 20; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            smallArray1[i] = bigArray[i];
            smallArray2[i] = bigArray[10 + i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(smallArray2[i]);
        }

    }
}
