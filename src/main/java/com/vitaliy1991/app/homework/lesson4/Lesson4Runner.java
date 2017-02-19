package com.vitaliy1991.app.homework.lesson4;

import com.sun.xml.internal.ws.handler.SOAPMessageContextImpl;
import com.vitaliy1991.app.Classwork.lesson4.biggerNumber.BiggerNumber;
import com.vitaliy1991.app.Classwork.lesson4.circleArea.CircleArea;
import com.vitaliy1991.app.Classwork.lesson4.triangle.myCheck.TriangleAngel;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by vitor on 19-Feb-17.
 */
public class Lesson4Runner {
    public static void runner() {
        System.out.println("1. BiggerNumber - define what number out of 2 is bigger\n" +
                "2. CircleArea - define what area out of 2 is bigger\n" +
                "3. RightAngledTriangle - define is triangle is right-angeled\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose number from the list above: ");
        try {
            double number = scanner.nextInt();
            if (number == 1) {
                BiggerNumber.calculateNumber();
            } else {
                if (number == 2) {
                    CircleArea.calculateBigger();
                } else {
                    if (number == 3) {
                        TriangleAngel.triangle();
                    } else {
                        System.out.println("There is no such task number. Try to choose \"1\", \"2\", \"3\"\n");
                        Lesson4Runner.runner();
                    }
                }
            }
        } catch (InputMismatchException e){
            System.out.println("You may only enter integers as a number. Please try again.");
            Lesson4Runner.runner();
        }
        System.out.print("Please enter \"yes\" if you want to try again: ");
        String startAgain = scanner.next();
        if (startAgain.equals("yes")){
            Lesson4Runner.runner();
        }
    }

}
