package com.vitaliy1991.app.classwork.lesson4.task;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vitor on 03-Mar-17.
 */
public class TaskChoosenTest {
    @Test
    public void chooseTask1(){
        boolean expRes = true;
        TaskChoosen tc1 = new TaskChoosen();
        Assert.assertEquals(expRes, tc1.chooseTask1(1));
    }

    @Test
    public void chooseTask1_1(){
        boolean expRes = false;
        TaskChoosen tc1_1 = new TaskChoosen();
        Assert.assertEquals(expRes, tc1_1.chooseTask1(3));
    }

    @Test
    public void chooseTask2(){
        boolean expRes = true;
        TaskChoosen tc2 = new TaskChoosen();
        Assert.assertEquals(expRes, tc2.chooseTask2(2));
    }

    @Test
    public void chooseTask2_2(){
        boolean expRes = false;
        TaskChoosen tc2_2 = new TaskChoosen();
        Assert.assertEquals(expRes, tc2_2.chooseTask2(7));
    }

    @Test
    public void chooseTask3(){
        boolean expRes = true;
        TaskChoosen tc3 = new TaskChoosen();
        Assert.assertEquals(expRes, tc3.chooseTask3(3));
    }

    @Test
    public void chooseTask3_3(){
        boolean expRes = false;
        TaskChoosen tc3_3 = new TaskChoosen();
        Assert.assertEquals(expRes, tc3_3.chooseTask3(9));
    }

    @Test
    public void chooseTask4(){
        boolean expRes = true;
        TaskChoosen tc4 = new TaskChoosen();
        Assert.assertEquals(expRes, tc4.chooseTask4(4));
    }

    @Test
    public void chooseTask4_4(){
        boolean expRes = false;
        TaskChoosen tc4_4 = new TaskChoosen();
        Assert.assertEquals(expRes, tc4_4.chooseTask4(5));
    }
}