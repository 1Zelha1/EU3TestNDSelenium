package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod

    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void SwitchWindowsTest() {

        driver.get("http://practice.cybertekschool.com/windows");

        //get title
        System.out.println("Title before new window: " + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();

        System.out.println("Title after new window: " + driver.getTitle());

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {

            if (!handle.equals(currentWindowHandle)) ;

            driver.switchTo().window(handle);

            System.out.println("Title after new window: " + driver.getTitle());
        }

    }

    @Test
    public void moreThan2Window() {

        driver.get("http://practice.cybertekschool.com/windows");

        driver.findElement(By.linkText("Click Here")).click();


        System.out.println("Before switch: " + driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();

        // loop through each window
        for (String handle : windowHandles) {

            //one by one change it

            driver.switchTo().window(handle);

            //whenener your title equals to your expected window title
            if(driver.getTitle().equals("new window"));
            //stop
            break;

        }
        System.out.println("After switch :" + driver.getTitle());
    }

       // not=  why we need to use Alert method=
    // if we cannot clik insert  and we cannot say where find element and pup up locatore.
    // we use allert accept
    //alert dismiss
    //alert sendkeys
    //what is HANDLE? IT IS INIQE ID FOR THE BROWSER

}