package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1-Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");
        //2-Sayfa basligini yazdirin.
        System.out.println("Sayfa Basligi : " + driver.getTitle());
        //3-Sayfa basliginin amazon Amazon icerdigini test edin.
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        //4-Sayfa url adresini yazdirin.
        System.out.println("Safa url'i: " +driver.getCurrentUrl());

        //5.sayfa urlinin  amazon icerdigini test edin.

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "amazon";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");

        }else System.out.println("Test Failed");

        //6-Sayfanin handle degerini yazdirin
        System.out.println("Syfanin Handle Degeri: " + driver.getWindowHandle());

        //7-Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin.
        String actualHtml = driver.getPageSource();
        String expectedHtml = "Gateway";
        if (actualHtml.contains(expectedHtml)) {
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");

        //8-Sayfayi kapatin
        driver.close();




    }
}
