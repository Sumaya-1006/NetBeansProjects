
package com.mycompany.addsinteger;

import java.util.Scanner;


public class Distance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        float timeSecond;
        float mps,kph,mph;
        
        System.out.println("Input distance : ");
        float distance = scanner.nextFloat();
        
        System.out.println("Input hour : ");
        float hour = scanner.nextFloat();
        
        System.out.println("Input minute :");
        float minute = scanner.nextFloat();
        
        System.out.println("Input second :");
        float second = scanner.nextFloat();
        
        timeSecond =((hour*3600) + (minute*60) + second);
        mps = distance/timeSecond;
        kph = ( distance/1000.0f ) / ( timeSecond/3600.0f );
        mph = kph/1.609f;
        
        System.out.println("Your speed in meters/second is :" + mps + "/n");
        System.out.println("Your speed in in km/h is :" + kph + "/n");
        System.out.println("Your speed in in miles/h is :" + mph + "/n");

        
         
       
    }
}
        
        
        
        
        
        
       
    
    

