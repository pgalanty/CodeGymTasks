package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);

        System.out.println("Minimum = " + minimum);

        int a1 = Integer.parseInt(reader.readLine());
        int b1 = Integer.parseInt(reader.readLine());
        int c1 = Integer.parseInt(reader.readLine());
        int d1 = Integer.parseInt(reader.readLine());
        int e1 = Integer.parseInt(reader.readLine());

        System.out.println("Minimum = " + min(a1, b1, c1, d1, e1));

    }


    public static int min(int a, int b) {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e) {
        int minimum;
        minimum = min(a, b);
        minimum = min(minimum, c);
        minimum = min(minimum, d);
        minimum = min(minimum, e);

        return minimum;
    }
}
