
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class IncreasingNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input first number : ");
        int x = scanner.nextInt();
        
        System.out.println("Input first number : ");
        int y = scanner.nextInt();
        
        System.out.println("Input first number : ");
        int z = scanner.nextInt();
        
        if(x<y && y<z){
            System.out.println("Increasing order ");
        
        }else if(x>y && y>z){
           System.out.println("Decreasing order "); 
       
        }else{
            System.out.println("Increasing or Decreasing order ");
        }
    }
    
    
}
