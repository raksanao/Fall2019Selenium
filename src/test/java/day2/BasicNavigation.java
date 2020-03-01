package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //ChromeDriver driver=new ChromeDriver();
       // RemoteWebDriver dr=new SafariDriver();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        Thread.sleep(3000);
        String title=driver.getTitle();
        String expectedTitle="Google";
        System.out.println("Title is "+title);
        if(expectedTitle.equals("Google")){
            System.out.println("Test passed");
        }else{
            System.out.println("Failed");
        }
        driver.close();
    }

}
