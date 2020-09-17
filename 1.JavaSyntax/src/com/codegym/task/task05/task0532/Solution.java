package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;

        //write your code here;
        int n;
        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            maximum = Integer.parseInt(reader.readLine());
            for (int i = 0; i < N - 1; i++) {
                n = Integer.parseInt(reader.readLine());
                maximum = n > maximum ? n : maximum;
            }
            System.out.println(maximum);
        }
    }
}
