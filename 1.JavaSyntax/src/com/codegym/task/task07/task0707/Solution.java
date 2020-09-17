package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> lista = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            lista.add("nr " + i);
        }
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
