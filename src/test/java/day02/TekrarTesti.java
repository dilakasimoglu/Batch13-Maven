package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.youtube.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "youtube";
       // Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("ActualTitle: "+actualTitle);
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("youtube")){
            System.out.println("url:"+currentUrl);
        }
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
         actualTitle = driver.getTitle();
         if (actualTitle.contains("Amazon")){
             System.out.println("Actual Title: "+actualTitle);
         }
         driver.close();



    }
}
