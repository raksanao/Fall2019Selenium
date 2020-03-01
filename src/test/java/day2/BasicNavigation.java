package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.manage().window().maximize();
       String title=driver.getTitle();
        String expectedTitle="Google";
        System.out.println("Title is "+title);

        if(expectedTitle.equals("Google")){
            System.out.println("Test passed");
        }else{
            System.out.println("Failed");
        }
        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);
        if(driver.getTitle().toLowerCase().contains("amazon")){
            System.out.println("Test passed");
        }else{
            System.out.println("test Failed");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        verifyEqueals(driver.getTitle(),"Google");
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println("Title:"+driver.getTitle());
        System.out.println("URL "+driver.getCurrentUrl());

        driver.navigate().refresh();



        driver.close();
    }
    public static void verifyEqueals(String arg1,String arg2){
        if(arg1.equalsIgnoreCase(arg2)){
            System.out.println("test passed");
        }else{
            System.out.println("Test failed");
        }
    }

}
