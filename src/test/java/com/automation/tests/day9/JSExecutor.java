package com.automation.tests.day9;

import com.automation.utulities.BrowserUtils;
import com.automation.utulities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSExecutor {
    private RemoteWebDriver driver;


    @BeforeMethod
    public void setup(){
     //  driver= DriverFactory.createDriver("chrome") ;
WebDriverManager.chromedriver().version("79").setup();
driver=new ChromeDriver();


    }




    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void scrollTest() {

        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        driver.manage().window().maximize();

        // JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 10; i++) {
            driver.executeScript("window.scrollBy(0,250)");
            BrowserUtils.wait(1);
        }
        BrowserUtils.wait(5);

    }
    @Test
    public void scrollToElementTest(){
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.linkText("Cybertek School"));
        driver.executeScript("arguments[0].scrollIntoView(true)", link);



    }

    }
