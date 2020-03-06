package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
//driver.get("http://practice.cybertekschool.com");
        driver.get("https://www.zara.com/us/");
        List<WebElement>allLinks=driver.findElements(By.tagName("a"));
        System.out.println("amount of link "+allLinks.size());
WebElement b=driver.findElement(By.linkText("SEARCH"));
b.click();
Thread.sleep(3000);
driver.close();













//System.setProperty("webdriver.chrom.driver","chromedriver");
//
//WebDriverManager.chromedriver().setup();
//WebDriver driver=new ChromeDriver();
//driver.get("http://practice.cybertekschool.com");
//driver.manage().window().maximize();
//        List<WebElement>dr=driver.findElements(By.className("list-group-item"));
//        System.out.println(dr.size());
//        Thread.sleep(3000);
//        driver.close();
//











//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//        driver.get("http://google.com");
//        WebElement b=driver.findElement(By.id("gbqfbb"));
//b.click();
//Thread.sleep(3000);
//driver.close();
    }











//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.get("http://google.com");
//WebElement btn=driver.findElement(By.id("gbqfbb"));
//String ectual=btn.getAttribute("value");
//String expected="I'm Feeling Lucky";
//if(ectual.equals(expected)){
//    System.out.println("test passed");
//}else{
//    System.out.println("test failed");
//    System.out.println("Actual "+ectual);
//    System.out.println("Expected "+expected);
//}
//btn.click();
//Thread.sleep(4000);
//driver.close();
//    }



}
