package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int lengthAsc = 0;
        for (int i = 0; i < 10;) {
            if (lengthAsc <= list.get(i).length()) {
                lengthAsc = list.get(i).length();
                i++;
            }
            else {
                System.out.println(i);
                break;
            }
        }

    }
}

