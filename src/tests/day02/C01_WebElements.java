package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {


        //<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="reg_email__" value="" aria-required="true" placeholder="" aria-label="Cep telefonu numarası veya e-posta" id="u_0_o_/b">

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //email texbox a Ali yazdiralim
        WebElement emailTexBox = driver.findElement(By.id("email"));
        emailTexBox.sendKeys("aliselenium@gmail.com");


        Thread.sleep(2000);

       emailTexBox.clear();
        //WebElement mTagNameIle=driver.findElement(By.tagName("input"));
        //mTagNameIle.sendKeys("veligocer");6 tane input web element buldu, hangisini yazacagina karar veremedi,
        //NoSuchElementException vermez

     //   WebElement yanlsElement=driver.findElement(By.id("emailyanlis"));
       // yanlsElement.sendKeys("yanlis eleman");//NoSuchElementException:

        //giris yap butonuna tiklayalim
        WebElement girisButonu=driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
        girisButonu.click();





    }
}
