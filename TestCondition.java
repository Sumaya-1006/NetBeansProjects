
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class TestCondition {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Input num :");
      int num = scanner.nextInt();
      
      if(num>0){
          System.out.println("Number is positive");
      
      }else if(num<0){
          System.out.println("Number is negative");
     
      }else{
          System.out.println("Number is zero"); 
      }
    }
}
          
          
          
    
        

