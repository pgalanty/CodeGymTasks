package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(catGrandmother, motherName);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }


    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
        }

        Cat(Cat mother, String name) {
            this.name = name;
            this.mother = mother;
        }

        public Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }


        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother , no father";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
            else if (father == null)
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            else
                return "The cat's name is " + name + ", " + mother.name + " is the mother, " + father.name + " is the father";
        }
    }

}

//    The cat's name is Grandfather Tiger, no mother, no father
//    The cat's name is Grandmother Puss, no mother, no father
//    The cat's name is Father Oscar, no mother, Grandfather Tiger is the father
//    The cat's name is Mother Missy, Grandmother Puss is the mother, no father
//    The cat's name is Son Simba, Mother Missy is the mother, Father Oscar is the father
//    The cat's name is Daughter Coco, Mother Missy is the mother, Father Oscar is the father