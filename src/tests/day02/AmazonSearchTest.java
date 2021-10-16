package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

        //   1. Bir class oluşturun : AmazonSearchTest
//        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();


            //a.google web sayfasına gidin. https://www. amazon.com/
//        b. Search(ara) “city bike”
            driver.get("https://www.amazon.com/");
            WebElement amazonEnter = driver.findElement(By.id("twotabsearchtextbox"));
            amazonEnter.sendKeys("city bike"+ Keys.ENTER);


//        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
            WebElement results=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
            System.out.println(results.getText());

//        d. “Shopping” e tıklayın.
//        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
            WebElement ilkResim=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img"));
            ilkResim.click();
    }
}
