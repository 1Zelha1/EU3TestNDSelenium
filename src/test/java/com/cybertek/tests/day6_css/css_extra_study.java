package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class css_extra_study {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/registration form");

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");

        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Bond");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("James@cybertekschool.com");

        driver.findElement(By.id("wooden spoon")).click();
        Thread.sleep(3000);
        driver.quit();



    }
}
