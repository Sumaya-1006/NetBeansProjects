
package com.mycompany.addsinteger;

import java.util.Scanner;


public class TwoInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input 1st integer :");
        int x = scanner.nextInt();
        
        System.out.println("Input 2nd integer :");
        int y = scanner.nextInt();
        
        System.out.println("Sum of two integers :" +(x+y));
        System.out.println("Difference of two integers :" +(x-y));
        System.out.println("Product of two integers :" +(x*y));
        System.out.println("Average of two integers :" +(x+y)/2);
        System.out.println("Distance of two integers :" +Math.abs(x-y));
        System.out.println("Max integer :" +Math.max(x, y));
        System.out.println("Min integer :" +Math.min(x, y));
    }
}
        
        
        
        
        
        
    
    

