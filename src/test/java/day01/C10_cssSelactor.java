package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C10_cssSelactor {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna 100 defa basınız
        WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
        Thread.sleep(3000);
        for (int i = 0; i < 100; i++) {
            addButton.click();
        }

        // 100 defa basıldığını test ediniz
        List<WebElement> deleteButtons1 = driver.findElements(By.xpath("//*[@id='elements']/button"));
        if(deleteButtons1.size()== 100){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED : " + deleteButtons1.size());
        }


        // 90 defa delete butonuna basınız
        for (int i = 0; i <90 ; i++) {
            driver.findElement(By.xpath("//*[@id='elements']/button")).click();
        }

         Thread.sleep(3000);

        // 90 defa basıldığını doğrulayınız
        List<WebElement> deleteButton = driver.findElements(By.xpath("//*[@id='elements']/button"));
        if (deleteButton.size() == 10) {
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");

        // Sayfayı kapatınız
        driver.close();



    }

}
