package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
    /*
    https://www.amazon.com/ sayfasına gidelim
    Arama kutusunu locate edelim
    “Samsung headphones” ile arama yapalım
    Bulunan sonuç yazısını yazdıralım
    İlk ürünü tıklayalım
    Sayfadaki tüm başlıkları yazdıralım
     */
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver() ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        https://www.amazon.com/ sayfasına gidelim
        driver.get("https://www.amazon.com/");

//        Arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

//        “Samsung headphones” ile arama yapalım
        aramaKutusu.sendKeys("Samsung headphones");
        aramaKutusu.submit();//Enter'a bastık

//        Bulunan sonuç yazısı yazdıralım
        WebElement aramaSonucu = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("aramaSonucu = " + aramaSonucu.getText());

//        İlk ürünü tıklayalım
        //Tüm arama sonucu ürünleri list içini koyup ilk elemanı tıklıyoruz
        List<WebElement> urunlistesi = driver.findElements(By.xpath("//img[@class='s-image']"));
        urunlistesi.get(0).click();

//        Sayfadaki tüm başlıkları yazdıralım

        List<WebElement> basliklar = driver.findElements(By.xpath("//h1"));

//        for (WebElement w : basliklar){
//            System.out.println(w.getText());
//        }

        basliklar.forEach(t -> System.out.println(t.getText()));

        //Sayfayı kapat
        driver.close();

    }
}

