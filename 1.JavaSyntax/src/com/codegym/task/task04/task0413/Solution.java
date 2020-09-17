package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if(s.equals("1"))
            System.out.println("Monday");
        else if(s.equals("2"))
            System.out.println("Tuesday");
        else if(s.equals("3"))
            System.out.println("Wednesday");
        else if(s.equals("4"))
            System.out.println("Thursday");
        else if(s.equals("5"))
            System.out.println("Friday");
        else if(s.equals("6"))
            System.out.println("Saturday");
        else if(s.equals("7"))
            System.out.println("Sunday");
        else
            System.out.println("No such day of the week");

    }
}