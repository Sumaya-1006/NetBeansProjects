
package com.mycompany.math;

import java.util.Scanner;


public class SquareRootNumber {
    
    //Babylonian method
    
   public static float square_Root(float num){
        float a = num;
        float b = 1;
        double e = 0.000001;
        
        while(a-b>e){
            a= (a+b)/2;
            b= num/a;
            
        }
       return a; 
        
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integer :");
        int num = scanner.nextInt();
        
        System.out.println("Square root of a number using Babylonian method is :"+square_Root(num));
    
    
    
     }
    }

