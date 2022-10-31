
package com.mycompany.addsinteger;


public class TurnaryOperator {
    public static void main(String[] args){
        int a = 50; int b = 30; int c =40;
        int Max = (a>b) ? (a>c ? a : c) :(b>c ? b: c );
        
        System.out.println(Max);
    }
    
}
