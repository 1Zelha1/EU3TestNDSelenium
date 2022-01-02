package com.cybertek.tests.day7_testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {

    @Test
    public void test1(){
        System.out.println("My first test");

    }
    @Test
    public void test2(){
        System.out.println("second test");

    }
    @BeforeMethod
    public void setUp(){
        System.out.println("webDriver, opening browser");

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Closing browse, quit");
    }
}
