package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
   WebDriver driver = new ChromeDriver();//Bos bir browser actik
   driver.get("https://www.amazon.com"); //ilk olarak gitmek istedigimiz sayfayi belirtiriz.
        System.out.println("sayfa basligi:  = " + driver.getTitle());
        System.out.println("Sayfa URL'i : "+ driver.getCurrentUrl());
     //   System.out.println("sayfanin kaynak kodlari"+driver.getPageSource());
        System.out.println(driver.getWindowHandle());//Bize o Window'a ait hash degerini verir. Biz bu hash degerlerini
                                                      //biz string'e atayip pencereler arasi gecis yapabiliriz.





    }
}
