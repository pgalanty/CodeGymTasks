package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int nPositives = 0;
        int nNegatives = 0;
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            temp = scanner.nextInt();
            if (temp > 0)
                nPositives++;
            else if (temp < 0)
                nNegatives++;
        }
        System.out.println("Number of negative numbers: " + nNegatives);
        System.out.println("Number of positive numbers: " + nPositives);
    }
}
