package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lista.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            lista.add(0,(lista.remove(4)));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(lista.get(i));
        }

    }
}
