package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.youtube.com/";
        System.out.println("url: "+ currentUrl);
        Assert.assertEquals(expectedUrl,currentUrl);
        driver.quit();
    }
}
