package com.vitaliy1991.app.homework.lesson3_unitTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vitor on 11-Feb-17.
 */
public class ArithmeticTest {
    @Test
    public void additionTest(){
        int a = 123, b = 456, expRes = 579;
        Assert.assertEquals(expRes, ArithmeticFunc.addition(a, b));
    }

    @Test
    public void additionFalseTest(){
        int a = 25, b = 40, expRes = 35;
        Assert.assertEquals(expRes, ArithmeticFunc.addition(a, b));
    }

    @Test
    public void substractionTest(){
        int a = 450, b = 300, expRes = 150;
        Assert.assertEquals(expRes, ArithmeticFunc.substraction(a, b));
    }

    @Test
    public void substractionFalseTest(){
        int a = 250, b = 300, expRes = 50;
        Assert.assertEquals(expRes, ArithmeticFunc.substraction(a, b));
    }

    @Test
    public void divisionTest(){
        int a = 9, b = 3, expRes = 3;
        Assert.assertEquals(expRes, ArithmeticFunc.division(a, b));
    }

    @Test
    public void divisionFalseTest(){
        int a = 180, b = 3, expRes = 30;
        Assert.assertEquals(expRes, ArithmeticFunc.division(a, b));
    }
}
