package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin size'i"+driver.manage().window().getSize());
        System.out.println("Sayfanin konumu"+driver.manage().window().getPosition());
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));
        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Dimension actualYeniSize=driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600 && actualYeniSize.getHeight()==600){
            System.out.println("Size testi PASED");
        }else System.out.println("Size testi FAILED");

        Point actualYeniKonum=driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 && actualYeniKonum.getX()==50) {
            System.out.println("Konum testi PASSED");
        }else System.out.println("Konum testi FAILED");
        //Sayfayi kapatin
        driver.close();
    }
    }


