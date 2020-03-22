package Practiceme;

import com.automation.utulities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSugestive {
    private WebDriver driver;
@Test
public void test(){
   WebElement distination= driver.findElement(By.id("fromCity"));

   distination.sendKeys("Mumbai,India",Keys.DOWN,Keys.ENTER);


BrowserUtils.wait(10);

WebElement to=driver.findElement(By.id(("toCity")));
to.clear();
to.sendKeys("Moscow,Russia",Keys.DOWN,Keys.ENTER);
//to.sendKeys(Keys.ENTER);
BrowserUtils.wait(8);
}

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        BrowserUtils.wait(3);



    }
    @AfterMethod
    public void tearDown(){
       driver.quit();


    }
}
