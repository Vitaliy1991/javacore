package com.vitaliy1991.app.classwork.lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vitor on 01-Mar-17.
 */
public class WideningCastingTest {
    @Test
    public void widening() {
        WideningCasting widCast = new WideningCasting();
        widCast.widening();
        double expRes = 127;
        Assert.assertEquals(expRes, widCast.double1, 0);
    }

}