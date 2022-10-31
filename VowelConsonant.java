
package com.mycompany.conditionalstatement;

import java.util.Scanner;


public class VowelConsonant {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        
        int i=0;
	
	System.out.println("Entered character : ");
        char ch = scanner.next().charAt(0);
        
       if(i>=1){
          System.out.println("Entered character "+ ch + " is  vowel"); 
       
       }else if((ch>='a' && ch<= 'z')||(ch>= 'A' && ch<= 'Z')){
           System.out.println("Entered character "  + ch +  " is consonant "); 
       }
       else{
          System.out.println("Entered character is not found");  
       } 
            
        }
	}

    

