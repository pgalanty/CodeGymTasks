package com.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            lista.add(0, reader.readLine());
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
    }
}
