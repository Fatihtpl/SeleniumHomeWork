package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) {
        System.setProperty("chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu " + driver.manage().window().getPosition());
        System.out.println("Syfanin boyutlari " + driver.manage().window().getSize());
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Point point = new Point(50,50);
        Dimension dimension = new Dimension(520,140);//width 520, height 140 aşağısı failed
        driver.manage().window().setPosition(point);
        driver.manage().window().setSize(dimension);
        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Point actualPoint = driver.manage().window().getPosition();
        Dimension actualDimension = driver.manage().window().getSize();
        if(actualPoint.equals(point)){
            System.out.println("Position Test PASSED");
        }else {
            System.out.println("Position Test FAILED");
        }
        if(actualDimension.equals(dimension)){
            System.out.println("Dimension Test PASSED");
        }else{
            System.out.println("Dimension Test FAILED");
        }

        //Sayfayi kapatin
        driver.close();


    }
}
