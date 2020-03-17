package com.automation.tests.Practice;

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

public class viTrackPractice {
    private WebDriver driver;
    private String URL="https://qa2.vytrack.com/user/login?_rand=0.8331909386251282";
    private String username="storemanager85";
    private String password="UserUser123";

private By usernameBy=By.id("prependedInput");
private By passwordBy=By.id("prependedInput2");
private By fleetBy=By.xpath("//span[@class='title title-level-1' and contains(text(),'Fleet']");
@Test
public void veryFypage() {

    driver.findElement(usernameBy).sendKeys(username);
    driver.findElement(passwordBy).sendKeys(password,Keys.ENTER);
   BrowserUtils.wait(5);
driver.findElement(fleetBy).click();
BrowserUtils.wait(4);
driver.findElement(By.linkText("Vehicles")).click();


}








//private By warninmsg=By.cssSelector("[class='alert alert-error']>div");


//    @Test(description = "Verify if user enters invalid username gets warning msg")
//    public void verifyingInvalidTest(){
//driver.findElement(usernameBy).sendKeys("wee");
//
//        driver.findElement(passwordBy).sendKeys("ass", Keys.ENTER);
//        BrowserUtils.wait(4);
//
//        WebElement warninElement=driver.findElement(warninmsg);
//        Assert.assertTrue(warninElement.isDisplayed());
//String expected="Invalid user name or password.";
//String actual=warninElement.getText();
//Assert.assertEquals(expected,actual);


//    @Test(description = "valid user")
//    public void verfyValidUser(){
//        driver.findElement(usernameBy).sendKeys(username);
//driver.findElement(passwordBy).sendKeys(password,Keys.ENTER);
////WebElement title=driver.findElement(By.className("oro-subtitle"));
//String expected="Dashboard";
//String actual=driver.getTitle();
//Assert.assertEquals(expected,actual,"Title wrong");
//BrowserUtils.wait(5);





    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
            driver=null;
            BrowserUtils.wait(3);
        }
    }
}
