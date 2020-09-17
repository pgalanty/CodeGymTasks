package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int N, M;
        ArrayList<String> list = new ArrayList<String>();
        N = Integer.parseInt(reader.readLine());
        M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        for (int i = 0; i < M; i++) {
            list.add(list.remove(0));
        }

        for (String item : list) {
            System.out.println(item);
        }

    }
}
