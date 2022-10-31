
package com.mycompany.math;


public class AverageNumber {
    public static void main(String[] args){
        float[] array ={20,30,35,40,50,55};
        
        for (int i =1; i<=array.length; i++){
            int sum =0;
             for(int j = 0; j<i; j++){
                 sum+= array[j];
             }
             float average = sum/(float)i;
             System.out.printf("Average of %d numbers is %6f\n", i,average);
        }
        }
    }
    

