package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Ofyaa {
    ////Navigate to "https://react-shopping-cart-67954.firebaseapp.com/"


//// Choose 5 items randomly, add to cart and print the names of items
//// (Each product cannot be added more then 1 time!)
//
//// CHECK THE PRICES!
//// Sum each item's price and compare your result with the website
//// If results are matching print success message
//// Get string price values from Website, convert them to double and add to <Double> ArrayList and print the price list
//// Click Checkout}


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://react-shopping-cart-67954.firebaseapp.com/");
//// List all the elements on the websitegit
        List<WebElement> urunListesi = driver.findElements(By.xpath("//p[@class='shelf-item__title']"));
        //List<WebElement> products = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));


        int sira=1;
        for (WebElement each:urunListesi
        ) {

            System.out.println(sira+" "+each.getText());
            sira++;

        }

//        for (int i = 1; i < urunListesi.size(); i++) {
//
//            //System.out.println("urunListesi = " + urunListesi.getText(urunListesi.get(i));
//                System.out.println(urunListesi.get(i).getText());
//        }
        //// Create a String Arraylist and put Product Names into the ArrayList

        List<String> urunListesiArray= new ArrayList<>();
        //urunListesiArray.addAll(urunListesi.indexOf(1));



    }
}
