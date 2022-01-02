package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class iframeTest {

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
    public void test1() throws InterruptedException {
       driver.get("http://practice.cybertekschool.com/iframe");

       // How to switch frames
        //1= switch using by name or id attribute of iframe
       driver.switchTo().frame("mce_0_ifr");

       //clear  before sendkeys
        driver.findElement(By.cssSelector("#tinymce")).clear();
        Thread.sleep(2000);
       driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith");

       // goes back to first frame (main html)
        // goes back to first frame useful when we have switched multiple frames

        driver.switchTo().defaultContent();

        //switching the index
        driver.switchTo().frame(0);  // because we have only one iframe. index started 0

        // second way to switch parent
        driver.switchTo().parentFrame();

        // 3.way usning webelement
        WebElement iframeElement = driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(iframeElement);

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#tinymce")).sendKeys("MikeSmith with webelement");
    }
    @Test
    public void test2(){

        driver.get("http://practice.cybertekschool.com/nested_frames");

        //switching to frame top
        driver.switchTo().frame("frame-top");

        // top has 3 frame under the left middle and right
        // switch th frame middle
        driver.switchTo().frame("frame-middle");

        System.out.println(driver.findElement(By.id("content")).getText());

        //sibling cannot be switch .first you have to goes back top
        driver.switchTo().parentFrame();

        //now, switch rigt frame
        driver.switchTo().frame(2);

        System.out.println(driver.findElement(By.tagName("body")).getText());

        //switch bottom
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);

        System.out.println(driver.findElement(By.tagName("body")).getText());
    }
}