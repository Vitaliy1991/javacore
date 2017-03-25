package com.vitaliy1991.runners.classwork.lesson4;

import com.vitaliy1991.app.classwork.lesson4.task.TaskChoosen;

import java.util.Scanner;

/**
 * Created by vitor on 19-Feb-17.
 */
public class TaskChoosenRunner {
    public static void main(String[] args) {
        System.out.println("Please choose one of task numbers, starting with 1 to 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter task number: ");
        double task = scanner.nextDouble();
        TaskChoosen calculate = new TaskChoosen();
        boolean result1 = calculate.chooseTask1(task);
        boolean result2 = calculate.chooseTask2(task);
        boolean result3 = calculate.chooseTask3(task);
        boolean result4 = calculate.chooseTask4(task);
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
                        TaskChoosenRunner.main(null);
                    }
                }
            }
        }
    }
}
