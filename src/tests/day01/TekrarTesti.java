package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Öner\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.youtube.com/");

        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("title beklenen degerle ayni, test PASS");
        } else {
            System.out.println("title farkli, test FAILED");
            System.out.println("actual title: " + actualTitle);
        }

            String expectedURL = "youtube";
            String actualURL = driver.getCurrentUrl();

            if (actualURL.contains(expectedURL)) {
                System.out.println("test PASSED");
            } else {
                System.out.println("Test FAILED");
                System.out.println("gecerli URL: " + actualURL);
            }

            driver.navigate().to("https://www.amazon.com");

        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

            driver.navigate().back();
            driver.navigate().refresh();
            System.out.println(driver.getCurrentUrl());

            driver.navigate().forward();
             System.out.println(driver.getCurrentUrl());

            driver.manage().window().maximize();
            String expectedTitle2 = "Amazon";
            String actualTitle2 = driver.getTitle();

            if (actualTitle2.contains(expectedTitle2)) {
                System.out.println("test pass");
            } else {
                System.out.println("correct title " + actualTitle2);

            }

            String expectedURL2 = "https://www.amazon.com/";
            String actualURL2 = driver.getCurrentUrl();

            if (expectedURL2.equals(actualURL2)) {
                System.out.println("Test PASS");
            } else {
                System.out.println("Test FAILED");
                System.out.println("correct URL " + actualURL2);
            }
            driver.close();


        }
    }
