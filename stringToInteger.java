package com.example6;

//problem statement
//input an integer string and convert it to integer

import java.util.Scanner;

public class stringToInteger {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a numeric string : ");
        String string1 = sc.next();

        int number = Integer.parseInt(string1); //converts a numeric string to int

        System.out.println("the string converted to int is : "+ number);

    }
}
