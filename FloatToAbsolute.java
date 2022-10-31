
package com.mycompany.math;

import java.util.Scanner;


public class FloatToAbsolute {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the floating number :");
        float x = scanner.nextFloat();
        
        System.out.println("The absolute number is :"  + Math.abs(x));
        
    }
    
}
