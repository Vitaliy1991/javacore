package com.vitaliy1991.app.Classwork.lesson4.biggerNumber;

import java.util.Scanner;

/**
 * Created by vitor on 19-Feb-17.
 */
public class BiggerNumber {
    public static void calculateNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Please enter number2: ");
        double number2 = scanner.nextDouble();
        if (number1 == number2)
        {System.out.print("Numbers are equal");}
        else {
            if (number1 > number2) {
                System.out.println("Number1 is bigger");
            } else {
                System.out.println("Number2 is bigger");
            }
        }
    }
}
