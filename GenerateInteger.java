
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class GenerateInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input the number :");
        int month = scanner.nextInt();
        
        System.out.println(getMonthName(month));
    }

    private static String getMonthName(int month) {
        
        String monthName = "";
        switch (month) {
           
            case 1 : monthName = "January";
            break;
            case 2 : monthName = "February";
            break;
             case 3 : monthName = "March";
            break;
            case 4 : monthName = "April";
            break;
            case 5 : monthName = "May";
            break;
           case 6 : monthName = "June";
            break;
            case 7 : monthName = "July";
            break;
            case 8 : monthName = "August";
            break;
            case 9 : monthName = "September";
            break;
            case 10 : monthName = "October";
            break;
            case 11 : monthName = "November";
            break;
            case 12 : monthName = "December";
            break;
            
            default: monthName ="There is no range of monthName";
             
            
            
        }
        return monthName;
    }
    
}
