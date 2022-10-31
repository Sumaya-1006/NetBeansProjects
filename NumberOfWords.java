
package com.mycompany.method;

import java.util.Scanner;


public class NumberOfWords {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
       /* System.out.print("Enter the string value :");
        String str = scanner.nextLine();
        
        System.out.println("Enter the string value :"+wordsNumber(str));
        
    }

    private static int wordsNumber(String s) {
        String[] string = s.split("");
        return string.length; */
       
       /* System.out.print("Input the string: ");
        String str = scanner.nextLine();

        System.out.println("Number of words in the string: " + numOfWords(str));


    }
    public static int numOfWords(String s){
        String[] string = s.split(" ");
        return string.length;*/
       
       System.out.print("Enter the String :");
       String str = scanner.nextLine();
       
       System.out.println("The num of the string is :" +wordNumber(str));
        
    }

    private static int wordNumber(String str) {
         String []  string = str.split(" ");
         return string.length;
    }
        
       
    }
    

