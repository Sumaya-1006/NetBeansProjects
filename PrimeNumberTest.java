
package com.mycompany.math;

import java.util.Scanner;


public class PrimeNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y, count =0,totalPrime = 0;
        System.out.println("Enter 1st integer :");
        x = scanner.nextInt();
        
        System.out.println("Enter 2nd integer :");
         y = scanner.nextInt();
        
        for(int i=x;i<=y;i++){
           
            for(int j=2;j<=i-1;j++){
                
                if(i%j==0){
                 count++;
                 break;
                }
            }
            if(count==0){
                System.out.println(i);
                totalPrime++;
            }
                
                count = 0;
        }
       System.out.println("The total prime num is :" +totalPrime);
             
                     
           }
    }

