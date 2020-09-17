package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] stringArray = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            stringArray[i] = scanner.next();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stringArray[9-i]);
        }

    }
}