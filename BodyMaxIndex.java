
package com.mycompany.addsinteger;

import java.util.Scanner;


public class BodyMaxIndex {
    public static void main(String[] args){
        
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter the value of weigth :");
       double weight = scanner.nextDouble();
       
       System.out.println("Enter the value of height :");
       double inch = scanner.nextDouble();
       
       double BMI = (weight*0.453592/inch*0.0254*inch*0.0254);
       
       System.out.println(" The body max is : " + BMI +"");
        
        
        
      
 }
    
}
