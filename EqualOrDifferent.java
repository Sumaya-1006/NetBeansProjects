
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class EqualOrDifferent {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Input first number : ");
        int x = scanner.nextInt();
        
         System.out.println(" Input first number : ");
        int y = scanner.nextInt();
        
         System.out.println(" Input first number : ");
        int z = scanner.nextInt();
        
        if(x==y && y==z && z==x ){
         System.out.println(" Input number are same "); 
        
        }else if(x==y || y==z || z==x){
            System.out.println(" Input number are equal or different "); 
        }else{
            System.out.println(" Input number are different "); 
        }
    }
    
    
}
