
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class CheckInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        
        if(num>0){
            System.out.println("Number is positive");
       
        }else if(num<0){
            System.out.println("Number is Negative");
        
        }else{
            System.out.println("Number is Zero");
        }
    }
    
}
