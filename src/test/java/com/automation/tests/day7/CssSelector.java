package com.automation.tests.day7;

import com.automation.utulities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelector {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        driver.findElement(By.cssSelector(".h3"));
        WebElement home=driver.findElement(By.cssSelector(".nav-link"));
        WebElement btn1=driver.findElement(By.cssSelector("[onclick='button()']"));
        WebElement btn2=driver.findElement(By.cssSelector("[name='button()2']"));
        WebElement btn3=driver.findElement(By.cssSelector("[id^='button_']"));
        WebElement btn4=driver.findElement(By.cssSelector("[onclick='button4()]"));
        WebElement btn5=driver.findElement(By.cssSelector("[onclick='button5()]"));
        WebElement btn6=driver.findElement(By.cssSelector("#[disappearing_button]"));

    }
}
