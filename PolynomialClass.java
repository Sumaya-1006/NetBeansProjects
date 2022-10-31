
package com.mycompany.math;


import java.util.ArrayList;

import java.util.List;



public class PolynomialClass {
     public static void main(String[] args) throws Exception {
        int x = 3;
        int r = ((((6)*x + (-4))*x + 7)*x + (-19));
        List<Double> list = new ArrayList<Double>();
        list.add(6.0);
        list.add(-4.0);
        list.add(7.0);
        list.add(-19.0);
        Double result = list.get(0);
        
        for (int i = 1; i < list.size(); i++){
            result = result * x + list.get(i);
            
           
        }
        System.out.println(result);
    }
}
