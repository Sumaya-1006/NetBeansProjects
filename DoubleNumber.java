
package com.mycompany.math;

import java.util.Scanner;


public class DoubleNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the number :");
        double num = scanner.nextDouble();
        
        if( (num%1)==0){
            System.out.println("The number is not double");
        }else{
            System.out.println("The number is double");
        }
    }
}
