package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        for(int i = 0; i < 5; i++){
            Zerg zerg = new Zerg();
            zerg.name = "zerg" + i;
        }

        for(int i = 0; i < 3; i++){
            Protoss protoss = new Protoss();
            protoss.name = "protoss" + i;
        }

        for(int i = 0; i < 4; i++){
            Terran terran = new Terran();
            terran.name = "terran" + i;
        }

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
