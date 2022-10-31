
package com.mycompany.math;

import java.util.Scanner;


public class PrimeNumbers {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the integer number :");
        int num = scanner.nextInt();
        int count = 0;
        
        for(int i=2; i<num; i++){
           
            if(num%i==0){
                count++;
                break;
                
            }
        }
        if(count == 0){
          System.out.print("Prime number");  
        }else{
            System.out.print("Not Prime number");   
        }
    }
    
}
