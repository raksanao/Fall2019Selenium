package Homework;

import com.automation.utulities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase91012 {
    private WebDriver driver;
    private String URL="http://practice.cybertekschool.com/";
//test case 9
@Test(description = "Returns 200 status code")
    public void statusCode200(){
    driver.findElement(By.xpath("//a[contains(text(),'Status Codes')]")).click();
BrowserUtils.wait(2);

    List<WebElement>elemnts=driver.findElements(By.xpath("//a[contains(@href,'status_codes')]"));
elemnts.get(0).click();
    String act= driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
    if(act.contains("This page returned a 200 status code.")){
        act="This page returned a 200 status code.";
    }else {
        System.out.println("Fail");
    }
   BrowserUtils.wait(1);
    String exp = "This page returned a 200 status code.";
    Assert.assertEquals(exp,act,"Test Fail !");






    }
//Test case 10
@Test(description = "Status code 300")
public void status300() {
    driver.findElement(By.xpath("//a[contains(text(),'Status Codes')]")).click();
    BrowserUtils.wait(3);

    List<WebElement> element2 = driver.findElements(By.xpath("//a[contains(@href,'status_codes')]"));
    element2.get(1).click();
    BrowserUtils.wait(2);

    String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
    if (actual.contains("This page returned a 301 status code.")) {
        actual = "This page returned a 301 status code.";
    } else {
        System.out.println("Fail");
    }
    BrowserUtils.wait(1);
    String expected = "This page returned a 301 status code.";
    Assert.assertEquals(expected, actual, "Test Fail !");


}
//test case11
@Test(description = "status code 404")
public void status404() {

    driver.findElement(By.xpath("//a[contains(text(),'Status Codes')]")).click();
    BrowserUtils.wait(3);

    List<WebElement> element2 = driver.findElements(By.xpath("//a[contains(@href,'status_codes')]"));
    element2.get(2).click();
    BrowserUtils.wait(2);

    String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
    if (actual.contains("This page returned a 404 status code.")) {
        actual = "This page returned a 404 status code.";
    } else {
        System.out.println("Fail");
    }
    BrowserUtils.wait(1);
    String expected = "This page returned a 404 status code.";
    Assert.assertEquals(expected, actual, "Test Fail !");
}
//test case 12
@Test(description = "status code 500")
public void status500(){
    driver.findElement(By.xpath("//a[contains(text(),'Status Codes')]")).click();
    BrowserUtils.wait(3);

    List<WebElement> element2 = driver.findElements(By.xpath("//a[contains(@href,'status_codes')]"));
    element2.get(3).click();
    BrowserUtils.wait(2);

    String actual = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
    if (actual.contains("This page returned a 500 status code.")) {
        actual = "This page returned a 500 status code.";
    } else {
        System.out.println("Fail");
    }
    BrowserUtils.wait(1);
    String expected = "This page returned a 500 status code.";
    Assert.assertEquals(expected, actual, "Test Fail !");





}
@BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        BrowserUtils.wait(2);
    }
    @AfterMethod
    public void tearDown(){
  if(driver!=null){
      driver.quit();
      driver=null;
  }

    }
}
