package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Homework {
    public static void main(String[] args) {

        System.setProperty("web driver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //ChromeDriver kullanarak, facebook sayfasina gidin
        driver.get("https://www.facebook.com");
        // sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verify.");
        }else{
            System.out.println("Title : " + actualTitle);
        }

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test Passed");
        }else System.out.println("actual url : "+ actualUrl);

        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        if (driver.getTitle().contains("Walmart.com")) {
            System.out.println("Test Passed");
        }else System.out.println("walmartActualTitle :" + driver.getTitle());

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //sayfayi kapatin
        driver.close();







    }
}
