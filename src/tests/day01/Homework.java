package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

    driver.get("https://www.facebook.com/");

    String baslik="facebook";
    String asilBaslik=driver.getTitle();

    if(baslik.equals(asilBaslik)){
        System.out.println("Test OK");
    }else {
        System.out.println("baslik aslinda, "+asilBaslik+"'dir");
    }

    String sayfaURL="facebook";
    String gercekURL=driver.getCurrentUrl();
    if(gercekURL.contains(sayfaURL)){
        System.out.println("Test PASS");

    }else {
        System.out.println("gercek URL, "+gercekURL+"'dir");
    }

    driver.navigate().to("https://www.walmart.com/");

    String expectedTitle="Walmart.com";
    String actualTitle=driver.getTitle();

    if(actualTitle.contains(expectedTitle)){
        System.out.println("test goes="+actualTitle);

    }else {
        System.out.println("actually title is "+actualTitle+"'dir");
    }

    driver.navigate().back();

    driver.navigate().refresh();

    driver.manage().window().maximize();

    driver.close();


    }
}