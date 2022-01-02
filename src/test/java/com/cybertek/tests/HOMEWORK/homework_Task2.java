package com.cybertek.tests.HOMEWORK;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homework_Task2 {

    // Task2:
    //    //    1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    //    //    2. Click on "Enable button after 10 seconds"
    //    //    3. Explicitly wait until the button is enabled
    //    //    4. Then verify the button is enabled

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod

    public void tearDown() throws InterruptedException {
        // Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        // click enable button after ten second

        driver.findElement(By.xpath("enable-button")).click();

        //Explicitly wait until the button is enabled

        WebDriverWait wait = new WebDriverWait(driver,10);

        //Then verify the button is enabled


    }
}