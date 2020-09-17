package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name){
        this.name = name;
        this.age = 2;
        this.weight = 3;
        this.color = "grey";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "grey";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "grey";
    }

    public void initialize(int weight, String color){
        this.age = age =2;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = age =2;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {
    }
}
