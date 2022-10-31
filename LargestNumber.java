
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class LargestNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the 1st number : ");
        int num1 = scanner.nextInt();
        
        System.out.println("Input the 2nd number : ");
        int num2 = scanner.nextInt();
        
        System.out.println("Input the 3rd number : ");
        int num3 = scanner.nextInt();
         
       /* if(num1>num2)
            if(num1>num3){
                System.out.println("The greatest is :" +num1);
            }
        if(num2>num3)
            if(num2>num1){
               System.out.println("The greatest is :" +num2); 
            }
        if(num3>num1)
            if(num3>num2){
                System.out.println("The greatest is :" +num3); 
            } */
       
       if(num1>num2 && num1>num3){
          System.out.println("The greatest is :" +num1);
          
      
       }else if(num2>num1 && num2>num3 ){
           System.out.println( "The greatest is :" +num2);
       
       }else{
           System.out.println( "The greatest is :" +num3);
       }
    }
    
}
