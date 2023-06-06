package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C14_HomeWorkCheckbox {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //a.Verilen web sayfasına gidin.https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //b.Checkbox1 ve checkbox2 elementlerini locate edin.
        driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        driver.findElement(By.xpath("//input[@type='checkbox'][2]"));


        //c.Checkbox1 seçili değilse onay kutusunu tıklayın

        if(!driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected())
        {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
        }


        //d.Checkbox2 seçili değilse onay kutusunu tıklayın

        if(!driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected())
        {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
        }


        //Sayfayi kapat
        driver.close();



    }
}
