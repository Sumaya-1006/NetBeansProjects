
package com.mycompany.conditionalstatement;

import java.util.Scanner;



public class FloatingPoint {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Input first floating­point number : ");
        float x = scanner.nextFloat();
        
        System.out.println(" Input second floating­point number : ");
        float y = scanner.nextFloat();
        scanner.close();
        
        if(Math.abs(x-y)<=0.01){
            System.out.println(" These numbers are same ");
        }else{
             System.out.println(" These numbers are same ");
        }
    }
        
        
    }
    

