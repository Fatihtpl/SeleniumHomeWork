package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C12_HomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");

        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");

        // amazon adresine geri donunuz
        driver.navigate().back();

        // n11 adresine ilerleyiniz
        driver.get("https://n11.com");

        // sayfayi yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();

        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");





    }
}
