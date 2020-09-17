package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashMap<String, String> fruits = new HashMap<>();
        fruits.put("watermelon", "melon");
        fruits.put("banana", "fruit");
        fruits.put("cherry", "fruit");
        fruits.put("pear", "fruit");
        fruits.put("cantaloupe", "melon");
        fruits.put("blackberry", "fruit");
        fruits.put("ginseng", "root");
        fruits.put("strawberry", "fruit");
        fruits.put("iris", "flower");
        fruits.put("potato", "tuber");

        Iterator<Map.Entry<String, String>> iterator = fruits.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}