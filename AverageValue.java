
package com.mycompany.method;

import java.util.Scanner;


public class AverageValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input 1st number :");
        double x = scanner.nextDouble();
        
        System.out.println("Input 2nd number :");
        double y = scanner.nextDouble();
        
        System.out.println("Input 3rd number :");
        double z = scanner.nextDouble();
        
        System.out.println("The average num is :"+average (x,y,z));
        
    }

    private static double average(double x, double y, double z) {
        return (x+y+z)/3;
        
    }
    
}
