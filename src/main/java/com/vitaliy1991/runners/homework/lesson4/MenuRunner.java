package com.vitaliy1991.runners.lesson4;

import com.vitaliy1991.app.classwork.lesson4.biggerNumber.BiggerNumber;
import com.vitaliy1991.app.classwork.lesson4.circleArea.CircleArea;
import com.vitaliy1991.app.classwork.lesson4.task.TaskChoosen;
import com.vitaliy1991.app.homework.lesson4.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by vitor on 19-Feb-17.
 */
public class MenuRunner {
    public static void main(String[] args) {
        System.out.println("1. Right-Angled Triangle - define is triangle is right-angeled\n" +
                        "2. Circle Area - define what area out of 2 is bigger\n" +
                        "3. Bigger Number - define what number out of 2 is bigger\n" +
                        "4. Odd or Even - define is this number Odd or Even\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please choose one menu number from the list above: ");
        try {
            double menu = scanner.nextDouble();
            Menu calculate = new Menu();
            boolean result1 = calculate.runner1(menu);
            boolean result2 = calculate.runner2(menu);
            boolean result3 = calculate.runner3(menu);
            boolean result4 = calculate.runner4(menu);
            if (result1) {
                System.out.println("Define 3 sides of the triangle and you'll see is it rectangular");
                RightAngledRunner.main(null);
            } else {
                if (result2) {
                    System.out.println("Enter radius and define what area is bigger");
                    CircleAreaRunner.main(null);
                } else {
                    if (result3) {
                        System.out.println("Enter number and define what number is bigger");
                        BiggerNumberRunner.main(null);
                    } else {
                        if (result4) {
                            System.out.println("Enter number and check is it Odd or Even");
                            OddNumberRunner.main(null);
                        } else {
                            System.out.print("There is no such task number. Try to choose 1, 2, 3, 4 \n");
                            MenuRunner.main(null);
                        }
                    }
                }
            }
        } catch (InputMismatchException e){
            System.out.println("You may only enter integers as a number. Please try again.");
            MenuRunner.main(null);
        }
        System.out.print("Please enter \"yes\" if you want to try again: ");
        String startAgain = scanner.next();
        if (startAgain.equals("yes")){
            MenuRunner.main(null);
        }
    }
}
