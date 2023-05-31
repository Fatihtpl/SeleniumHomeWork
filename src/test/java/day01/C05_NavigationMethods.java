package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1-youtube ana sayfasina gidelim.
        driver.get("https://www.youtube.com");
        //2-amazon sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //3-tekrar youtube sayfasina donelim.
        driver.navigate().back();
        //4.tekrar amazon sayfasina gidelim
        driver.navigate().forward();
        //5.Syfayi refresh Yapalim.
        driver.navigate().refresh();
        //6.sayfayi kapatalim
        driver.close();






    }
}
