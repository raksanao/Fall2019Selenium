package com.automation.utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Pract {
    public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       WebElement butt1= driver.findElement(By.xpath("//*[@onclick='button1()']"));
WebElement but2=driver.findElement(By.xpath("//*[@onclick='button2()']"));
WebElement but3=driver.findElement(By.xpath("//*[@onclick='button3()']"));
WebElement but4=driver.findElement(By.xpath("//*[@onclick='button4()']"));
WebElement but5=driver.findElement(By.xpath("//*[@onclick='button5()']"));
WebElement butt6=driver.findElement(By.xpath("//*[@onclick='button6()']"));
List<WebElement> allButt= Arrays.asList(butt1,but2,but3,but4,but5,butt6);
for(WebElement each:allButt){
    Thread.sleep(3000);
    each.click();
}


        Thread.sleep(300);
        driver.close();
    }

}
