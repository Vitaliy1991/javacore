package com.vitaliy1991.app.homework.lesson4;

import com.vitaliy1991.app.classwork.lesson4.triangle.RightAngledTriangle;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vitor on 19-Feb-17.
 */
public class ClassworkTest {
        @Test
        public void rightAngeledTests(){
            boolean expRes = true;
            RightAngledTriangle triangle = new RightAngledTriangle();
            Assert.assertEquals(expRes, triangle.isTriangle(4,5,3));
        }

    @Test
    public void rightAngeledTests2(){
        boolean expRes = false;
        RightAngledTriangle triangle = new RightAngledTriangle();
        Assert.assertEquals(expRes, triangle.isTriangle(13,11,12));
    }
}
