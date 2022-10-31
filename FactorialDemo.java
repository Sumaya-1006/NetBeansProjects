
package com.mycompany.math;

import java.util.Scanner;


public class FactorialDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, fact =1;
        
        System.out.println("Enter s positive num ");
        num = scanner.nextInt();
        
        for(int i = num; i>=1; i--){
            fact = fact*i;
        }
        
        System.out.println("Factorial = " +fact);
        
        
    }
    
}
