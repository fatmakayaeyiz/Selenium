package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Examples {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*

         Ilk once Browser'i maximize yapalim sonra tum sayfa icin max bekleme surasi olarak 15 saniye belirtelim
        Sırasiyla amazon, facebook ve youtube sayfalarina gidelim.
        Amazon sayfasina tekrar donelim
        Amazon sayfasinin URL'ini https://www.amazon.com/ adresine eşit oldugunu test edelim
        Sayfanin konumunu ve pozisyonunu yazdiralim
        Sayfanin    konumunu ve size'ini istedigimiz sekile ayarlayalim
        ve istedigimiz şekilde oldugunu test edelim
        ve sayfayi kapatalim  */

//        Sırasiyla amazon, facebook ve youtube sayfalarina gidelim.
      driver.get("https://www.amazon.com/");
      driver.get("https://www.facebook.com/");
      driver.get("https://www.youtube.com/");
      //  Amazon sayfasina tekrar donelim
      driver.navigate().back();
      driver.navigate().back();

       // Amazon sayfasinin URL'ini https://www.amazon.com/ adresine eşit oldugunu test edelim

        String actualUrl= driver.getCurrentUrl();
        String exxpectedUrl="https://www.facebook.com/";
        if (actualUrl.equals(exxpectedUrl)){
            System.out.println("url test PASSED");
        }else System.out.println("url test FAILED");

       // Sayfanin konumunu ve pozisyonunu yazdiralim
       System.out.println("Sayfanin size'i"+driver.manage().window().getSize());
        System.out.println("Sayfanin konumu"+driver.manage().window().getPosition());

        //        Sayfanin    konumunu ve size'ini istedigimiz sekile ayarlayalim
        driver.manage().window().setSize(new Dimension(600, 600));
        driver.manage().window().setPosition(new Point(50,50));
        System.out.println("Sayfanin yeni size: " +driver.manage().window().getSize());
        System.out.println("Sayfanin yeni size: " +driver.manage().window().getPosition());

        //        ve istedigimiz şekilde oldugunu test edelim

        Dimension actualYeniSize = driver.manage().window().getSize();
        if (actualYeniSize.getWidth()==600&&actualYeniSize.getHeight()==600){
            System.out.println("Size TESTİ PASSED");
        }else System.out.println("size TESTİ FAILED");


        Point actualYeniKonum =driver.manage().window().getPosition();
        if (actualYeniKonum.getX()==50 &&actualYeniKonum.getX()==50){
            System.out.println("konum testi PASSED");
        }else System.out.println("konum TESTİ FAILED");

        //ve sayfayi kapatalim
        driver.close();
    }
}
