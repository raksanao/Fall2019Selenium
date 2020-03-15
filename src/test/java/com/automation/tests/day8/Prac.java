package com.automation.tests.day8;

import com.automation.utulities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Prac {
    private WebDriver driver;

    @Test
    public void amazonSearch() {
        driver.get("https://www.google.com");

driver.manage().window().maximize();
        String title=  driver.getTitle();
        System.out.println(title);


    }
  @BeforeMethod
  public void setUp(){
      WebDriverManager.chromedriver().version("79").setup();
      driver=new ChromeDriver();
  }
  @AfterMethod
  public void tearDown(){
      driver.quit();
  }
    }



