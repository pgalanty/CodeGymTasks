package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int temp;

        if (a > c){
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(c + " " + b + " " + a);
    }
}
