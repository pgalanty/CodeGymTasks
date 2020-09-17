package com.codegym.task.task04.task0404;

/* 
Cat register

*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        //write your code here
        catCount++;
    }

    public static void main(String[] args) {

    }
}

//
//1. The Cat class must have only one catCount variable.
//2. The variable catCount must be a static int, have a private access modifier, and be initialized to zero.
//3. The Cat class must have two methods: addNewCat and main.
//4. The Cat class's addNewCat method should increase the number of cats by 1.