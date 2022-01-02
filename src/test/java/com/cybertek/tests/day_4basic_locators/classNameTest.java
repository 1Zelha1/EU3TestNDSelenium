package com.cybertek.tests.day_4basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class classNameTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
         driver.get("http://practice.cybertekschool.com/sign_up");

         // print multitype header

        System.out.println(driver.findElement(By.className("h3")).getText());
    }
}
