package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String name = reader.readLine();
        System.out.println(name + " will take over the world in " + number + " years. Mwa-ha-ha!");
    }
}
// <name> will take over the world in <number> years. Mwa-ha-ha!