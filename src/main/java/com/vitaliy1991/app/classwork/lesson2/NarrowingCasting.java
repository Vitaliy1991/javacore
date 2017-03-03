package com.vitaliy1991.app.classwork.lesson2;

/**
 * Created by vitor on 02-Feb-17.
 */
public class NarrowingCasting {
    int int1 = 0;
    float float1 = 10f;

    public void narrowing(){
        int1 = (int) float1;
        System.out.println(int1);
    }
}
