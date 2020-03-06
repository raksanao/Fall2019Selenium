package com.automation.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Go to ebay --->          driver.get("http://ebay.com");
         * enter search term        input.sendKeys("java book");
         * click on search button   searchButton.click();
         * print number of results
         */


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://ebay.com");
        driver.findElement(By.id("gh-ac")).sendKeys("Book");
        driver.findElement(By.id("gh-btn")).click();
       Thread.sleep(3000);
        WebElement result=driver.findElement(By.tagName("h1"));
        String[]numbers=result.getText().split(" ");

        System.out.println(numbers[0]);


/**
 * go to amazon
 * enter search term
 * click on search button
 * verify title contains search term
 */

driver.navigate().to("http://amazon.com");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress", Keys.ENTER);

if(driver.getTitle().contains("dress")){
    System.out.println("Pass");
}else{
    System.out.println("fail");
    Thread.sleep(3000);
}

/**
 * Go to wikipedia.org
 * enter search term `selenium webdriver`
 * click on search button
 * click on search result `Selenium (software)`
 * verify url ends with `Selenium_(software)`
 */

driver.navigate().to("http://wikipedia.org");
driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver",Keys.ENTER);
driver.findElement(By.partialLinkText("Selenium (software)")).click();
if(driver.getCurrentUrl().endsWith("Selenium_(software)")){
    System.out.println("pass");
}else{
    System.out.println("fail");
}
driver.close();




    }


}
