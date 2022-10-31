
package com.mycompany.method;

import java.util.Scanner;


public class LeapYearMethod {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input e year :");
        int year = scanner.nextInt();
        
        System.out.println(" "+is_leapYear(year));
        
    }
    private static boolean is_leapYear(int y) {
      /*  boolean a = (y%4)==0;
        boolean b =(y%100) !=0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));
        
        return a && ( b || c);*/
      
     boolean a = (y % 4 == 0);
     boolean b = (y%100) !=0;
     boolean c = ((y%100==0) &&(y%400==0) );
     return a && (b||c);
     
      
        
        
    
       
    }
    
}
