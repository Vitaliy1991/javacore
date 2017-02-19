package com.vitaliy1991.app.classwork.lesson3;

import com.vitaliy1991.app.сlasswork.lesson3.Unit_test_classwork.MathFunc;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vitor on 09-Feb-17.
 */
public class MathFuncTest {
    @Test
    public void multiplyTest(){
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyFailedTest(){
        int a = 1, b = 2, expRes = 7;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}
