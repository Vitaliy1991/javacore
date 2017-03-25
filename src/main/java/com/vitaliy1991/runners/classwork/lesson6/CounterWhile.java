package com.vitaliy1991.runners.lesson6;

import java.util.Scanner;

/**
 * Created by vitor on 24-Mar-17.
 */
public class CounterWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();
        while (a>b){
            System.out.println("Number a equal to: " + a + ";\n Number b equal to: " + b);
            a = a-1;
        }
            System.out.println("Number a equal to: " + a + ";\n Number b equal to: " + b);
    }
}
