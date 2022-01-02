package com.cybertek.tests.day7_testNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement usernameInput= driver.findElement(By.id("username"));
        System.out.println("usernameInput.isPlayed()="+ usernameInput.isDisplayed());

        //TASK
        // VERIFY USERNAME INPUTBOX IS NOT DISPLAYED ON THE SCREEN
        Assert.assertFalse(usernameInput.isDisplayed(),"verify this is not displayed");

        //CLICK START BUTTON
        // FIND START BUTTON AND CLICK

        driver.findElement(By.cssSelector("#starat>button")).click();

        // VERIFY USERNAME INPUTBOX IS DISPLAYED ON THE SCREEN
        Thread.sleep(5000);
    Assert.assertTrue(usernameInput.isDisplayed(),"verfy this is displayed");

    }
}
