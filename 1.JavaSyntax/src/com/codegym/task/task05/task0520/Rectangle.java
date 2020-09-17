package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    //write your code here
    int top, left, width = 0, height = 0;

    public Rectangle(int top){
        this.top = top;
        this.left = 0;
    }

    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }


    public static void main(String[] args) {

    }
}
