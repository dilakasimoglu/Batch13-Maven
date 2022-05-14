package day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();
        System.out.println("baslik :"+title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("url :" +currentUrl);
        driver.navigate().to("https://www.walmart.com/");
        String title1 = driver.getTitle();
        System.out.println("sayfa basligi : "+title1 );
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
