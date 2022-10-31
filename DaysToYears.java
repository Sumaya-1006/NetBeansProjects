
package com.mycompany.addsinteger;

import java.util.Scanner;



public class DaysToYears {
    public static void main(String [] args) {
        
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Input the number :");
        long days = scanner.nextLong();
       
        
        double year = (double) (days*0.002738);
        
        int mint = (int) (days*60*24);
        
        System.out.println(days + " days is approximately : " + year + " years and " + mint + " mint ");
    }
    
    
}
