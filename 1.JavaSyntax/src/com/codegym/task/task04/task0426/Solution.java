package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 0 && number%2 == 0)
            System.out.println("Negative even number");
        else if (number < 0 && number%2 != 0)
            System.out.println("Negative odd number");
        else if (number == 0)
            System.out.println("Zero");
        else if (number > 0 && number%2 == 0)
            System.out.println("Positive even number");
        else if (number > 0 && number%2 != 0)
            System.out.println("Positive odd number");
    }
}



//        "Negative even number" - if the number is negative and even,
//        "Negative odd number" - if the number is negative and odd,
//        "Zero" - if the number is 0,
//        "Positive even number" - if the number is positive and even,
//        "Positive odd number" - if the number is positive and odd.