
package com.mycompany.method;

//import java.time.LocalDateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

//import java.time.format.DateTimeFormatter;



public class CurrentDateTime {

   /*public static void LocalDateTime(){
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        
    }
    public static void main(String[] args){
        LocalDateTime();*/
    
    public static void main(String[] args) {  
    Date date = new Date();  
    
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");  
    String strDate = formatter.format(date);  
    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
  
    formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy : "+strDate);  
  
    formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with dd MMMM yyyy zzzz : "+strDate);  
  
    formatter = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");  
    strDate = formatter.format(date);  
    System.out.println("Date Format with E, dd MMM yyyy HH:mm:ss z : "+strDate);  
  
 
    }
   
    }

