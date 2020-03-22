package Practiceme;

import com.automation.utulities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class pract1 {


@Test
    public void test1(String url, String title){
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get(url);


        Assert.assertTrue(driver.getTitle().contains(title));
       driver.quit();


    }
    @DataProvider(name = "Testdata")
public Object[][]testData(){
        return new Object[][]{{"http://google.com", "Google"},
                {"http://amazon.com", "Amazon"},
                {"http://ebay.com", "Ebay"}};


}
}
