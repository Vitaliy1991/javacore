package com.vitaliy1991.runners.classwork.lesson2;

import com.vitaliy1991.app.classwork.lesson2.NarrowingCasting;
import com.vitaliy1991.app.classwork.lesson2.WideningCasting;

/**
 * Created by vitor on 02-Feb-17.
 */
public class Runner {
    public static void main(String[] args){
        WideningCasting casting1 = new WideningCasting();
        casting1.widening();

        NarrowingCasting narrowing1 = new NarrowingCasting();
        narrowing1.narrowing();
    }
}