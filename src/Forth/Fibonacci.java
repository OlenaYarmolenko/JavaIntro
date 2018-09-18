package Forth;

import java.util.ArrayList;

/**
 * Created by olena on 18.09.18.
 */
public class Fibonacci {

    public static void printFibonacciNumbers (int count){

     try {
        int [] numbs = new int [count];
        numbs[0] = 0;
        numbs[1] = 1;
        for (int i=2; i<count; i++){
            numbs[i] = numbs[i-1] + numbs [i-2];
        }
         for (int i=0; i<count; i++){
             System.out.print(numbs[i] + " ");
        }
     } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e){
         System.out.println("Please enter a positive number more than 0");
     }

    }

    public static void main(String[] args) {

        printFibonacciNumbers(10);

    }
}
