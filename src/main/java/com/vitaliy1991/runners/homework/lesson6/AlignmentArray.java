package com.vitaliy1991.runners.homework.lesson6;

import java.util.Random;

/**
 * Created by vitor on 25-Mar-17.
 */
public class AlignmentArray {
    public static void main(String[] args) {
        int[][] intArray = new int[8][5];
        for (int i = 0; i < intArray.length; i++){
            for (int k = 0; k < intArray[i].length; k++){
                Random array = new Random();
                intArray[i][k] = array.nextInt(999)+1;
                System.out.printf("%5d ", intArray[i][k]); //http://microsin.net/programming/arm/secrets-of-printf.html
            }
            System.out.println(" ");
        }
    }
}
