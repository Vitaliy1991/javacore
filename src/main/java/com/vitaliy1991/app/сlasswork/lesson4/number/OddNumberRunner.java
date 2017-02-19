package com.vitaliy1991.app.сlasswork.lesson4.number;

import java.util.Scanner;

/**
 * Created by vitor on 16-Feb-17.
 */
public class OddNumberRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter b: ");
        double b = scanner.nextDouble();
        OddNumber calculator = new OddNumber();
        calculator.isOdd(20);
    }
}
