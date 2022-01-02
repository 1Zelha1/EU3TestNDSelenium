package com.cybertek.tests.day_4basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //maximixe the window

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("mike smith with tagName");

        //lazy way click the button
        driver.findElement(By.tagName("button")).click();

        //sleep
      // Thread.sleep(3000);

        //close browser

        driver.quit();
    }
}
