
package com.mycompany.math;

import java.util.Scanner;


public class RoundFloatNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("Input a number : ");
       float x = scanner.nextFloat();
       
      
        System.out.format("%.4f", x);
       
       
    }
}


    

