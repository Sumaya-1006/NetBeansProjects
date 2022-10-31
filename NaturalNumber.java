
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class NaturalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       /* int i;
        System.out.println("The first 10 natural number : ");
        
        
        for(i=1; i<=10; i++){
            System.out.println(i);
        } */
       
       // natural numbers sum
       
       int i, n,  sum = 0;
       {
       System.out.println("Entered the number : ");
        n = scanner.nextInt();
       }
       System.out.println("The first n natural number are :");
       
       for(i=1; i<=n; i++){
          System.out.println(i);
          sum += i;
       
       
    }
     System.out.println("The Sum of Natural Number upto "+ n + " terms : " +sum);
      
    }
}

    

