package com.automation.utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www2.hm.com/en_us/index.html");
        WebElement dropDown=driver.findElement(By.className("menu__session__item"));
        dropDown.click();
        //WebElement sign=driver.findElement(By.className("menu__sign-in-button"));
        //sign.click();

        WebElement email=driver.findElement(By.id("modal-txt-signin-email"));
        email.sendKeys("rukhshona87@gmail.com");
        WebElement password=driver.findElement(By.id("modal-txt-signin-password"));
        password.sendKeys("ollle");
       // WebElement signIN=driver.findElement(By.tagName("submit"));
       // signIN.submit();
        driver.findElement(By.linkText("Sign in"+ Keys.ENTER));
       // driver.findElement(By.className("button large js-set-session-storage btn-login")).submit();
        //signIN.click();
        Thread.sleep(3000);
        driver.quit();
    }


}
