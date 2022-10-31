
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class TwoFloatingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input floating point number :");
        float num1 = scanner.nextFloat();
        
        System.out.println("Input another floating point number :");
        float num2 = scanner.nextFloat();
        
       /* if(num1==num2){
            System.out.println("They are same");
        
        }else{
           System.out.println("They are different"); 
        }*/
       
       num1 = Math.round(num1*1000);
       num2 = Math.round(num2*1000);
       
       if(num1==num2){
           System.out.println("They are same");
       
       }else{
           System.out.println("They are different");
       }
       
        
    }
    
}
