package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    //write your code here
    public static int convertToSeconds(int hours) {
        int seconds = hours * 3600;
        return seconds;
    }


    public static void main(String[] args) {
        //write your code here
        System.out.println(convertToSeconds(5));
        System.out.println(convertToSeconds(3));
    }
}


//1. Add the convertToSeconds method. It must be public static, and take and return ints.
//2. The convertToSeconds method must convert the passed number of hours to seconds.
//3. The main method must call the convertToSeconds method twice.
//4. The main method should display the result of the calls, each time on a new line.
//5. The convertToSeconds method should not display anything.