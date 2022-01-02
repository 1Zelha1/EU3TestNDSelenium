package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class listOfElements {

  WebDriver driver;


    @BeforeMethod
    public void setup(){
       WebDriver driver = WebDriverFactory.getDriver("chrome");

   }
   @AfterMethod
    public void tearDown() throws InterruptedException {
       Thread.sleep(2000);
       WebDriver driver = null;
       driver.quit();
   }
       @Test
        public void test1(){
         driver.get("http://practice.cybertekschool.com/multiple_buttons");

         //save our webElements inside the list

         List<WebElement> buttons = driver.findElements(By.tagName("Button"));
            System.out.println("buttons.size() = " + buttons.size());

          // verify button size
           Assert.assertEquals(buttons.size(),6,"verify button size");

           // iter + enter to get each loop

           for (WebElement button : buttons) {
              System.out.println(button.getText());
           }
           // click second button
           buttons.get(1).click();
   }

   @Test

    public void test2(){
       driver.get("http://practice.cybertekschool.com/multiple_buttons");

       //option+enter for the shortcut
      List<WebElement> button = driver.findElements(By.tagName("Buttonhhhhhhhhh"));

      System.out.println("button.size() = " + button.size());
   }
}
