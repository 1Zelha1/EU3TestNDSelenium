package com.cybertek.tests.day_3_webelement_intro;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyUrlChanged {

 // open chrome browser

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    // go to http://practice.cybertekschool.com/forgot_password

    public WebDriver getDriver() {
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // Enter any email
        WebElement emailInputBox = driver.findElement(By.name("email"));

      // SendKeys()sen keybord action to the web element
        emailInputBox.sendKeys("mike@smith.com");

        // click retrive password
        WebElement retrivePasswordButton = driver.findElement(By.id("form_submit"));
        retrivePasswordButton.click();

       // TASK
        //verify that URL changed to "http://practice.cybertekschool.com/email_sent
       //First creat expectedUrl

        String expectedUrl ="http://practice.cybertekschool.com/email_sent";
        // saving actualurl from browser any email and click etrive password
         String actualUrl= driver.getCurrentUrl();

         if(expectedUrl.equals(actualUrl)){
             System.out.println("pass");

         }else{
             System.out.println("fail");
         }



        return null;
    }
}
