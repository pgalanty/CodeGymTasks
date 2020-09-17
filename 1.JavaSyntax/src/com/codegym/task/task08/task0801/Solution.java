package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("watermelon");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("pear");
        fruits.add("cantaloupe");
        fruits.add("blackberry");
        fruits.add("ginseng");
        fruits.add("strawberry");
        fruits.add("iris");
        fruits.add("potato");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);
        }

    }
}



