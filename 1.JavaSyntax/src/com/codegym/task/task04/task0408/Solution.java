package com.codegym.task.task04.task0408;

/* 
Good or bad?

*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        //write your code here
        if (a < 5)
            System.out.println("The number is less than 5");
        if (a > 5)
            System.out.println("The number is greater than 5");
        if (a == 5)
            System.out.println("The number is equal to 5");
    }
}

/*
    Write the compare(int a) method so that it:
        - displays "The number is less than 5" if the method argument is less than 5,
        - displays "The number is greater than 5" if the method argument is greater than 5,
        - displays "The number is equal to 5" if the method argument is equal to 5.


        Requirements:
        1. The program should display text on the screen.
        2. The main method should not call System.out.println or System.out.print.
        3. The main method should call the compare method.
        4. The compare method must be void.
        5. The compare method should display text on the screen in accordance with the task conditions.*/
