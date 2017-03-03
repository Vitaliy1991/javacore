package com.vitaliy1991.app.classwork.lesson4.circleArea;

import java.util.Scanner;

/**
 * Created by vitor on 14-Feb-17.
 */
public class CircleArea {

    public boolean calculateBigger(double area1, double area2) {
        if (area1 == area2) {
            return true;
        } else {
            return false;
        }
    }
    public boolean calculateBigger2(double area1, double area2) {
        if (area1 > area2) {
            return true;
        } else {
            return false;
        }
    }

}
