
package com.mycompany.addsinteger;

import java.util.Scanner;


public class CelsiusToFahrenhite {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the value :");
    double celsius = scanner.nextDouble();
    
    double fahrenhite = 9*celsius +(32*5)/5;
    System.out.println(celsius +" degree celsius is equal to :" + fahrenhite + " in fahrenhite ");
          
        
    
}
    
}
