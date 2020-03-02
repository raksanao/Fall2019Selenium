package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Practice {
    public static void main(String[] args) throws InterruptedException {
       WebDriverManager.chromedriver().setup();

       WebDriver driver =new ChromeDriver();
      driver.get("http://google.com");
      Thread.sleep(3000);
      WebElement search=driver.findElement(By.name("q"));
       search.sendKeys("Hello b 15",Keys.ENTER);
       WebElement newf=driver.findElement(By.linkText("Maps"));
       newf.click();








//       driver.manage().window().maximize();
//       Thread.sleep(3000);
//
//
//       String ectual=driver.getTitle();
//        String expect="Google";
//        System.out.println("ectual = " + ectual);
//
//       if(expect.equalsIgnoreCase(ectual)){
//           System.out.println("passed");
//       }else{
//           System.out.println("fail");
//       }
//        driver.navigate().to("http://amazon.com");
//   if(driver.getTitle().toLowerCase().contains("amazon")){
//           System.out.println("test passed");
//       }else{
//           System.out.println("failed");
//       }
//
//driver.navigate().back();
//   Thread.sleep(300);
//       veryFile(driver.getTitle(), "Google");
//driver.navigate().forward();
//Thread.sleep(3000);
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.navigate().refresh();
//        Thread.sleep(3000);
//       driver.close();
//
//    }
//    public static void veryFile(String arg1,String arg2) {
//        if(arg1.equals(arg2)){
//            System.out.println("passed");
//        }else{
//            System.out.println("failed");
//        }
    }
}
