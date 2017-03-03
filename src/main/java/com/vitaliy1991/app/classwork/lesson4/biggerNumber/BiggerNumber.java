package com.vitaliy1991.app.classwork.lesson4.biggerNumber;

import java.util.Scanner;

/**
 * Created by vitor on 19-Feb-17.
 */
public class BiggerNumber {
    public boolean calculateNumber(double number1, double number2) {
        if (number1 == number2) {
            return true;
        } else {
            return false;
        }
    }
    public boolean calculateNumber2(double number1, double number2) {
        if (number1 > number2) {
            return true;
        } else {
            return false;
        }
    }
}