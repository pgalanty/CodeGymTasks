package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Sam", "I", "Am");

        for (int i = 1; i < 6; i= i+2) {
            list.add(i, "Ham");
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }
    }
}
