package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int sum = 0;

        while(true) {
            s = reader.readLine();
            if(s.equals("sum"))
                break;
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);

    }
}
