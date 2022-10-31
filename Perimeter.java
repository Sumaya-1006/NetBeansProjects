
package com.mycompany.addsinteger;

import java.util.Scanner;


public class Perimeter {

    public static void main(String[] Strings) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input Side length value is :");
    double X = scanner.nextDouble();
    
    System.out.println("Square is : " +Math.pow(X, 2));
    System.out.println("Cube is :" +Math.pow(X, 3));
    System.out.println("Fouth Power is :" +Math.pow(X, 4));


        
    }
}