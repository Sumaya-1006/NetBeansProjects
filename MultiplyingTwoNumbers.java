
package com.mycompany.math;

import java.util.Scanner;


public class MultiplyingTwoNumbers {
   public static int multiplying_two_numbers(int a,int b) {
       
       // multiply two integers without using multiplication, division, bitwise operators, and loops
       
       // 0 multiplying anything is 0
       if(b==0)
           return 0;
       
       if(b>0)
           return(a + multiplying_two_numbers(a, b -1));
       
       if(b<0)
           return -multiplying_two_numbers(b,-b);
       
       return -1;
   }
       public static void main(String [] args) {
           Scanner scanner = new Scanner(System.in);
           
           System.out.println(" Enter 1st integer :");
           int num1 = scanner.nextInt();
           
           System.out.println(" Enter 2nd integer :");
           int num2 = scanner.nextInt();
           
           
           System.out.println(" multiply two integers are :" + multiplying_two_numbers(num1, num2));
          
                   
       }
    
    
}
