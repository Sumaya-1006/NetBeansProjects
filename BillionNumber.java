
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class BillionNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number :");
        int num = scanner.nextInt();
        
        if(num<1000000000){
            String size = Integer.toString(num);
           System.out.println("The num has :" + size.length() + " digit"); 
        
        }else{
            System.out.println(" Number is bigger of 1 billion"); 
        }
    }
    
}
