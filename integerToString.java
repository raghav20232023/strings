package com.example6;

//problem statement
//input an integer from the user and convert it to string and print its length

import java.util.Scanner;

public class integerToString {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter an integer : ");
        int number = sc.nextInt();

        String string1 = Integer.toString(number);  //converts integer to integer-string

        System.out.println("the integer converted to string is : " + string1);
        System.out.println("the length of string-integer is : " + string1.length());

    }
}
