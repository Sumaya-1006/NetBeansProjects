
package com.mycompany.addsinteger;

import java.util.Scanner;


public class SwapNumbers {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the num :");
        int x = scanner.nextInt();
        
          System.out.println("Enter the num :");
          int y = scanner.nextInt();
          
          x =x+y;
          y= x-y;
          x= x-y;
          
          System.out.println("After swaping x is :" +x );
          System.out.println("After swaping y is :" +y );
    }
    
}
