
package com.mycompany.math;

import java.util.Scanner;


public class IntegerToAbsolute {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Integer value : ");
        int x = scanner.nextInt();
        
        System.out.println("The absolute value is : " +Math.abs(x));
    }
    
}
