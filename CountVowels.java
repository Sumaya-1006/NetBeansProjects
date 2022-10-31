
package com.mycompany.method;

import java.util.Scanner;


public class CountVowels {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Input the string: ");
        String str = scanner.next();
       
        System.out.println("Number of  Vowels in the string: " + numOfVowels(str));


    }
    public static int numOfVowels(String s){
        String vowels = "aeoiu";
        int countVowels = 0;
        for (int i = 0; i < s.length(); i++){
            if (vowels.contains(String.valueOf(s.charAt(i))))
                countVowels++;
        }
        return countVowels;
     
    }

    }
    

