package com.vitaliy1991.runners.lesson4;

import com.vitaliy1991.app.classwork.lesson4.circleArea.CircleArea;

import java.util.Scanner;

/**
 * Created by vitor on 14-Feb-17.
 */
public class CircleAreaRunner {
    public static final double PI = Math.PI;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius1: ");
        double radius1 = scanner.nextDouble();
        double area1 = PI * Math.pow(radius1, 2);
        System.out.print("Please enter radius2: ");
        double radius2 = scanner.nextDouble();
        double area2 = PI * Math.pow(radius2, 2);
        CircleArea calculation = new CircleArea();
        boolean result1 = calculation.calculateBigger(area1, area2);
        boolean result2 = calculation.calculateBigger2(area1, area2);
        if (result1) {
            System.out.println("Areas are equal");
        } else {
            if (result2) {
                System.out.println("Area1 is bigger");
            } else {
                System.out.println("Area2 is bigger");
            }
        }
    }
}
