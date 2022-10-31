
package com.mycompany.conditionalstatement;

import static java.lang.Double.sum;
import java.util.Scanner;


public class SumAverage {
    public static void main(String [] args){
      /*  int i,n=0,s=0;
        double avg;
        {
          
        
           System.out.println("Input the 5 numbers :");  
        }
        
        for(i=0; i<5;i++){
           Scanner scanner = new Scanner(System.in);
           n = scanner.nextInt();
           s +=n;
        }
       
        avg=s/5;
	System.out.println("The sum of 5 no is : " +s+"\nThe Average is : " +avg); */
      
      
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the 5 numbers: ");
         
        int sum = 0; 
        for (int i = 0; i < 5; i++){
           
         sum += scanner.nextInt();
        }
        System.out.println("The sum of 5 no is : " + sum);
        
        System.out.println("The Average is : " + sum / 5);
    }
}
    
    

