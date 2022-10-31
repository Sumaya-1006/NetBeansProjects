
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class NestedLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1st num :");
        int x = scanner.nextInt();
        
        System.out.println("Enter 2nd num :");
        int y = scanner.nextInt();
        
        for( int i = x; i<=y; i++){
            for(int j =0; j<=10; j++){
                System.out.println(i  + "X" + i + "  = "  +i*j);
            }
        }
    }
    
}
