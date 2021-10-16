package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class C01_XPath {
    public static void main(String[] args) throws InterruptedException {
//        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//        2- Add Element butonuna basin
//        3- Delete butonu’nun gorunur oldugunu test edin
//        4- Delete tusuna basin
//        5- Delete butonunun gorunur olmadigini test edin


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
//        2- Add Element butonuna basin

        // WebElement addButonu= driver.findElement(By.tagName("button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButonu.click();

//        3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButono=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if(deleteButono.isDisplayed()){
            System.out.println("delete butono test PASS");
        }else {
            System.out.println("delete butono test FAILED");
        }

//        4- Delete tusuna basin
        deleteButono.click();

//        5- Delete butonunun gorunur olmadigini test edin
        //eger butona bastigimizda html kodunda ki satir da siliniyorsa driver in o elemente ulazmasi mumkun olmayacagindan varligini yada yoklugunu test etmemiz mumkun olmaz
        //var olan bir element bu sekilde silindikten sonra local etmeye calisirsak
        //StaleElementReferenceExeption u aliriz
        /*
        if(!deleteButono.isDisplayed()){
            System.out.println("delete butono gorunmuyor test PASS");
        }else {
            System.out.println("delete butono gorunmuyor test FAILED");
        }*/
        driver.close();
    }

}
