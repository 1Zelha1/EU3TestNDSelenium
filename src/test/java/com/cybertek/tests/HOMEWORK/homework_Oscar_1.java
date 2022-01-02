package com.cybertek.tests.HOMEWORK;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class homework_Oscar_1 {

    // I have created three test scenarios for this weekend review. For those people who have some extra time and looking for something challenging  they can try these tasks. These are NOT mandatory. I will do them during the review time. Totally optional to test yourself. Have a nice evening.
    //    Task1:
    //    1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver     . +
    //    2. Click on "Click me, to Open an alert after 5 seconds"
    //    3. Explicitly wait until alert is present
    //    4. Then handle the Javascript alert
    //    Task2:
    //    1. Go to https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver
    //    2. Click on "Enable button after 10 seconds"
    //    3. Explicitly wait until the button is enabled
    //    4. Then verify the button is enabled
    //    Task3:
    //    1. Go to:  http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //    2. Login with username: Tester, password: test
    //    3. Click  Order button
    //    4. Verify under Product Information, selected option is “MyMoney”
    //    5. Then select FamilyAlbum, make quantity 2, and click Calculate,
    //    6. Then verify Total is equal to Quantity*PricePerUnit

    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //implicity wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod

    public void tearDown() throws InterruptedException {
        // Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void alertPresentTest()

            throws InterruptedException {
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

        driver.findElement(By.linkText("Click me")).click();


       //  Explicitly wait until alert is present
        WebDriverWait wait = new WebDriverWait(driver,10);

        //Then handle the Javascript alert
        String currentWindowHandle = driver.getWindowHandle();

        // click Click for JS ALLERT BUTTON
        driver.findElement(By.xpath("//buton[1]")).click();


    }
}