package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int sum = 0;
        int i = 100;
        while(number > 0){
            sum += number/i;
            number -= (number/i)*i;
            i /= 10;
        }
        return sum;
    }
}