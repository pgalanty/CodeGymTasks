package com.codegym.task.task06.task0610;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
ConsoleReader class

*/

public class ConsoleReader {


    public static String readString() throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.next());
    }

    public static double readDouble() throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.next());
    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        return Boolean.parseBoolean(scanner.next());
    }

    public static void main(String[] args) {

    }
}
