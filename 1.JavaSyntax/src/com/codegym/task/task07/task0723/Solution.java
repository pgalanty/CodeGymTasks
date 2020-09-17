package com.codegym.task.task07.task0723;

/* 
Countdown

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //write your code here
            Thread.sleep(250);
        }
        System.out.println("Boom!");
    }
}
