package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_ManageWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1-amazon sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //2-sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu :" + driver.manage().window().getPosition());
        System.out.println("Sayfanin baoyutlari :"+ driver.manage().window().getSize());
        //3-Sayfayi simge durumuna getirelim
        driver.manage().window().minimize();
        //4-simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //5-Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Sayfanin Konumu :" + driver.manage().window().getPosition());
        System.out.println("Sayfanin baoyutlari :"+ driver.manage().window().getSize());
        //6-Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        //7-Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("Sayfanin Konumu :" + driver.manage().window().getPosition());
        System.out.println("Sayfanin baoyutlari :"+ driver.manage().window().getSize());
        //8-sayfayi kapatin
        driver.close();



    }
}
