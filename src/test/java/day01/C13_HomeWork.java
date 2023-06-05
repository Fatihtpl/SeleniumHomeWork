package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C13_HomeWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getTitle().contains("Teknoloji")) {
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("teknosa")) {
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitle = driver.getTitle();
        System.out.println(medunnaTitle);
        String medunnaUrl = driver.getCurrentUrl();
        System.out.println(medunnaUrl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (medunnaTitle.contains("MEDUNNA")) {
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if(medunnaUrl.contains("medunna")){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        // teknosa adresine geri donunuz
        driver.navigate().back();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat

        driver.close();



    }
}
