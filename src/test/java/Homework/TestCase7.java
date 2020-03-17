package Homework;

import com.automation.utulities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase7 {
private WebDriver driver;
private String URL="https://practice-cybertekschool.herokuapp.com/";

@Test(description = "Verify that uploaded file name is displayed.")
public void uploadFile(){
    driver.findElement(By.xpath("//a[@href='/upload']")).click();
BrowserUtils.wait(3);
driver.findElement(By.id("file-upload")).sendKeys("/Users/ABC/Desktop/Screen Shot 2020-03-04 at 3.54.45 PM.png");
BrowserUtils.wait(3);


driver.findElement(By.id("file-submit")).click();
BrowserUtils.wait(3);
String expected=driver.findElement(By.tagName("h3")).getText();
String actual="File Uploaded!";
Assert.assertEquals(expected,actual,"Test Fail!");



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
