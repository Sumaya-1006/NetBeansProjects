
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class CubeInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        System.out.println("Input the numbers :");
        int n = scanner.nextInt();
        
        for(i=1; i<=n; i++){
            System.out.println(" number is : " + i + " and cube of "  + i + " is " + (i*i*i) );
        }
    }
    
}
