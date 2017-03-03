package com.vitaliy1991.app.classwork.lesson3;

import com.vitaliy1991.app.classwork.lesson3.Unit_test_classwork.MathFunc;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by vitor on 09-Feb-17.
 */
@RunWith(JUnitParamsRunner.class)
public class MathFuncTest {
    MathFunc mathFunc;

    @Before
    public void setUp(){
        mathFunc = new MathFunc();
    }

    @FileParameters("src/test/java/resources/multiply_parameters.csv")
    @Test
    public void multiplyTest(int a, int b, int expRes, boolean isTrue){
        Assert.assertEquals(isTrue, expRes == MathFunc.multiply(a, b));
    }

    @Test
    public void multiplyFailedTest(){
        int a = 1, b = 2, expRes = 7;
        Assert.assertNotEquals(expRes, MathFunc.multiply(a, b));
    }
}
