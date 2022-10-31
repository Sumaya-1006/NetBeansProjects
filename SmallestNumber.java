
package com.mycompany.method;

import java.util.Scanner;


public class SmallestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the first number : ");
        double x = scanner.nextDouble();
        
        System.out.println("Input the second number : ");
        double y = scanner.nextDouble();
        
        System.out.println("Input the third number : ");
        double z = scanner.nextDouble();
        System.out.println("The smallest num is :" + smallest(x,y,z));
    }
    public static double smallest(double x, double y, double z){
        return Math.min(Math.min(x,y),z);
    }
    
    
}
