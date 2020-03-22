package Practiceme;

import com.automation.utulities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SpiceJet {

    private WebDriver driver;

    @Test
   public void action() {
//go to web page
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        BrowserUtils.wait(3);
        //choosing BLR
        driver.findElement(By.xpath("//a[@ value='BLR']")).click();

BrowserUtils.wait(4);
//from parent to child
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
BrowserUtils.wait(3);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
driver.findElement(By.xpath("(//a[contains(text(),'30')])[1]")).click();
BrowserUtils.wait(3);
driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
BrowserUtils.wait(1);
driver.findElement(By.xpath("(//a[contains(text(),'28')])[1]")).click();
BrowserUtils.wait(2);
driver.findElement(By.id("divpaxinfo")).click();
        Select num=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
num.selectByVisibleText("2");
BrowserUtils.wait(2);
Select curency=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
curency.selectByVisibleText("USD");
BrowserUtils.wait(2);
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
   }

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        BrowserUtils.wait(3);
        driver.get("https://www.spicejet.com/");
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }



}


