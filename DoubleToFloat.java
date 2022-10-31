
package com.mycompany.addsinteger;

import java.util.Scanner;


public class DoubleToFloat {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the values :");
        double d1 = scanner.nextDouble();
        
        System.out.println("Input the values :");
        double d2 = scanner.nextDouble();
        double d = d1/d2;
        
        System.out.println("Double d is :" +d1/d2);
        
        float f = (float) d;
        
        System.out.println("float f is :" +f);
    }
}
        
       
        
       
        
  