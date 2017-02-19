package com.vitaliy1991.app.Classwork.lesson4.circleArea;

import java.util.Scanner;

/**
 * Created by vitor on 14-Feb-17.
 */
public class CircleArea {
    /*public static void calculate(){
        Scanner scanner = new Scanner(System.in); //Поле для ввода числа с клавиатуры
        System.out.print("Please enter radius: ");
        double radius = scanner.nextDouble(); // Вывести новую строку для ввода
        System.out.print("Please enter PI: ");
        double PI = scanner.nextDouble();
        double circleArea = PI*Math.pow(radius, 2);
        System.out.println("Area is " + circleArea);
        }*/
    public static final double PI = Math.PI;

    public static void calculateBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter radius1: ");
        double radius1 = scanner.nextDouble();
        double area1 = PI * Math.pow(radius1, 2);
        System.out.print("Please enter radius2: ");
        double radius2 = scanner.nextDouble();
        double area2 = PI * Math.pow(radius2, 2);
        if (area1 == area2)
        {System.out.println("Areas are equal");}
        else if (area1 > area2) {System.out.println("Area1 is bigger");}
        else {System.out.println("Area2 is bigger");}
    }
}
