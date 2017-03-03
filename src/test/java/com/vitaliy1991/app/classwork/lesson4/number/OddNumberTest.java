package com.vitaliy1991.app.classwork.lesson4.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vitor on 02-Mar-17.
 */
public class OddNumberTest {
    @Test
    public void isOdd() {
        boolean expRes = false;
        OddNumber even = new OddNumber();
        Assert.assertEquals(expRes, even.isOdd(10));
    }

    @Test
    public void isOdd2() {
        boolean expRes2 = true;
        OddNumber odd = new OddNumber();
        Assert.assertEquals(expRes2, odd.isOdd(13));
    }
}