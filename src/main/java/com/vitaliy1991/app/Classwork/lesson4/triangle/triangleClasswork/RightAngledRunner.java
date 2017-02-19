package com.vitaliy1991.app.Classwork.lesson4.triangle.triangleClasswork;

import com.vitaliy1991.app.Classwork.lesson4.triangle.myCheck.TriangleAngel;

import java.util.Scanner;

/**
 * Created by vitor on 16-Feb-17.
 */
public class RightAngledRunner {
    public static void main(String[] args) {
        RightAngledTriangle calculator = new RightAngledTriangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter c: ");
        int c = scanner.nextInt();
        boolean result = calculator.isTriangle(a, b, c);
        if (result) {
            System.out.println("Triangle is right-angled");
        }
        else { System.out.println("Triangle is not right-angled");}
    }
}
