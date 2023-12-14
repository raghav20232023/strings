package com.example6;

//problem statement
//take an array of strings input from the user and find
//the cumulative (combined) length of all those strings

import java.util.Scanner;

public class cumulativeStringLength {

    public static void main(String[] args){

        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String array1[] = new String[size];

        int totalLength = 0;    //initialize the variable that will be used to store
        // total length of all strings combined.

        //iterating through individual string elements of the array
        for (int i = 0; i<size; i++) {
            totalLength = totalLength + array1[i].length();
            // updates the value of variable totalLength with every iteration of
            // the for loop and thus length of every string element of array array1
            // is added to variable totalLength
        }

        System.out.println("The total length of all the string elements in string array combined is : "+totalLength);

    }
}
