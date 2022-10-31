
package com.mycompany.addsinteger;

import java.util.Scanner;


public class DoubleLongFloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input Integer :");
        int num1 = scanner.nextInt();
        
        System.out.println("Input long :");
        long num2 = scanner.nextLong();
        
        System.out.println("Input float :");
        float num3 = scanner.nextFloat();
        
        System.out.println("Input Double :");
        double num4 = scanner.nextDouble();
        
        System.out.println( num1 + " " +  num2 + "" + num3 + "" + num4+ "");
        
    }
    
}
