
package com.mycompany.math;

import java.util.Scanner;


public class CalculatePower {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the num1 :");
        int num1 = scanner.nextInt();
        
         System.out.println("Enter the num2 :");
         int num2 = scanner.nextInt();
         
         System.out.println("Power of the number is :"+Math.pow(num1, num2));
         
         
        
        
        
    }
    
}
