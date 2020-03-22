package Practiceme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPract {
    public static void main(String[] args) {
        WebDriver  driver=BrowserPractice.getBrowser("chrome");
        driver.get("http://practice.cybertekschool.com/");
     WebElement ele= driver.findElement(By.xpath("//html/body/div/div/div/ul/li[11"));
        System.out.println(ele.getText());
    }
}
