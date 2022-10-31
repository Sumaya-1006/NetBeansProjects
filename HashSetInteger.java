
package com.mycompany.conditionalstatement;
import java.util.HashSet;

public class HashSetInteger {
  public static void main(String[] args) {

    HashSet<Integer> number = new HashSet<Integer>();
    
    number.add(3);
    number.add(4);
    number.add(5);
    number.add(6);
    
    for(int i=1; i<=10;i++){
       if(number.contains(i)) {
           System.out.println(i+ " is found in the class");
       }else{
           System.out.println(i+ " is not found in the class");
       }
    }
    
  }
}
