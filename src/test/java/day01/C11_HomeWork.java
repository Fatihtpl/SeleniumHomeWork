package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C11_HomeWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");


         //Browseri tam sayfa yapin
        driver.manage().window().fullscreen();


         //Sayfayi "refresh" yapin
         driver.navigate().refresh();



         //Sayfa basliginin "Spend less" ifadesi icerdigini test edin
        if (driver.getTitle().contains("Spend less")) {
            System.out.println("Test PASSED");
        }else System.out.println("TestFAILED" + driver.getTitle() );

         //Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[@class='nav-a  '][4]")).click();

         //Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();
        Thread.sleep(3000);

         //Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//span[@class='a-truncate-cut'][1]")).click();
        Thread.sleep(3000);

        //Gift card details'den 25 $'i secin
        WebElement yirmeBesDolar = driver.findElement(By.xpath("//button [@id='gc-mini-picker-amount-1'][1]"));
        yirmeBesDolar.click();
        Thread.sleep(3000);

        //Urun ucretinin 25$ oldugunu test edin

        System.out.println("Urun fiyati : " + driver.findElement(By.xpath("//span[@id='gc-live-preview-amount']")).getText());


        //Sayfayi kapatin
        driver.close();









    }
}
