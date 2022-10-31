
package com.mycompany.math;

import java.util.Scanner;


public class FibonacciDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the numbers :");
        int x = scanner.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int fibo;
        
        System.out.println( firstNum+ " " + secondNum);
        
        for(int i =3; i<=x; i++){
            fibo = firstNum + secondNum;
            System.out.println(""+fibo);
            firstNum = secondNum;
            secondNum = fibo;
            
        }
    }
    
}
