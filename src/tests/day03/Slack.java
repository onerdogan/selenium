package tests.day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slack {
    public static void main(String[] args) throws InterruptedException {
        //https://slack.com/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://slack.com/");
        Thread.sleep(2000);
    }
}
