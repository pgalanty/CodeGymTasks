package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (char x: s.toCharArray()) {
            if (Character.getNumericValue(x)%2 == 1) {
                odd++;
            } else {
                even++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
