
package com.mycompany.method;

import java.util.Scanner;


public class SumInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the integer number :");
        int num = scanner.nextInt();
        
        System.out.println("The sum is :" +sumDigit(num));
    }

    private static int sumDigit(long n) {
        int sum = 0;
        while(n>0){
            
            sum += n % 10;
            n /=10;
        
        }
        
       return sum;
    }
    
}
