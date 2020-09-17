package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);

        int numberPositives = 0;
        for (int i = 0; i < 3; i++) {
            if (scanner.nextInt() > 0)
                numberPositives++;
        }
        System.out.println(numberPositives);

    }
}
