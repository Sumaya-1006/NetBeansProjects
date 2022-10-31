
package com.mycompany.math;

import java.util.Scanner;


public class FloatToRoundedFloat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter floating number :");
        float x = scanner.nextFloat();
        
        System.out.println("The rounded float value is :" + Math.round(x));
    }
    
}
