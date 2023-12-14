package com.example6;

//problem statement
//input a string from the user. Create a new string called "result"
//in which you will replace the letter 'e' in the original string
//with letter 'i'

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class stringReplaceEToI {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("program to replace e to i in string input by user");
        System.out.println("Enter string to be mutated : ");

        String string = sc.nextLine();

        String result = ""; //defining an empty string

        //the below loop searches through the string by iterating through
        //each character using for loop and string method .charAt(index)
        //it searches for e, if it doesn't find e then it simply adds that character
        //in the string result
        //if it encounters e during its search, then it adds i instead of the character itself
        //i.e. e
        for (int i = 0; i<string.length(); i++){
            if(string.charAt(i) == 'e'){
                result = result + 'i';

            } else {
                result = result + string.charAt(i);
            }
        }

        System.out.println("the resulting string with e -- > i is : "+result);

    }
}
