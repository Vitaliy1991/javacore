package com.vitaliy1991.runners.lesson6;

/**
 * Created by vitor on 24-Mar-17.
 */
public class MultiArrays {
    public static void main(String[] args) {
        int[][] intArray = new int[2][3];
        for (int j=0; j<intArray.length; j++){
            for (int k=0; k<intArray[j].length; k++){
                intArray[j][k] = j*k;
                System.out.print(intArray[j][k]);
            }
        }
    }
}
