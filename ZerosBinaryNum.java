
package com.mycompany.math;

import java.util.Scanner;


public class ZerosBinaryNum {
    public static void main(String[] args){
        int num, rem, quot, i=1, j;
        int bin_num[] = new int [100];
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        num = scanner.nextInt();
        
        quot = num;
        
        while(quot!=0){
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
        
        String str ="";
        for(j=i-1;j>0; j--)
          str =str+bin_num[j] ;
        
        System.out.println(str);
        
        i = str.length()-1;
        while(str.charAt(i)==0)
            i--;
        int length=0; int ctr = 0;
        
        for(; i>=0;i--){
            
            if(str.charAt(i)=='1'){
                
                length=Math.max(length,ctr);
                ctr=0;
            }else{
                ctr++;
            }
          
            
            
        
        }
            length=Math.max(length,ctr);
            System.out.println("length of longest sequence is :" +length);
        
        
      
      
      
     }
        
    }
      
  
      
      
       
        
    
    
    

