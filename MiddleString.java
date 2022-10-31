
package com.mycompany.method;

import java.util.Scanner;


public class MiddleString {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input a string :");
        String str = scanner.nextLine();
        
        System.out.println("The middle String is :" + middle(str));
         
    }

    private static String middle(String str) {
      if(str.length()%2 !=0){
          return String.valueOf(str.charAt(str.length()/2));
      }
      return str.charAt((str.length()/2)-1)+"" + (str.charAt(str.length()/2)); 
     
     
    }
    
}
