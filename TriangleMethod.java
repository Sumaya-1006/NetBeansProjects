
package com.mycompany.method;

import java.util.Scanner;


public class TriangleMethod {
    
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input Side-1: ");
        double x = scanner.nextDouble();
        
        System.out.println("Input Side-2: ");
        double y = scanner.nextDouble();
        
        System.out.println("Input Side-3: ");
        double z = scanner.nextDouble();
        
        System.out.println(Is_valid( x,y,z)?  "The area is : "  +area_Triangle(x,y,z) : "Invaild triangle");
        
        
    }

    private static boolean Is_valid(double x, double y, double z) {
        if(x+y>z && y+z>x && z+x>y){
            return true; 
        }else{
            return false;
        }
    }
    

    private static double area_Triangle(double x, double y, double z) {
        
        double area = 0;
        double s = (x+y +z)/2;
        area = Math.sqrt(s*(s -x)*(s -y)*(s -z));
        return area;
       
    }
    }
        
    
       
    
    

