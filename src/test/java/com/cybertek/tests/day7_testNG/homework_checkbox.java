package com.cybertek.tests.day7_testNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class homework_checkbox {

    //Test Case Verify CheckBox CheckAll and UncheckAll Buttons
    //1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx
    //2.    Login with-----Username: Tester, password: test
    //3.    Click on check all button verify all the checkboxes are checked
    //4.    Click on uncheck all button verify that all the checkboxes are unchecked
    //5.    Select one of the checkbox and delete one person
    //6.    Then verify that deleted item is no longer exists


    public static void main(String[] args) throws InterruptedException {

        //1.    Go to http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        //2.    Login with-----Username: Tester, password: test

           WebElement userName= driver.findElement(By.id("name=\"ctl00_MainContent_username\""));
           WebElement password= driver.findElement(By.id("ctl00$MainContent$password"));
           userName.sendKeys("Tester");
            password.sendKeys("test");

        //3.    Click on check all button verify all the checkboxes are checked



                   WebElement checkAllButton=driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
                  checkAllButton.click();


                    WebElement uncheckboxButton=driver.findElement(By.id("ctl00_MainContent_btnUncheckAll"));
                    uncheckboxButton.click();

              WebElement checkboxany=driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector"));
              checkboxany.click();
             WebElement deleteButton=driver.findElement(By.id("ctl00_MainContent_btnDelete"));

              deleteButton.click();

              String pagesourcetext= driver.getPageSource();
             String firstCheckbox="ctl00_MainContent_orderGrid_ctl02_OrderSelector";

            if(pagesourcetext.contains(firstCheckbox)){
            System.out.println("Fail");
             }else{
              System.out.println("Pass");
        }

            Thread.sleep(2000);

            driver.quit();



    }
}
