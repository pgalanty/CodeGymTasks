package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}


//<name> will receive <number1> in <number2> years.