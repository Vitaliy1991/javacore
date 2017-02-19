package com.vitaliy1991.app.Classwork.lesson4.task;

import com.vitaliy1991.app.Classwork.lesson4.biggerNumber.BiggerNumber;
import com.vitaliy1991.app.Classwork.lesson4.circleArea.CircleArea;
import com.vitaliy1991.app.Classwork.lesson4.triangle.myCheck.TriangleAngel;
import com.vitaliy1991.app.Classwork.lesson4.triangle.triangleClasswork.RightAngledRunner;
import com.vitaliy1991.app.Classwork.lesson4.triangle.triangleClasswork.RightAngledTriangle;

import java.util.Scanner;

/**
 * Created by vitor on 19-Feb-17.
 */
public class TaskChoosen {
    public static void chooseTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter task number: ");
        double task = scanner.nextDouble();
        if (task == 1) {
            TriangleAngel.triangle();
        } else {
            if (task == 2) {
                CircleArea.calculateBigger();
            } else {
                if (task == 3) {
                    BiggerNumber.calculateNumber();
                } else {System.out.print("There is no such task number. Try to choose 1, 2, 3");}
            }
        }
    }
}
