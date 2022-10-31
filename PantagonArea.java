
package com.mycompany.method;

import java.util.Scanner;


public class PantagonArea {
    
        public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number : ");
        double num = input.nextDouble();
        
        System.out.print("Input the side: ");
        double side = input.nextDouble();
        
        System.out.println(pentagonArea(num, side));
    }
    public static double pentagonArea(double n, double s){
        return (n*s*s) / (4 * Math.tan(Math.PI/n));
    }
}
    

