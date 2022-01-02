package com.cybertek.tests.day7_testNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.nio.file.FileStore;

public class AttributeTest {

    @Test
    public void test1(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioBtn= driver.findElement(By.id("blue"));
        blueRadioBtn.getAttribute("value");

        //get the value of the type attribute

        System.out.println(blueRadioBtn.getAttribute("type"));

        //get the value of the name attribute
        System.out.println(blueRadioBtn.getAttribute("name"));

        //get the value of the checked attribute


        System.out.println(blueRadioBtn.getAttribute("checked"));

        System.out.println(blueRadioBtn.getAttribute("outerHTML"));

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       WebElement button2= driver.findElement(By.name("button2"));

        System.out.println(button2.getAttribute("outerHTML"));

        System.out.println(button2.getAttribute("innerHTML"));

        //try to attribute dose not exits



        driver.quit();
    }
}
