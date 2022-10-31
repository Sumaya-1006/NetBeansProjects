
package com.mycompany.math;

import java.util.Scanner;

/**
 *
 * @author Sumaya Akter
 */
public class RoundUp {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Input total theory num :");
        int total_theory_num = scanner.nextInt();
        
        System.out.println("Input total practical num :");
        int total_practical_num = scanner.nextInt();
        
        System.out.println("Input total num :");
        int total_num = scanner.nextInt();
        
        int sum =((total_theory_num+total_practical_num)*100 )/total_num;
        
        System.out.println("Percentage of marks :" + sum + "%");
        
       
    }
    
}
