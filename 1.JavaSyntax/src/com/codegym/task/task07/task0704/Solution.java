package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[array.length - 1 - i]);
        }

    }
}

