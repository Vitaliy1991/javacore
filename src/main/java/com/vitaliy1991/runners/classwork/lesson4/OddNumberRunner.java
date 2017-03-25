package com.vitaliy1991.runners.lesson4;

import com.vitaliy1991.app.classwork.lesson4.number.OddNumber;

import java.util.Scanner;

/**
 * Created by vitor on 16-Feb-17.
 */
public class OddNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        double a = scanner.nextDouble();
        OddNumber calculator = new OddNumber();
        boolean result = calculator.isOdd(a);
        if (result){
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }
}
