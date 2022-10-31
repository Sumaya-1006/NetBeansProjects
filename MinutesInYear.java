
package com.mycompany.addsinteger;

import java.util.Scanner;



public class MinutesInYear {
    public static void main(String [] args) {
        double daysInMinute= 60 * 24;
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Input the number of days :");
        double days = scanner.nextDouble();
        
        long year = (long) (days / daysInMinute);
        int mint = (int) (60*24*365);
        
        System.out.println(days + "days is approximately : " + year + "years and " + mint + "mint");
    }
    
    
}
