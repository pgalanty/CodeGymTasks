package com.codegym.task.task05.task0522;

/* 
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //write your code here
    public Circle(){}

    public Circle(int x){
        this.x = x;
    }

    public Circle(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Circle(int x, int y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}