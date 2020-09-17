package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int maxLength = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            if (maxLength == 0) {
                maxLength = strings.get(i).length();
            }
            else
                maxLength = strings.get(i).length() > maxLength ? strings.get(i).length() : maxLength;
        }

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == maxLength)
                System.out.println(strings.get(i));
        }

    }
}
