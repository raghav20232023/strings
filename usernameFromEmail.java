package com.example6;

//problem statement
//input an email from the user. You have to create a username from the email by deleting the part
//that comes after '@'. Display the username to the user.
//example :
//email : raghavjava@gmail.com
//username : raghavjava

import java.util.Scanner;

public class usernameFromEmail {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the email address : ");

        String emailID = sc.nextLine();

        String username = "";   //create an empty string username
        // to which characters will be appended later on

        //the for loop given beow iterates through the characters of the string
        //when it does not encounter @ it simply adds that element to string username
        //using method .charAt
        //if it encounters @ during traversal of string then it simply breaks out of the loop
        //i.e. the loop stops and we are left with just the characters before @ i.e. username

        for (int i = 0; i< emailID.length(); i++){
            if (emailID.charAt(i) == '@'){
                break;
            } else {
                username = username + emailID.charAt(i);
            }
        }
        System.out.println("your username is : "+ username);

    }
}
