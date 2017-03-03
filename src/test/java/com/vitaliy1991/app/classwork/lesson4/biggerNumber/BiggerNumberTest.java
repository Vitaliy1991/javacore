package com.vitaliy1991.app.classwork.lesson4.biggerNumber;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vitor on 02-Mar-17.
 */
public class BiggerNumberTest {
    @Test
    public void calculateNumber() {
        BiggerNumber bn = new BiggerNumber();
        boolean expRes = true;
        Assert.assertEquals(expRes, bn.calculateNumber(1,1));
    }

    @Test
    public void calculateNumber1() {
        BiggerNumber bn = new BiggerNumber();
        boolean expRes = false;
        Assert.assertEquals(expRes, bn.calculateNumber(1,5));
    }

    @Test
    public void calculateNumber2() throws Exception {
        BiggerNumber bn2 = new BiggerNumber();
        boolean expRes = true;
        Assert.assertEquals(expRes, bn2.calculateNumber2(3,1));
    }

    @Test
    public void calculateNumber3() throws Exception {
        BiggerNumber bn2 = new BiggerNumber();
        boolean expRes = false;
        Assert.assertEquals(expRes, bn2.calculateNumber2(5,7));
    }
}