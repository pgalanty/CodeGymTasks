package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        double t = Double.parseDouble(s);
        double residuum = t%5;

        if (residuum < 3)
            System.out.println("green");
        if (residuum >= 3 && residuum < 4)
            System.out.println("yellow");
        if (residuum >= 4)
            System.out.println("red");
    }
}