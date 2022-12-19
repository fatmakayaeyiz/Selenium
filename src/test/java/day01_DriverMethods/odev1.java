package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com/");
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Tekrar YouTube’sayfasina donelim
        driver.navigate().to("https://www.youtube.com");
        //Yeniden Amazon sayfasina gidelim
        driver.navigate().back();
        //Sayfayi Refresh(yenile) yapalim
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Sayfayi kapatalim //
        driver.close();
        // Tum sayfalari kapatalim
        driver.quit();
    }

}
