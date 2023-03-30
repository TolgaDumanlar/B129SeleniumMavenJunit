package day_02_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C03 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        // https://ebay.com sayfasına gidiniz
        // electronics bolumune tıklayınız
        // genisligi 225 ve uzunlugu 225 olan resimlerin hepsine sırasıyla tıklayınız ve sayfa baslıgını yazdırınız
        // sayfayı kapatınız


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // sayfanın yuklenmesi icin max bekleme suresi


        // https://ebay.com sayfasına gidiniz


        driver.get("https://ebay.com");


        // electronics bolumune tıklayınız


        driver.findElement(By.xpath("(//a[text()='Electronics'])[2]")).click();


        // genisligi 225 ve uzunlugu 225 olan resimlerin hepsine sırasıyla tıklayınız ve sayfa Title'ını yazdırınız


        for (int i = 0; i <24 ; i++) {
            List<WebElement> resimler = driver.findElements(By.xpath("//img[@width='225'and@height='225']"));
            resimler.get(i).click();
            System.out.println(i + " . Title" + driver.getTitle());
            driver.navigate().back();
        }


        // sayfayı kapatınız
        driver.close();
    }
}
