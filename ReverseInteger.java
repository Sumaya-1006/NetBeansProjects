
package com.mycompany.math;


public class ReverseInteger {
    public static void main(String[]args) throws Exception{
       
        int num = 45463773;
        int n = Math.abs(num);
        String value = "";
        if (num < 0) {
            value = "-";
        }
        System.out.print(value);
        while (n > 0){
            System.out.print(n % 10);
            n = n / 10;
        }
   
    }
}
