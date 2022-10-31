
package com.mycompany.math;


public class DivisionTwoInteger {
    // Division without using multiplication, division and mod operator
   static long divide(long dividend, long divisor){
       long sign = ((dividend < 0) ^ (divisor < 0)) ? -1:1;
       dividend  = Math.abs(dividend);
       divisor = Math.abs(divisor);
       
       long quot = 0;
       
       while(dividend>=divisor){
           dividend-=divisor;
           ++quot;
       }
       if(sign ==-1)
         quot = -quot;
       
       return quot;
   }
   public static void main(String[] args){
       
     int a = -50;
     int b = -5;
     System.out.println(divide(a,b));
     
      a = 40;
      b = -5;
      
      System.out.println(divide(a,b));
    
  
         
     }
   }
           
    

