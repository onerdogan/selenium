package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {
        //Amazo sayfasina gidelim
        //title in "amazo oldugunu kontrol edin
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        //sayfa basliginin "amazon " oldugunu dogrulayin

        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen degerle ayni, test PASS");
        }else{
            System.out.println("title bekleneden farkli, test FAILED");
            System.out.println("actual title: "+ actualTitle);
        }
            driver.close();

    }
}
