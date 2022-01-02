package com.cybertek.tests.day_4basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkboxes {


    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("//input[2]"));

// How to verify check box selected or not

       System.out.println(" checkbox1.isSelected()= "+  checkbox1.isSelected() );
        System.out.println(" checkbox2.isSelected()= "+  checkbox2.isSelected() );
      // verify check boc is selected or not

        Assert.assertTrue(checkbox2.isSelected(),"verify that checkbox 2 is selected");
        Assert.assertFalse(checkbox1.isSelected(),"verify that checkbox 1 is not selected");

        checkbox1.click();

        //verify after lick
        Assert.assertTrue(checkbox2.isSelected(),"verify that checkbox 2 is selected");
        Assert.assertTrue(checkbox1.isSelected(),"verify that checkbox 1 is not selected");

        Thread.sleep(2000);
        driver.quit();

    }
}
