
package com.mycompany.addsinteger;

import java.util.Scanner;


public class CurrentTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Input the time zone offset to GMT: ");
         long timeZoneChange = scanner.nextLong();
         
         long totalMiliSecond = System.currentTimeMillis();
         long totalSecond = totalMiliSecond / 1000;
         long currentSecond = totalSecond % 60;
         
         long totalMinute = totalSecond / 60;
         long currentMinute = totalMinute % 60;
         
         long totalHours = totalMinute / 60;
         long currentsHours = (totalHours + timeZoneChange)%24;
         
         System.out.println("Current time is : "  + currentsHours + ":" + currentMinute + ":" + currentSecond + "");
      
    }
    
}
