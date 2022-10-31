
package com.mycompany.conditionalstatement;

import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;


public class CurrentAge {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Enter your age on YYYY-MM-DD format :");
      String year = scanner.nextLine();
      scanner.close();
      
      LocalDate dob = LocalDate.parse(year);
      System.out.println("Your age is :" +CalculatedAge(dob)+ " years ");
    }

    private static int CalculatedAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        
        if( (dob !=null) && (currentDate !=null)){
            return(Period.between(dob, currentDate)).getYears();
        
        }else{
            return 0;
        }
    }

}
