package Homework;

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

import java.util.List;

public class TestCase6 {
    private WebDriver driver;

    private   String URL1="http://practice.cybertekschool.com/";
private  String URL="https://www.fakemail.net/";


        @Test(description = "Copy and Save email as a string")
        public void copySaveEmail() {
            String email = driver.findElement(By.xpath("//span[@id='email']")).getText();

            BrowserUtils.wait(2);
            driver.navigate().to(URL1);
            BrowserUtils.wait(3);
            driver.findElement(By.xpath("//a[text()='Sign Up For Mailing List']")).click();
            BrowserUtils.wait(4);
            driver.findElement(By.name("full_name")).sendKeys("Ruxa");
            driver.findElement(By.name("email")).sendKeys(email);
            driver.findElement(By.name("wooden_spoon")).click();
            BrowserUtils.wait(3);
            String expected = "Thank you for signing up. Click the button below to return to the home page.";
            String actual = driver.findElement(By.tagName("h3")).getText();
            Assert.assertEquals(expected, actual);
            BrowserUtils.wait(4);
            driver.navigate().back();
            BrowserUtils.wait(2);
            driver.navigate().back();
            BrowserUtils.wait(2);
            driver.navigate().back();
            BrowserUtils.wait(3);
            driver.navigate().refresh();
            BrowserUtils.wait(5);
            //step 9-13 missing

            List<WebElement> mails = driver.findElements(By.xpath("//tr[contains(@class,'hidden')]"));
            String expected2 = "do-not-reply@practice.cybertekschool.com";
            for (int i = 0; i < mails.size(); i++) {
                if (mails.get(i).getText().contains(expected2)) {
                    mails.get(i).click();
                    break;



            }
        }

    String actual1 = driver.findElement(By.xpath("//span[@id='odesilatel']")).getText();
        Assert.assertEquals(expected2,actual1,"TestFail !");
                List<WebElement> mailText = driver.findElements(By.xpath("//html/body/br"));
        for(WebElement each : mailText){
        if(each.getText().contains("Cybertek Support")){
        System.out.println("Test Pass !!!");
        }else {
        System.out.println("Test Fail !!!");
        } } }


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().version("79").setup();
        driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        BrowserUtils.wait(3);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}