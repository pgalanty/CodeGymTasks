package com.codegym.task.task04.task0406;

/* 
Name register

*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;

        //write your code here
        this.fullName = fullName;
    }

    public static void main(String[] args) {

    }
}

//1. The Cat class must contain only one fullName variable.
//2. The variable fullName must be a String and have a private access modifier.
//3. The Cat class must have only two methods: setName and main.
//4. The setName method must have a local variable fullName.
//5. The Cat class's setName method must set the value of the global private String variable fullName equal to the local variable fullName.