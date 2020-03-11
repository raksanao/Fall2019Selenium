package com.automation.tests.day7;

import com.automation.utulities.BrowserUtils;
import com.automation.utulities.DriverFactory;
import org.openqa.selenium.WebDriver;

public class Xpath {
    public static void main(String[] args) {
        //*[@id="login"]/div[1]/div/input
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        BrowserUtils.wait(3);
        driver.quit();

    }
}
