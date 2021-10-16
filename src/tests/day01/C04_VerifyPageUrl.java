package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        //Verify URL
        //https://www.techproeducation.com sayfasina gidelim
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();


        driver.get("https://www.techproeducation.com");
        //sayfa URL sini https://www.techproeducation.com oldugunu dogrulayin

        String expectedURL="www.techproeducation.com";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("test PASSED");
        }else{
            System.out.println("Test FAILED");
            System.out.println("gecerli URL: "+actualURL);
        }
        driver.close();
    }
}
