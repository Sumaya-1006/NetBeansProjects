
package com.mycompany.conditionalstatement ;




import java.util.Scanner;


public class PasswordAsConsole {
    public static void main(String []args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email :");
        String email = scanner.nextLine();

        System.out.println("Enter your password :");
       
        String pass = scanner.nextLine();
         
        
           
             
        if(email.equals("sumia2997@gmail.com") && (pass.equals("abc12345"))){
            System.out.print("Welcome");
            System.out.print("You are successfully login");
            
        }else{
            System.out.print("Your pass didn't match and try another way");
        }
     
    }
    
    }
