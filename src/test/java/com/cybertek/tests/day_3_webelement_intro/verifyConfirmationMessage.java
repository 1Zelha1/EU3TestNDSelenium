package com.cybertek.tests.day_3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args) {

        // open chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password


            driver.get("http://practice.cybertekschool.com/forgot_password");

            // Enter any email
            WebElement emailInputBox = driver.findElement(By.name("email"));

            // SendKeys()sen keybord action to the web element
            emailInputBox.sendKeys("mike@smith.com");

            // verify  that email is displayed in the input box
          //two main ways to get txt from webelements
         //1.getText()-----it will work %99 and it will return string
        // 2.get Attribuite("value")-----second way of getting text especially input boxes

         String actualEemail = emailInputBox.getAttribute("value");
        System.out.println("actualEmail=" + actualEemail);
        // verify  that email is displayed in the input box

        String expectedEmail = "mike@smith.com";
        if(expectedEmail.equals(actualEemail)){
            System.out.println("pass");

        }else{
            System.out.println("fail");
        }

        //click  on retrieve password
        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        // verify that confirmation messages say'your email's been sent!';
        WebElement actualConfirmationMessage = driver.findElement(By.name("CONFIRMATION_MESSAGE"));
        System.out.println(actualConfirmationMessage.getText());


        }

    }