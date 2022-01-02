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

public class NoSelectDropdown {

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
    public void test1(){

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));

       // click drop down see avaliable option

        dropdownElement.click();

        // get the option with the ind element metod and finding common locator bettween them
        List<WebElement>dropdownoptions = driver.findElements(By.className("dropdown-item"));

        // print size op option
       System.out.println("dropdownoptions.size() = " + dropdownoptions.size());
        Assert.assertEquals(dropdownoptions.size(),5,"verify size of option");

       //print them one by one
        for (WebElement option : dropdownoptions) {
        System.out.println(option.getText());
        }
       //click Yahoo
        dropdownoptions.get(2).click();

    }
}
