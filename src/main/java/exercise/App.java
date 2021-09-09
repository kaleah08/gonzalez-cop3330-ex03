package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        System.out.print("What is the quote? ");
        String quote = input.next();
        quote += input.nextLine();
        
        System.out.print("Who said it? ");
        String author = input.next();
        author += input.nextLine();
        System.out.println( author + " says, " + '"' + quote + '"');
    }
}
