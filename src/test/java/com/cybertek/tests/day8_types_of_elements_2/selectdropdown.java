package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class selectdropdown {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
     driver = WebDriverFactory.getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
         driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");  // navigate dropdown page
        WebElement dropDownElement = driver.findElement(By.id("State")); // located dropDown
        // create Select object by passing that element as a constructor

        Select stateDropDown= new Select(dropDownElement);

        List<WebElement> options =  stateDropDown.getOptions();
        
       System.out.println("options size()= " + options.size());

     // print options one by one

        for (WebElement option : options) {

            System.out.println(option.getText());

        }
            // verify that first selection is select  a state

           String expectedOption = "Select a State";
        String actualOption = stateDropDown.getFirstSelectedOption().getText();
        Assert. assertEquals(actualOption,expectedOption,"verify firts selection");



          // HOW TO SELECT OPTION FROM DROPDOWN
        // 1- SELECT USING VISIBLE TEXT
        Thread.sleep(2000);
        stateDropDown.selectByVisibleText("Virginia");

        expectedOption= "Virginia";
        actualOption= stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");


        // 2- sSELECT USING INDEX
        Thread.sleep(2000);
        stateDropDown.selectByValue("TX");
        expectedOption= "Texas";
        actualOption= stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");


        // SELECT BY VALUE
        Thread.sleep(2000);
        stateDropDown.selectByIndex(51);
        expectedOption= "Wyoming";
        actualOption= stateDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");


    }





    }

