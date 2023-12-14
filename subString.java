package com.example6;

import java.util.Scanner;

//problem statement
//create a substring i.e. a smaller string from a given larger string
public class subString {

    public static void main(String[] args){

        //stringName.substring method is used to create a smaller string by selecting a few
        //characters from a larger string

        //.substring method takes in the starting index (inclusive) and the ending index as parameters
        // by default if
        // no starting index is passed then default argument is 0
        // no ending index is passed then default argument is stringname.length() or the last index + 1
        // remember the ending index argument of substring method is not inclusive


        // Note : Strings are immutable

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string whose substring is to be found");
        String string1 = sc.nextLine();

        System.out.println("enter starting index : ");
        int start = sc.nextInt();

        System.out.println("enter ending index + 1 : ");
        // ending index + 1 as ending index argument of .substring method is non inclusive
        int end = sc.nextInt();

        System.out.println("The required substring is : "+ string1.substring(start,end));


    }
}
