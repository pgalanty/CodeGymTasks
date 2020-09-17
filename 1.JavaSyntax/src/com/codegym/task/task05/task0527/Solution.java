package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        //write your code here
        Cat tomCat = new Cat("Tom", 1, 2);
        Dog spikeDog = new Dog("Spike", 'Y', 100);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //write your code here
    public static class Cat {
        String name;
        int height;
        int age;

        public Cat(String name, int height, int age) {
            this.name = name;
            this.height = height;
            this.age = age;
        }
    }

    public static class Dog {
        String name;
        char canBark;
        int pooSize;

        public Dog(String name, char canBark, int pooSize) {
            this.name = name;
            this.canBark = canBark;
            this.pooSize = pooSize;
        }
    }


}
