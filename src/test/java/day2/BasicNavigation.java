package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //ChromeDriver driver=new ChromeDriver();
       // RemoteWebDriver dr=new SafariDriver();
        WebDriver drive=new ChromeDriver();
        drive.get("http://google.com");
    }

}
