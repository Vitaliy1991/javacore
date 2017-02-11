package com.vitaliy1991.app.homework.lesson3_unitTest;

/**
 * Created by vitor on 11-Feb-17.
 */
public class MathFunction {

    public static int module(int a) {
        return Math.abs(a);
    }

    public static double round(double a){
        return Math.round(a);
    }

    public static double cover(double a){
        return Math.ceil(a);
    }

    public static double sinus(double a){
        return Math.sin(Math.toRadians(a));
    }

    public static double aCosinus(double a){
        return Math.acos(a);
    }

    public static double degrees(double a){
        return Math.toDegrees(a);
    }

    public static double radians(double a){
        return Math.toRadians(a);
    }

    public static double squareRoot(double a){
        return Math.sqrt(a);
    }

    public static double power(double a, double b){
        return Math.pow(a, b);
    }

    public static double nLog(double a){
        return Math.log(a);
    }

    public static double log10(double a){
        return Math.log10(a);
    }



}
