package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


        driver.get("https://www.amazon.com");
        System.out.println("su andaki url: "+driver.getCurrentUrl());
        System.out.println("su anki baslik: "+driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();

        //driver.quit();//acik olan tum browser lari kapatir

        driver.close();//sedece acik alan browser i kapatir
    }
}
