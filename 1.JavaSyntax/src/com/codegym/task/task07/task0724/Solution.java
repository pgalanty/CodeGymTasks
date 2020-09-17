package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human grandpa1 = new Human("Dziadek Marek", true, 67);
        Human grandpa2 = new Human("Dziadek Jurek", true, 72);
        Human grandma1 = new Human("Babcia Basia", false, 59);
        Human grandma2 = new Human("Babcia Bogusia", false, 62);

        Human dad = new Human("Tata Pawel", true, 35, grandpa1, grandma1);
        Human mom = new Human("Mama Monika", false, 34, grandpa2, grandma2);

        Human kid1 = new Human("Paulinka", false, 6, dad, mom);
        Human kid2 = new Human("Tosia", false, 3, dad, mom);
        Human kid3 = new Human("Wojtek", true, 1, dad, mom);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(grandpa1);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}