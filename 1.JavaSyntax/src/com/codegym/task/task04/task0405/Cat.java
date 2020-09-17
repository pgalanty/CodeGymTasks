package com.codegym.task.task04.task0405;

/* 
Setting the number of cats

*/

public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int catCount) {
        //write your code herea
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}

//1. The Cat class must have only one catCount variable.
//2. The variable catCount must be a static int, have a private access modifier, and be initialized to zero.
//3. The Cat class must have two methods: setCatCount and main.
//4. The Cat class's setCatCount method must set the value of the catCount variable equal to the passed argument.