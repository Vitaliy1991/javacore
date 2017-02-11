package com.vitaliy1991.app.homework.lesson3_unitTest;

import com.vitaliy1991.app.Classwork.lesson3.Unit_test_classwork.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vitor on 11-Feb-17.
 */
public class MathFunctionTest {
    @Test
    public void moduleTest(){
        int a = -15, expRes = 15;
        Assert.assertEquals(expRes, MathFunction.module(a));
    }

    @Test
    public void roundTest(){
        double a = 4.5, expRes = 5.0;
        Assert.assertEquals(expRes, MathFunction.round(a), 0);
    }

    @Test
    public void coverTest(){
        double a = 3.4, expRes = 4.0;
        Assert.assertEquals(expRes, MathFunction.cover(a), 0);
    }

    @Test
    public void sinusTest(){
        double a = 90.0, expRes = 1.0;
        Assert.assertEquals(expRes, MathFunction.sinus(a), 0);
    }

    @Test
    public void aCosinusTest(){
        double a = 1.0, expRes = 0;
        Assert.assertEquals(expRes, MathFunction.aCosinus(a), 0);
    }

    @Test
    public void degreesTest(){
        double a = 1.0, expRes = 60;
        Assert.assertEquals(expRes, MathFunction.degrees(a), 0);
    }

    @Test
    public void radiansTest(){
        double a = 60, expRes = 1;
        Assert.assertEquals(expRes, MathFunction.radians(a), 0);
    }

    @Test
    public void squareRootTest(){
        double a = 256, expRes = 16;
        Assert.assertEquals(expRes, MathFunction.squareRoot(a), 0);
    }

    @Test
    public void powerTest(){
        double a = 8, b = 3, expRes = 512;
        Assert.assertEquals(expRes, MathFunction.power(a, b), 0);
    }

    @Test
    public void nLogTest(){
        double a = 100, expRes = 4;
        Assert.assertEquals(expRes, MathFunction.nLog(a), 0);
    }

    @Test
    public void log10Test(){
        double a = 1000, expRes = 3;
        Assert.assertEquals(expRes, MathFunction.log10(a), 0);
    }



}
