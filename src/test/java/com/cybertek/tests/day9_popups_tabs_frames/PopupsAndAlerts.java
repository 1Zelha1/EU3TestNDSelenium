package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {
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
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //click the destroy e world button
        driver.findElement(By.xpath("//buton[.='Destroy the World']")).click();

       // Click no button

        driver.findElement(By.xpath("//buton[.='No']")).click();
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://practice.cybertekschool.com/javascript_alerts");

        // click Click for JS ALLERT BUTTON
        driver.findElement(By.xpath("//buton[1]")).click();

        //SWITCH TO JS ALERT POP UP
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        //click to JS CONFIRM
        driver.findElement(By.xpath("//buton[2]")).click();
       Thread.sleep(2000);
       alert.dismiss();

       // click to JS PROMPT
        driver.findElement(By.xpath("//buton[3]")).click();

        // SEND KEYS TO JS PROMPT
        alert.sendKeys("MikeSmith");

        // click ok
        alert.getText();
    }
}
