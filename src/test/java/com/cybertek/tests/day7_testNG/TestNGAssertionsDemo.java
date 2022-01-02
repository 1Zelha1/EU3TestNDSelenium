package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1() {
        System.out.println("first assertion");
        Assert.assertEquals("title", "title");

    }



     @Test
     public void test4(){
        //verify email contain s @sign

         String email ="mike@smith.com";

         Assert.assertTrue(email.contains("@"),"verify email contains @");
     }

      @Test
      public void test5(){
Assert.assertFalse(0>1,"verify that o is not gretear then 1");

      }

// two things not equal we can use asserts not equal method
  //    @Test
  //    public void test6(){
    //  Assert.assertNotEquals("one,two");

     // }

    @AfterMethod
    public void tearDown(){
        System.out.println("close browser");

    }
}
