package com.automation.tests.Practice;

import com.automation.utulities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationForm {
    private String URL="http://practice.cybertekschool.com/registration_form";
    private WebDriver driver;

private By firstNameBy=By.name("firstname");
private By lastNameBy= By.name("lastname");
private By userNameBy=By.name("username");
private By EmailBy=By.name("email");
private By PasswordBy=By.name("password");
private By PhoneBy=By.name("phone");
private  By maleBy=By.cssSelector("input[value='male']");
private By femaleBy=By.cssSelector("input[value='female']");
private By otherBy=By.cssSelector("input[value='other']");
private By dateOfBirthBy=By.name("birthday");
private By departmentBy=By.name("department");
private  By jobTitleBy=By.name("job_title");
private By cplusplus=By.xpath("//label[text()='C++']/preceding-sibling::input");
private By javaBy=By.xpath("//label[text()='Java']/preceding-sibling::input");
private By javaScriptBy= By.xpath("//label[text()='JavaScript']/preceding-sibling::input");
private By signUpBy=By.id("wooden_spoon");


@Test
public void test1(){
    driver.findElement(firstNameBy).sendKeys("Matilda");
    driver.findElement(lastNameBy).sendKeys("Dendalion");
    driver.findElement(userNameBy).sendKeys("Avgustin");
    driver.findElement(EmailBy).sendKeys("mda@gmail.com");
    driver.findElement(PasswordBy).sendKeys("matildablabla");
    driver.findElement(PhoneBy).sendKeys("123-456-8734");
    driver.findElement(femaleBy).click();
    driver.findElement(dateOfBirthBy).sendKeys("09/03/2020");
    Select depart=new Select(driver.findElement(departmentBy));
    depart.selectByVisibleText("Department of Engineering");
    Select jobTitle=new Select(driver.findElement(jobTitleBy));
    jobTitle.selectByVisibleText("SDET");
    driver.findElement(javaBy).click();
    driver.findElement(signUpBy).click();
    BrowserUtils.wait(3);

   String expected="You've successfully completed registration!";
   String actual=driver.findElement(By.tagName("p")).getText();
           Assert.assertEquals(expected,actual);
}
@Test
public void verifyFirstNameTest(){
    driver.findElement(firstNameBy).sendKeys("a");
    BrowserUtils.wait(3);
    WebElement warningMasg=driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']"));
Assert.assertTrue(warningMasg.isDisplayed());
}
@Test
public void verifyAlphabeticLettersOlyTest(){
    driver.findElement(firstNameBy).sendKeys("123");
    BrowserUtils.wait(3);
    WebElement warningMessage=driver.findElement(By.xpath("//small[text()='first name can only consist of alphabetical letters']"));
    Assert.assertTrue(warningMessage.isDisplayed());


}


    @BeforeMethod
    public void  setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown(){
   driver.quit();
    }
}
