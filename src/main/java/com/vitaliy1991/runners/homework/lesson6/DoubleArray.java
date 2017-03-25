package com.vitaliy1991.runners.homework.lesson6;

import java.util.Random;

/**
 * Created by vitor on 25-Mar-17.
 */
public class DoubleArray {
    public static void main(String[] args) {
        int[][] intArray = new int[8][5];
        for (int i = 0; i < intArray.length; i++){
            for (int k = 0; k < intArray[i].length; k++){
                Random array = new Random();
                intArray[i][k] = array.nextInt(90)+10;
                System.out.print(intArray[i][k] + " ");
            }
            System.out.println(" ");
        }
    }
}
