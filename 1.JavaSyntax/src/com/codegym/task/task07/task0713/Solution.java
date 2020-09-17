package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> numbersDiv3 = new ArrayList<Integer>();
        ArrayList<Integer> numbersDiv2 = new ArrayList<Integer>();
        ArrayList<Integer> otherNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int number : mainList) {
            if (number%6 == 0){
                numbersDiv2.add(number);
                numbersDiv3.add(number);
            }
            else {
                if (number % 2 == 0)
                    numbersDiv2.add(number);
                else if (number % 3 == 0)
                    numbersDiv3.add(number);
                else
                    otherNumbers.add(number);
            }
        }

        printList(numbersDiv3);
        printList(numbersDiv2);
        printList(otherNumbers);

    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
