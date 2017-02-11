package com.vitaliy1991.app.homework.lesson3_unitTest;

import com.vitaliy1991.app.homework.utils.convertors.PrimitiveConvertor;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vitor on 09-Feb-17.
 */
public class PrimitiveConvertorTest {
    @Test
    public void convertorTest() {
        char myChar = 'v', expRes = 'v';
        float myFloat = 120.0f;
        PrimitiveConvertor convert1 = new PrimitiveConvertor(); // https://goo.gl/yddd42 (Как-вызвать-не-статическую-переменную-из-статического-метода)
        Assert.assertEquals(expRes, convert1.floatToChar(myFloat));
    }

    @Test
    public void convertorTest2() {
        char myChar = 'v', expRes = 'v';
        int myInt = 118;
        PrimitiveConvertor convert1 = new PrimitiveConvertor();
        Assert.assertEquals(expRes, convert1.intToChar(myInt));
    }

    @Test
    public void convertorTest3() {
        char myChar = 'v';
        int myInt = 100, expRes = 118;
        PrimitiveConvertor convert1 = new PrimitiveConvertor();
        Assert.assertEquals(expRes, convert1.charToInt(myChar));
    }

}
