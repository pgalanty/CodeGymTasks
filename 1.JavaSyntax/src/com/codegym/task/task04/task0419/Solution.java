package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

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
        int d = scanner.nextInt();

        int maximum;
        maximum = a > b ? a : b;
        maximum = c > maximum ? c : maximum;
        maximum = d > maximum ? d : maximum;

        System.out.println(maximum);


    }
}
