package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethods {


        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
        //asagidaki adimlari siryla tekrarlanabilir
        driver.navigate().to("https://www.techproeducation.com");
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(3000);


        driver.close();//sedece acik alan browser i kapatir
    }
}




