

package com.mycompany.addsinteger;

import java.util.Scanner;


public class FahrenheitToCelsius {

    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the value :");
        double fahrenheit = scanner.nextDouble();
        
        double celsious = ((5*(fahrenheit-32))/9);
        System.out.println(fahrenheit + "degree fahrenheit is equal to : " + celsious + "in celsious");
        
        
        
        
        
       
        
        
   
    }
}
