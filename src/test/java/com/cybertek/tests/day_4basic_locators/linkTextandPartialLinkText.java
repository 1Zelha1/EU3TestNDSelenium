package com.cybertek.tests.day_4basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class linkTextandPartialLinkText {
    public static void main(String[] args) {

    WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/dynamic_loading");


        WebElement link1 = driver.findElement(By.linkText("EXAMPLE 1"));
        link1.click();
    }



}

