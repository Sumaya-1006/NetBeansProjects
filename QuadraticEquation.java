
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a = ");
        double a = scanner.nextDouble();
        
        System.out.println("Input b = ");
        double b = scanner.nextDouble();
        
        System.out.println("Input c = ");
        double c = scanner.nextDouble();
        
        double result = (b*b-4*a*c);
        
        if(result>0){
            double r1 = ((-b+ Math.sqrt(result))/2*a);
            double r2 = ((-b- Math.sqrt(result))/2*a);
            System.out.println("The roots is : " + r1 + " and " +r2);
        
        }else if(result == 0){
        double r = (-b/2*a);
        System.out.println("The roots is : " + r );
    
        }else{
          System.out.println("There is no root" );  
        }
    }
}