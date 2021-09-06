/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

//get Scanner class from java.util
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask the user to input a string
        System.out.print("What is the input string? ");
        String in = input.nextLine();
        //now output how many characters the string has
        System.out.printf("%s has %d characters.", in, in.length());
    }
}
