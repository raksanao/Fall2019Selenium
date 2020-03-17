package Homework;

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

public class TestCase12345 {
   private WebDriver driver;

    private String URL="https://practice-cybertekschool.herokuapp.com/";
    private By dateOfBirthBy=By.name("birthday");
   // private By cPlusBy=By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[11]/div/div[1]/input");
   // private By javaBy=By.id("inlineCheckbox2");
    //private By javacsriptBy=By.id("inlineCheckbox3");
   private By firstNameBy=By.name("firstname");
   private By lastNameBy=By.name("lastname");
    private By userNameBy=By.name("username");
    private By EmailBy=By.name("email");
    private By PasswordBy=By.name("password");
    private By PhoneBy=By.name("phone");
    private  By maleBy=By.cssSelector("input[value='male']");
    private By femaleBy=By.cssSelector("input[value='female']");
    private By otherBy=By.cssSelector("input[value='other']");
    private By departmentBy=By.name("department");
    private  By jobTitleBy=By.name("job_title");
    private By cPlusBy=By.xpath("//label[text()='C++']/preceding-sibling::input");
    private By javaBy=By.xpath("//label[text()='Java']/preceding-sibling::input");
    private By javacsriptBy= By.xpath("//label[text()='JavaScript']/preceding-sibling::input");
    private By signUpBy=By.id("wooden_spoon");



   //Test case#1
@Test(description = "Verify warning message displayed")
public void verifyWarninMsgDisplayed() {
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[40]/a")).click();
    BrowserUtils.wait(5);
    driver.findElement(dateOfBirthBy).sendKeys("wrong_dob");
    BrowserUtils.wait(4);
    String expected = "The date of birth is not valid";
    String actual = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[8]/div/small[2]")).getText();
    Assert.assertEquals(expected, actual);
}
//Test Case#2
@Test(description = "verify if java c++ javascript displayed")
public void verifyIfJavaCJavaScriptDisplayed() {
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[40]/a")).click();

    driver.findElement(cPlusBy).isDisplayed();
    driver.findElement(javaBy).isDisplayed();
    driver.findElement(javacsriptBy).isDisplayed();
    BrowserUtils.wait(3);

}
//Test case#3
@Test(description = "Enter only one alphabbetic character")
public void enterAlphabeticInUserName(){
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[40]/a")).click();
    driver.findElement(firstNameBy).sendKeys("a");
    BrowserUtils.wait(3);
    WebElement warningMasg=driver.findElement(By.xpath("//small[text()='first name must be more than 2 and less than 64 characters long']"));
    Assert.assertTrue(warningMasg.isDisplayed());

}
//Test case#4
@Test(description = "Enter only one alphabetic character into last name input box")
public void enterAlphabetinLastName(){
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[40]/a")).click();
    driver.findElement(lastNameBy).sendKeys("b");
    BrowserUtils.wait(4);
    WebElement warningMasg=driver.findElement(By.xpath("//small[text()='The last name must be more than 2 and less than 64 characters long']"));
    Assert.assertTrue(warningMasg.isDisplayed());

}
//Test case#5
@Test(description = "Fill the form")
public void fillRegistrationForm(){
    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ul/li[40]/a")).click();
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




    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().version("79").setup();
        driver=new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        BrowserUtils.wait(3);
    }
    @AfterMethod
    public void tearDown(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }
}
