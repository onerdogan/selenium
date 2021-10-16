package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
//        1. Bir class oluşturun: LocatorsIntro
//        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//                a. http://a.testaddressbook.com adresine gidiniz.
//        b. Sign in butonuna basin
//        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
//        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!
//                e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
//                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
//        3. Sayfada kac tane link oldugunu bulun.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com");
//<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement singInelementCag = driver.findElement(By.linkText("Sign in"));
    singInelementCag.click();
Thread.sleep(2000);
    WebElement emailTextBox=driver.findElement(By.id("session_email"));

    WebElement passwordTextBox=driver.findElement(By.id("session_password"));

    WebElement signIButonu=driver.findElement(By.name("commit"));

    emailTextBox.sendKeys("testtechproed@gmail.com");
    passwordTextBox.sendKeys("Test1234!");
    signIButonu.click();



    WebElement dogruKullanici=driver.findElement(By.className("navbar-text"));
    String username="testtechproed@gmail.com";

    if(dogruKullanici.getText().equals(username)){
        System.out.println("dogru kullanici testi PASS");
    }else {
        System.out.println("dogru kullanici FAIL");
    }

    WebElement adressesLinki=driver.findElement(By.linkText("Addresses"));
    WebElement signOutLinki=driver.findElement(By.linkText("Sign out"));

    if(adressesLinki.isDisplayed()){
        System.out.println(" adres gorundu PASS");
    }else {
        System.out.println("adres gorunmedi FAIL");
    }

        if(signOutLinki.isDisplayed()){
            System.out.println(" sign out gorundu PASS");
        }else {
            System.out.println("sign out gorunmedi FAIL");
        }

        List<WebElement> linkSayisi=driver.findElements(By.tagName("a"));
        System.out.println("En son kalinan sayfadaki link sayisi; "+linkSayisi.size());

        //link lerin yazilarini yazdiralim
        //elimizdeki listedeki tum web elementlerin yazilarini veya for each loop la yazdirabiliriz
        //tum elementler yazdirilacaksa foreach loop daha kullanislidir
        int sira=1;
        for (WebElement each:linkSayisi
             ) {

            System.out.println(sira+" "+each.getText());
            sira++;

        }
//        for(int i=0;i<linkSayisi.size();i++){
//
//            System.out.println(linkSayisi.indexOf(0));
//        }
    driver.close();
    }
}
//        1. Bir class oluşturun : AmazonSearchTest
//        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
//        a.google web sayfasına gidin. https://www. amazon.com/
//        b. Search(ara) “city bike”
//        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
//        d. “Shopping” e tıklayın.
//        e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.