package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<>();
        int minLength = 0;
        int minLengthIndex = 0;
        int maxLength = 0;
        int maxLengthIndex = 0;
        for (int i = 0; i < 10; i++) {
            lista.add(reader.readLine());
        }

        for (int i = 0; i < 10; i++) {
            if (minLength == 0 && maxLength == 0) {
                minLength = lista.get(i).length();
                minLengthIndex = i;
                maxLength = lista.get(i).length();
                maxLengthIndex = i;
            }

            if (lista.get(i).length() < minLength) {
                minLength = lista.get(i).length();
                minLengthIndex = i;
            }

            if (lista.get(i).length() > maxLength){
                maxLength = lista.get(i).length();
                maxLengthIndex = i;
            }

        }

        if (minLengthIndex < maxLengthIndex)
            System.out.println(lista.get(minLengthIndex));
        else
            System.out.println(lista.get(maxLengthIndex));
    }
}