package com.example6;

//problem statement
//demonstrate basic operations on strings

import java.util.Scanner;

public class stringBasicOperations {

    public static void main(String[] args){

        //concatenation of strings
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string 1 (First name) : ");
        String firstName = sc.nextLine();

        System.out.println("enter string 2 (last name) : ");
        String lastName = sc.nextLine();

        String fullName = firstName + "@" + lastName;
        // example tony@stark
        System.out.println(fullName);
        System.out.println(fullName.length());
        //.length method is used to print the length of the string

        //charAt
        //it is used to return the character in the string at the particular index
        //, which is passed as argument in the brackets

        //iterating through string i.e. using for loop and charAt method to
        //print every element present in the string
        for (int i = 0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
