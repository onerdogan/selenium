package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//        1. Bir class oluşturun : Locators_css
//        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.


//                a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        Thread.sleep(2000);
//        b. Locate email textbox
        WebElement emailtextbox=driver.findElement(By.cssSelector(".form-control"));
        emailtextbox.sendKeys("testtechproed@gmail.com");

//        c. Locate password textbox ve
       // WebElement passwordtexbox1=driver.findElement(By.cssSelector("input[id='session_password']"));//By css selector
       // WebElement passwordtexbox1=driver.findElement(By.cssSelector("#session_password"));//By css selector
       // passwordtexbox1.sendKeys("Test1234!");
        WebElement passwordtextbox=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));//By xpath class degil id ile yazsak [2] gerek yok
        passwordtextbox.sendKeys("Test1234!");

//        d. Locate signin button
       // WebElement signInButton=driver.findElement(By.xpath("//input[@name='commit']"));
        WebElement signInButton=driver.findElement(By.cssSelector("input[name='commit']"));
        signInButton.click();
//        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
//        i. Username : testtechproed@gmail.com
//        ii. Password : Test1234!

    }
}
