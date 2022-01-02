package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    /** go to Amazon.com
     * search the for selenium
     * click search button
     * verify  print 1-48 of 384results for selenium
     */
    public static void main (String[]args){

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("selenium");

        //click search button
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement result= driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
      String resultText= result.getText();
        System.out.println("resultText="+ resultText);

        String expectedResult="1-48 of 201 results for";
        if(expectedResult.equals(resultText)){
            System.out.println("pass");

        }else{
            System.out.println("fail");
            System.out.println("expectedResult="+expectedResult);
            System.out.println("resultText="+ resultText);
        }
    driver.quit();
    }





}
