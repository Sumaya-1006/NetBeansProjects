

package com.mycompany.addsinteger;

import java.util.Scanner;


public class SumOfDigit {
    public static void main(String [] args){
        int num,sum=0,r,temp;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integer numbers :");
        num = scanner.nextInt();
        
        temp = num;
        
        while(temp !=0){
            r = temp %10;
            sum = sum + r;
            temp = temp/10;
        }
        System.out.println("The sum of digit :" +sum);
    }
    
}
