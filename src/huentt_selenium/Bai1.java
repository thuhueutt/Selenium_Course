package huentt_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.ArrayList;

public class Bai1 {

    WebDriver driver=  new ChromeDriver();
    String key = "selenium tutorial";

    public void openBrower() {
        String baseUrl = "https://www.google.com/";
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    public void locatedElement() throws InterruptedException {
        driver.findElement(By.name("q")).sendKeys(key);
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public void compareResult(){
        ArrayList<WebElement> list = new ArrayList<>(driver.findElements(By.xpath("//div[@class='yuRUbf']//h3")));
        for (int i = 0; i< list.size(); i++){
            if (list.get(i).getText().toLowerCase().contains(key.toLowerCase())){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Setup\\new_chromedriver_win32\\chromedriver.exe");
        Bai1 b1 = new Bai1();
        b1.openBrower();
        b1.locatedElement();
        b1.compareResult();

    }

}
