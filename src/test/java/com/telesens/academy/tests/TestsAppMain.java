package com.telesens.academy.tests;

import com.telesens.academy.lesson10.AppMain;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsAppMain {

    @Test
    public void testGetHello() {
        System.out.println("*****testGetHello******");
        String actual = AppMain.getHello();
        String expected = "Hello";
        Assert.assertEquals(actual, expected);
//        assert actual.equals(expected);
    }
}
