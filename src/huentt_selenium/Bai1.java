package huentt_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Bai1 {

    WebDriver driver =  new ChromeDriver();

    public void openBrower() {

        String baseUrl = "https://www.google.com/";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    public void locatedElement() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys("selenium tutorial");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Setup\\new_chromedriver_win32\\chromedriver.exe");
        Bai1 b1 = new Bai1();
        b1.openBrower();
        b1.locatedElement();
    }

}
