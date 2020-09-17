package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // write your code here
        int aTo10 = abs(10-a);
        int bTo10 = abs(10-b);
        int result = (aTo10 < bTo10) ? a : b;
        System.out.println(result);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}