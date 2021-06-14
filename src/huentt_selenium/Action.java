package huentt_selenium;

public class Action {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Setup\\new_chromedriver_win32\\chromedriver.exe");
        Bai1 b1 = new Bai1();
        b1.openBrower();
        b1.locatedElement();
        b1.compareResult();

    }
}
