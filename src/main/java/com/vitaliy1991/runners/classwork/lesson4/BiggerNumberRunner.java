package com.vitaliy1991.runners.lesson4;

import com.vitaliy1991.app.classwork.lesson4.biggerNumber.BiggerNumber;

import java.util.Scanner;

/**
 * Created by vitor on 19-Feb-17.
 */
public class BiggerNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Please enter number2: ");
        double number2 = scanner.nextDouble();
        BiggerNumber calculator = new BiggerNumber();
        boolean result1 = calculator.calculateNumber(number1, number2);
        boolean result2 = calculator.calculateNumber2(number1, number2);
        if (result1) {
            System.out.println("Numbers are equal");
        } else {
            if (result2) {
                System.out.println("Number 1 bigger");
            } else {
                System.out.println("Number 2 bigger");
            }
        }
    }
}
