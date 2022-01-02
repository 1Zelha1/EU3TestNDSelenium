package com.cybertek.tests.day_3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
//TASK
// open chrome browser
// go to  http://practice.cybertekschool.com/forgot_password


    // open chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    // go to  http://practice.cybertekschool.com/forgot_password

    //click on Retrieve password
    WebElement retrievePasswordButton= driver.findElement(By.id("from_submit"));

    //save expected URL  before clicking button
    String expectedUrl= driver.getCurrentUrl();



    public void setRetrievePasswordButton(WebElement retrievePasswordButton) {
      retrievePasswordButton.click();

      //save expected URL after clicking button
     String actualUrl= driver.getCurrentUrl();


      // verify that url did not change
        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }
    }
    //Close your browser
      // driver.quit();
}
