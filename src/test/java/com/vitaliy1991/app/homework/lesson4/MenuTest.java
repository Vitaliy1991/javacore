package com.vitaliy1991.app.homework.lesson4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vitor on 03-Mar-17.
 */
public class MenuTest {
    @Test
    public void runner1(){
        boolean expRes = true;
        Menu m1 = new Menu();
        Assert.assertEquals(expRes, m1.runner1(1));
    }

    @Test
    public void runner1_1(){
        boolean expRes = false;
        Menu m1_1 = new Menu();
        Assert.assertEquals(expRes, m1_1.runner1(4));
    }

    @Test
    public void runner2(){
        boolean expRes = true;
        Menu m2 = new Menu();
        Assert.assertEquals(expRes, m2.runner2(2));
    }

    @Test
    public void runner2_2(){
        boolean expRes = false;
        Menu m2_2 = new Menu();
        Assert.assertEquals(expRes, m2_2.runner2(4));
    }

    @Test
    public void runner3(){
        boolean expRes = true;
        Menu m3 = new Menu();
        Assert.assertEquals(expRes, m3.runner3(3));
    }

    @Test
    public void runner3_3(){
        boolean expRes = false;
        Menu m3_3 = new Menu();
        Assert.assertEquals(expRes, m3_3.runner3(4));
    }

    @Test
    public void runner4(){
        boolean expRes = true;
        Menu m4 = new Menu();
        Assert.assertEquals(expRes, m4.runner4(4));
    }

    @Test
    public void runner4_4(){
        boolean expRes = false;
        Menu m4_4 = new Menu();
        Assert.assertEquals(expRes, m4_4.runner4(9));
    }
}