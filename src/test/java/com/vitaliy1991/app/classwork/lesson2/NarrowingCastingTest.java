package com.vitaliy1991.app.classwork.lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vitor on 01-Mar-17.
 */
public class NarrowingCastingTest {
    @Test
    public void narrowing() {
        NarrowingCasting narCast = new NarrowingCasting();
        narCast.narrowing();
        int expRes = 10;
        Assert.assertEquals(expRes, narCast.int1);

    }

}