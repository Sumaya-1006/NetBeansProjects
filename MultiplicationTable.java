
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the number (Table to be calculated) :");
        
        System.out.println("Input number of terms :");
        int num = scanner.nextInt();
        
        for(int i=0; i<=10; i++){
            System.out.println(num + " X " + i + " = " + num * i );
        }
        
    }
    
}
