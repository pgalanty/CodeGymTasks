package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int scanned = 0;
        int sum = 0;

        while(!isExit){
            scanned = scanner.nextInt();
            sum += scanned;
            if (scanned == -1)
                isExit = true;
        }
        System.out.println(sum);
    }
}



//while (true) {
//        int number = read the number;
//        if (check whether the number is -1)
//        break;
//        }