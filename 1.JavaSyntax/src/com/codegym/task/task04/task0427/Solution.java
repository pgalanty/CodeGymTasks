package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        if (digit > 0 && digit < 10 && digit%2 ==0)
            System.out.println("even single-digit number");
        else if (digit > 0 && digit < 10 && digit%2 !=0)
            System.out.println("odd single-digit number");
        else if (digit >= 10 && digit < 100 && digit%2 ==0)
            System.out.println("even two-digit number");
        else if (digit >= 10 && digit < 100 && digit%2 !=0)
            System.out.println("odd two-digit number");
        else if (digit >= 100 && digit < 1000 && digit%2 ==0)
            System.out.println("even three-digit number");
        else if (digit >= 100 && digit < 1000 && digit%2 !=0)
            System.out.println("odd three-digit number");

    }
}


//        "even single-digit number" - if the number is even and has one digit,
//        "odd single-digit number" - if the number is odd and has one digit,
//        "even two-digit number" - if the number is even and has two digits,
//        "odd two-digit number" - if the number is odd and has two digits,
//        "even three-digit number" - if the number is even and has three digits,
//        "odd three-digit number" - if the number is odd and has three digits.