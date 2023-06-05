package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_WebElementLocator {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Çıkan reklamı locate edip kapatalım
        Thread.sleep(3000);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        //Arama bölümünde qa aratalım
        driver.findElement(By.xpath("//*[@id='elementor-search-form-9f26725']")).sendKeys("qa", Keys.ENTER);

        //Sayfa başlığının qa içerdiğini doğrulayalım
        String techActualTitle = driver.getTitle();
        String techExpectedTitle = "qa";
        if(techActualTitle.contains(techExpectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement link = driver.findElement(By.xpath("(//a[@href='https://techproeducation.com/software-career-opportunities-qa/'])[2]"));
        System.out.println(link.isEnabled());
        System.out.println(link.isDisplayed());


        //Carrer Opportunities In QA linkine tıklayalım
        link.click();


        //Başlığın Opportunities içerdiğini test edelim
        String actualCareerTitle = driver.getTitle();
        String expectedCareerTitle = "Opportunities";
        if(actualCareerTitle.contains(expectedCareerTitle)){
            System.out.println("Test PASSED.");
        }else{
            System.out.println("Test FAILED.");
        }


        //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
        driver.navigate().back();
        driver.navigate().back();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://techproeducation.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED.");
        }else{
            System.out.println("Test FAILED : " + actualUrl);
        }

        //sayfayi kapatalim
        driver.close();




    }
}
