package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//
        //Amazon sayfasina gidelim

        driver.navigate().to("https://amazon.com");
        //techproeducation sayfasina gidelim
        Thread.sleep(3000); //gittigi sayfada 3 saniye bekler
        driver.navigate().to("https://techproeducation.com");
        //tekrar amazon sayfasina donelim
        Thread.sleep(3000);
        driver.navigate().back();//amazon sayfasina geri gider
        //tekrar hepsiburada sayfasina  gidelim
        Thread.sleep(3000);
        driver.navigate().forward();//techproeducation a gider
        //son sayafada sayfayi yenileyelim(refresh);
        Thread.sleep(3000);
        driver.navigate().refresh();
        //ve sayfayi kapatalim
        driver.close();
    }
}
