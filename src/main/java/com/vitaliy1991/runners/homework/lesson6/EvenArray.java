package com.vitaliy1991.runners.homework.lesson6;

/**
 * Created by vitor on 25-Mar-17.
 */
public class EvenArray {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i<=20; i++){
            if (i%2==0){a++;}
        }
        int[] intArray = new int[a];
        for (int i = 0, k = 2; i < intArray.length; i++, k += 2){
           intArray[i] = k;
        System.out.print(intArray[i] + " ");
        }
        for (int i = 0; i < intArray.length; i++){
            System.out.print("\n"+intArray[i]);
        }
    }
}
