package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("Jerry", 42, "Nowhere");
        Man man2 = new Man("Jerry", 42, "Nowhere");
        Woman woman1 = new Woman("Miss", 31, "Somewhere");
        Woman woman2 = new Woman("Miss", 31, "Somewhere");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    //write your code here
    public static class Man {
        String name;
        int age;
        String address;

        public Man() {
        }

        public Man(String name) {
            this.name = name;
        }

        public Man(int age) {
            this.age = age;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman() {
        }

        public Woman(String name) {
            this.name = name;
        }

        public Woman(int age) {
            this.age = age;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(int age, String address) {
            this.age = age;
            this.address = address;
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}
