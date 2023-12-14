package com.example6;

//problem statement
//compare two strings using .compareTo method

import java.util.Scanner;

public class compareStrings {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter string 1 : ");
        String string1 = sc.nextLine();

        System.out.println("enter string 2 : ");
        String string2 = sc.nextLine();

        //comparing strings using .compareTo
        // string1.compareTo(string2) returns
        // >0 or positive value when string1 > string2
        // <0 or negative value when string 1 < string2
        // 0 or zero when string1 = string2

        if (string1.compareTo(string2) == 0){
            System.out.println("string 1 is equal to string 2");
        }
        else {

            System.out.println("string1 is not equal to string 2");

            if (string1.compareTo(string2) > 0) {
                System.out.println("string 1 is greater than string 2");
                System.out.println("string 2 is less than string 1");
            }

            else if (string1.compareTo(string2) < 0) {
                System.out.println("string 2 is greater than string 1");
                System.out.println("string 1 is less than string 2");

            }

        }
    }
}

// you might wonder that we could have directly used == instead of
// .compareTo method, but we dont use == incase of strings because some test cases
// fail when we use == in strings i.e. == can give wrong answer also i.e. == is not
// reliable in strings, particularly in object oriented programming
// see below example

//if (new String("Tony") == new String("Tony")){
//        System.out.println("strings are equal");
//        }
//        else {
//        System.out.println("strings are not equal");
//        }

//the above code will return output "strings are not equal" which is wrong



