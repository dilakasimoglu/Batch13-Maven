package day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstMavenClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
       WebElement agreeButtonu= driver.findElement(By.id("L2AGLb"));
       agreeButtonu.click();
       driver.navigate().refresh();
       driver.navigate().to("https://www.youtube.com/");
       driver.navigate().back();
       driver.navigate().forward();
       driver.close();



    }
}