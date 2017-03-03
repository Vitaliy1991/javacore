package com.vitaliy1991.app.classwork.lesson4.circleArea;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vitor on 02-Mar-17.
 */
public class CircleAreaTest {
    @Test
    public void calculateBigger() throws Exception {
        boolean expRes = true;
        CircleArea cb = new CircleArea();
        Assert.assertEquals(expRes, cb.calculateBigger(1,1));
    }

    @Test
    public void calculateBigger1() throws Exception {
        boolean expRes = false;
        CircleArea cb = new CircleArea();
        Assert.assertEquals(expRes, cb.calculateBigger(4,1));
    }

    @Test
    public void calculateBigger2() throws Exception {
        boolean expRes = true;
        CircleArea cb2 = new CircleArea();
        Assert.assertEquals(expRes, cb2.calculateBigger2(4,1));
    }

    @Test
    public void calculateBigger3() throws Exception {
        boolean expRes = false;
        CircleArea cb2 = new CircleArea();
        Assert.assertEquals(expRes, cb2.calculateBigger2(4,9));
    }

}