package com.automation.tests.day6;

import com.automation.utulities.BrowserUtils;
import com.automation.utulities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SetUpByValue {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select stateSelect=new Select(driver.findElement(By.id("state")));
        stateSelect.selectByValue("DC");

        String expect="District Of Columbia";
        String ectual=stateSelect.getFirstSelectedOption().getText();
        if(expect.equals(ectual)){
            System.out.println("Pass");
        }else{
            System.out.println("fail");

        }

        BrowserUtils.wait(3);
        driver.quit();
    }
}
