package com.vitaliy1991.app.classwork.lesson4.number;

/**
 * Created by vitor on 16-Feb-17.
 */
public class OddNumber {
    public boolean isOdd (double a) {
        double b = a/2;
        if (a == ((int)b)*2){
            return false;
        } else {
            return true;
        }
    }
}
