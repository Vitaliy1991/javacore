package com.vitaliy1991.runners.homework.lesson6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vitor on 29-Mar-17.
 */
public class PutNumbers {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        while (a>=0){a++;}
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < a; i++){
            list.add(i);
        }
        /*for(int i = 0; i < a; i++){
            System.out.println(list.get(i));
        }*/
        System.out.println("You can enter set of numbers and get sum in the end; To stop, please enter \"Exit\"");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Please enter number: ");
            String number = scanner.next();
            if (number.equals("Exit")) break;
            else sum = sum + Integer.parseInt(number);;
        }
        System.out.println(sum);
    }
}
