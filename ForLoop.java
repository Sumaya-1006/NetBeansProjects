
package com.mycompany.method;

import java.util.Scanner;




public class ForLoop {
    public static void Close()  {
        Scanner sc = new Scanner(System.in);
         
           
        System.out.println("Enter the input :");
                 
        int x = sc.nextInt();
                 
        for(int i=0; i<=x; i++){
                 
        System.out.println(i) ;
        
      
        
    }
    }
    
    public static void main(String[] args){
        try{
           Close();
           System.out.println(""); 
        }catch(Exception e){
            Close();
            System.out.println(e);
            System.out.println("Please enter the Integer number");
            
            
        }
        
        
     
       
    }    
        
}



