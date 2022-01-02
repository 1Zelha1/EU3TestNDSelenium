package com.cybertek.tests.day_4basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IDLocatorsTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click don't click button
        WebElement dontClickButton = driver.findElement(By.id("disappering_button"));
        dontClickButton.click();

        driver.quit();


    }
}