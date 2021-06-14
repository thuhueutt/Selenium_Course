package huentt_keydriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ActionKeywords {
    public static WebDriver driver;
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Setup\\new_chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void navigate(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.URL);
    }

    public void enterUser(){
        driver.findElement(By.id("email")).sendKeys(Constants.username);
    }

    public void enterPass(){
        driver.findElement(By.id("pass")).sendKeys(Constants.password);
    }

    public void clickLogin(){
        driver.findElement(By.name("login")).click();
    }

    public void closeBrowser(){

    }
}
