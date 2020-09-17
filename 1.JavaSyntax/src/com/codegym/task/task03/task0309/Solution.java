package com.codegym.task.task03.task0309;

/* 
Sum of 5 numbers

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int sum;
        for (int i = 1; i <=5; i++){
            sum = 0;
            for (int j = 1; j<=i; j++)
                sum+=j;
            System.out.println(sum);
        }
    }
}
