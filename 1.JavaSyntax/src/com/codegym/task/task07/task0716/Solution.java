package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("rose");
        list.add("measure");
        list.add("bark");
        list.add("wade");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        ArrayList<String> myList = new ArrayList<String>();
        boolean rExists, lExists;
        for (int i = 0; i < list.size();) {
            if (list.get(i).contains("r") && !list.get(i).contains("l")){
                list.remove(i);
            }
            else if (!list.get(i).contains("r") && list.get(i).contains("l")){
                list.add(i, list.get(i));
                i++;
                i++;
            }
            else
                i++;
        }


        return list;
    }
}