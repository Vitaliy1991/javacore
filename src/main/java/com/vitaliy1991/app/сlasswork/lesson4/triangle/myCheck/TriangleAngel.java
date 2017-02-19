package com.vitaliy1991.app.сlasswork.lesson4.triangle.myCheck;

import java.util.Scanner;

/**
 * Created by vitor on 16-Feb-17.
 */
public class TriangleAngel {
    public static void triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter cathetus1: ");
        int cathetus1 = scanner.nextInt();
        int cathetusSquare1 = cathetus1 * cathetus1;
        System.out.print("Please enter cathetus2: ");
        int cathetus2 = scanner.nextInt();
        int cathetusSquare2 = cathetus2 * cathetus2;
        System.out.print("Please enter hypotenuse: ");
        int hypotenuse = scanner.nextInt();
        int hypotenuseSquare = hypotenuse * hypotenuse;
        if (hypotenuseSquare == cathetus1*cathetus1 + cathetus2*cathetus2) {
            System.out.println("Triangle is right-angeled");
        } else {
            System.out.println("Triangle is not right-angeled");
        }
    }
}
