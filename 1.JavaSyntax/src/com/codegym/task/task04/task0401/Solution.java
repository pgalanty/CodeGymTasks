package com.codegym.task.task04.task0401;

/* 
This age doesn't work for me…

*/
public class Solution {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            this.age = this.age + 20;
            System.out.println("The age in adjustAge() is " + age);
        }
    }
}

/*
1. The program should display text on the screen.
2. The Person class should have a public int field called age.
3. The Person class's adjustAge method should display text on the screen.
4. The Person class's adjustAge method must have only one int parameter named age, and the method must be void.
5. The main method should call the adjustAge method only once.
6. The Person class's adjustAge method should increase the Person's age by 20.*/
