
package com.mycompany.math;

import java.util.Scanner;


public class IntegralFractional {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the num : ");
        double num = scanner.nextDouble();
        
        System.out.println("Enter original value : " +num);
        double fractional = num % 1;
        double integral = num - fractional;
        
        System.out.println("Integral part : " + integral);
        
         System.out.println("fractional part : " + fractional);
        
        
    }
    
}
