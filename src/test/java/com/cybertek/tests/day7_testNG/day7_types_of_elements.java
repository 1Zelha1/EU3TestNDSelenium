package com.cybertek.tests.day7_testNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class day7_types_of_elements {

    public void RadioButtonTest() throws InterruptedException {



            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.get("http://practice.cybertekschool.com/radio_buttons");

            // location Radio Button
            WebElement blueRadioBtn = driver.findElement(By.cssSelector("#blue"));
            WebElement redRadioBtn = driver.findElement(By.id("red"));

           // how to check radio button are selected
            System.out.println("blueRadioBtn.isSelected()=" + blueRadioBtn.isSelected());
            System.out.println("redRadioBtn.isSelected()=" + redRadioBtn.isSelected());


          // verify blue is selected red is not selected
          //blue------->true
        Assert.assertTrue(blueRadioBtn.isSelected(),"verify that blue is selected");

         //red---------> false
       Assert.assertFalse(redRadioBtn.isSelected(),"verify red is not selected");

       //how to click radio button
     redRadioBtn.click();


            Thread.sleep(3000);

            driver.quit();
        }
    }

