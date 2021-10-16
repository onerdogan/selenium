package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Ara">

        driver.get("https://www.amazon.com/");
        WebElement amazonEnter = driver.findElement(By.id("twotabsearchtextbox"));
        amazonEnter.sendKeys("java"+ Keys.ENTER);

        WebElement sonucYazisi =driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());


        // webelementler obje oldugu icin direk yazdirilamazlar
        // webelemntin sahip oldugu yaziyi string olarak yazdirmak icin
        // getText() method u kullanilir



    }
}
