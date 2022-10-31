
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class FloatingNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the value : ");
        double x = scanner.nextDouble();
        
        if(x==0){
          System.out.println("The number is zero");  
       
        }else if(x>1){
          
            if(x<1) {
             System.out.println("positive small number");  
         
            }else if(x>1000000) {
              System.out.println("positive large number");  
            }
            else{
               System.out.println("The number is positive");   
            }
        }else{
            System.out.println("The number is negative");  
        }

      /* String s1 ="";
       String s2 ="";
       
       if(x==0)
           s2 =" zero ";
       
       if(x>1)
           s2 =" positive ";
       
       else
           s2 = " negative ";
       
       if(Math.abs(x)> 1000000)
           s1 = " large ";
       
       else if(Math.abs(x)>1)
           s1 = " small ";
       System.out.println(s1 +s2+ "number");*/
       
    }
}
  
