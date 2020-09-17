package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "grey";
     }

     public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "grey";
     }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 1;
        this.age = age;
        this.color = "grey";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.age = 1;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = 1;
        this.color = color;
        this.address = address;
    }


    public static void main(String[] args) {

    }
}
