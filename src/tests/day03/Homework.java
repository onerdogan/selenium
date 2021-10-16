package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Homework {
    // amazon.com a gidip java kelimesini aratin

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();


            //a.google web sayfasına gidin. https://www. amazon.com/
//        b. Search(ara) “java”
            driver.get("https://www.amazon.com/");
            driver.manage().window().maximize();
            WebElement amazonEnter = driver.findElement(By.id("twotabsearchtextbox"));
            amazonEnter.sendKeys("java"+ Keys.ENTER);


        // kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin
       WebElement sonucYazisi =driver.findElement(By.xpath("(//span[@dir=\"auto\"])[1]"));
        System.out.println(sonucYazisi.getText());

        WebElement kitap4=driver.findElement(By.linkText("Introduction to Java Programming and Data Structures, Comprehensive Version"));
        System.out.println("4. kitap: "+kitap4.getText());

        WebElement kitap7=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[7]"));
        System.out.println("7. kitap: "+kitap7.getText());
//List<WebElement> kitaplar=driver.findElements()

        List<WebElement> products=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));

        for (int i = 1; i < products.size(); i++) {

            if (i==3 || i==6) {
                System.out.println(i+1 + " numarali kitap : " +products.get(i).getText());
            }else {

            }

        }
    }

}

