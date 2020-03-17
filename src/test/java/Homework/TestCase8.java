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

public class TestCase8 {
    private WebDriver driver;
    private String URL = "https://practice-cybertekschool.herokuapp.com/";

    @Test(description = "Select USA")
    public void autocomplit(){
        driver.findElement(By.xpath("//a[@href='/autocomplete']")).click();
        driver.findElement(By.id("myCountry")).sendKeys("United States of America");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//input[@type='button']")).click();
        BrowserUtils.wait(2);
String expect="You selected: United States of America";
String actual=driver.findElement(By.id("result")).getText();
        Assert.assertEquals(expect,actual);

    }




    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        BrowserUtils.wait(3);


    }
    @AfterMethod
    public void teraDown(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
