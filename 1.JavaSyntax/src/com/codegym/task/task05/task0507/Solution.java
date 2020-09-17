package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        double sum = 0;
        double counter = 0;
        double result;
        int scanned;

        while (!isExit) {
            scanned = scanner.nextInt();
            sum += scanned;
            counter++;
            if (scanned == -1)
                isExit = true;
        }
        sum++;
        counter--; 
        result = sum/counter;
        System.out.println(result);

    }
}

