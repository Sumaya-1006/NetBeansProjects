
package com.mycompany.addsinteger;

import java.util.Scanner;


public class BreakInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input non-negative digit :");
        int num = scanner.nextInt();
        
        int x1 = num/100000%10;
        int x2 = num/10000%10;
        int x3 = num/1000%10;
        int x4 = num/100%10;
        int x5 = num/10%10;
        int x6 = num%10;
        
        
        System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5 + " " + x6);
        
      
        
        
        
    }
    
}
