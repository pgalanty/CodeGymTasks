package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        boolean isEnd = false;
        ArrayList<String> list = new ArrayList<String>();
        String s;

        while(!isEnd) {
            s = reader.readLine();
            if (s.equals("end"))
                isEnd = true;
            else
                list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}