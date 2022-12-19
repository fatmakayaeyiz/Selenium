package day02_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C04_ClassWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        //1. yol
         //  WebElement aramaSonucYazisi = driver.findElement(By.className("sg-col-inner"));
       // System.out.println(aramaSonucYazisi.getText());
        //2.Yol
        List<WebElement> aramaSunucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("arama sonuc yazisi : "+ aramaSunucYazisi.get(0).getText());

        //arama sonuc sayisini konsola yazdiriniz
        String [] sonucSayisi =aramaSunucYazisi.get(0).getText().split(" ");
        System.out.println("sonuc yazisi :"+sonucSayisi[2]);


        //sonuc sayisini lambda ile yazdiriniz.
        Arrays.
                stream(aramaSunucYazisi.get(0).
                getText().split(" ")).
                limit(3).skip(2).
                forEach(System.out::println);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> ilkWE= driver.findElements(By.className("s-image"));
        ilkWE.get(0).click();

        //sayfayi kapatin
        driver.close();
    }
}