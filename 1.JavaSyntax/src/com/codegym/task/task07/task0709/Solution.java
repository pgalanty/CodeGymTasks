package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();
        int minLength = 0;
        for (int i = 0; i < 5; i++) {
            lista.add(reader.readLine());
            if (minLength == 0)
                minLength = lista.get(i).length();
            else {
                minLength = lista.get(i).length() < minLength ? lista.get(i).length() : minLength;
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() == minLength)
                System.out.println(lista.get(i));
        }


    }
}
