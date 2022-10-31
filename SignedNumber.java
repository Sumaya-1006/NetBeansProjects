
package com.mycompany.addsinteger;


public class SignedNumber {
    public static void main (String[] args){
      int n1 = Integer.MIN_VALUE;
      int n2 = Integer.MAX_VALUE;
      
      System.out.println("Signed Integer is :" + n1 + " ,"  + n2 + "");
      
      int compare_signed_num = Integer.compare(n1,n2);
      System.out.println("Compare signed num : " + compare_signed_num);
      
      int compare_unsigned_num = Integer.compare(n2,n1);
      System.out.println("Compare unsigned num : " + compare_unsigned_num);
      
      
     
      
      
    }
    
}
