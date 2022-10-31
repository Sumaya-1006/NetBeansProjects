
package com.mycompany.addsinteger;

import java.util.Scanner;

public class IntegerToString {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input 1st Integer :");
        int x = scanner.nextInt();
        
        System.out.println("Input 2nd Integer :");
        int y = scanner.nextInt();
        
        // converting to String
        
        String str1 = Integer.toString(x);
        String str2 = Integer.toString(y);
        
        System.out.println("String str1 :" + str1 );
        System.out.println("String str2 :" + str2 );
        
        
        
        
    }
    
}
