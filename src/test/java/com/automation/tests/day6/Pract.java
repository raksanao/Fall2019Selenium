package com.automation.tests.day6;

import com.automation.utulities.BrowserUtils;
import com.automation.utulities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class Pract {
    public static void main(String[] args)throws Exception {

    }

    public boolean less20(int n) {
        if(n%20==19||n%20==18)
return true;
        else
            return false;
    }
}
