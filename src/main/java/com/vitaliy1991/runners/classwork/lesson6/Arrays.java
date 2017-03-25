package com.vitaliy1991.runners.classwork.lesson6;

/**
 * Created by vitor on 24-Mar-17.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};
        for (int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

        boolean[] booleenArray = {true,false};
        for (int i = 0; i<booleenArray.length; i++){
            System.out.println(booleenArray[i]);
        }

        char[] charArray = {'a','b','c'};
        for (int i = 0; i<charArray.length; i++){
            System.out.println(charArray[i]);
        }

        double[] doubleArray = {1.1,4.6,7.8};
        for (int i = 0; i<doubleArray.length; i++){
            System.out.println(doubleArray[i]);
        }

        long[] longArray = {47,89,23467};
        for (long my1 : longArray){
            System.out.println(my1);
        }

    }
}
