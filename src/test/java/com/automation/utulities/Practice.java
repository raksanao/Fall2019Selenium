package com.automation.utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().version("79.0").setup();
        WebDriver driver=new ChromeDriver();

driver.get("http://practice.cybertekschool.com/registration_form");

//WebElement tex=driver.findElement(By.tagName("h2"));
//        System.out.println(tex.getText());

        driver.findElement(By.name("firstname")).sendKeys("rukh");
driver.findElement(By.name("lastname")).sendKeys("olimo");
driver.findElement(By.name("username")).sendKeys("ooo");
driver.findElement(By.name("email")).sendKeys("gsggsg@gmail.com");
driver.findElement(By.name("password")).sendKeys("hshsh");

driver.findElement(By.name("phone")).sendKeys("111-333-5555");

List<WebElement>gender=driver.findElements(By.name("gender"));
gender.get(1).click();
driver.findElement(By.name("birthday")).sendKeys("22/33/1212");

driver.findElement(By.xpath("department")).click();

Thread.sleep(3000);
driver.close();






//        //how to collect all the link from the page
//List<WebElement>list=driver.findElements(By.tagName("a"));
//for(WebElement each:list){
//    System.out.println(each.getText());
//    System.out.println(each.getAttribute("href"));
// }
//
//        for (int i = 0; i <list.size(); i++) {
//            list.get(i).click();
////Thread.sleep(3000);
//driver.navigate().back();
////Thread.sleep(3000);
//list=driver.findElements(By.tagName("a"));
//        }
//driver.quit();
















//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www2.hm.com/en_us/index.html");
//        WebElement dropDown=driver.findElement(By.className("menu__session__item"));
//        dropDown.click();
//        //WebElement sign=driver.findElement(By.className("menu__sign-in-button"));
//        //sign.click();
//
//        WebElement email=driver.findElement(By.id("modal-txt-signin-email"));
//        email.sendKeys("rukhshona87@gmail.com");
//        WebElement password=driver.findElement(By.id("modal-txt-signin-password"));
//        password.sendKeys("ollle");
//       // WebElement signIN=driver.findElement(By.tagName("submit"));
//       // signIN.submit();
//        driver.findElement(By.linkText("Sign in"+ Keys.ENTER));
//       // driver.findElement(By.className("button large js-set-session-storage btn-login")).submit();
//        //signIN.click();
//        Thread.sleep(3000);
//        driver.quit();
    }


}
