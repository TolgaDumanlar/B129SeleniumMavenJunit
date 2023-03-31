package day06_27_03_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class E01_Exercise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();

        /*
    https://www.amazon.com/ sayfasına gidelim
    Arama kutusunu locate edelim
    “Samsung headphones” ile arama yapalım
    Bulunan sonuç yazısını yazdıralım
    İlk ürünü tıklayalım
    Sayfadaki tüm başlıkları yazdıralım
     */

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Samsung headphones");
        searchBox.submit();

        WebElement sonucYazisi=driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        System.out.println(sonucYazisi.getText());

        WebElement ilkResim=driver.findElement(By.xpath
                ("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
        ilkResim.click();
        driver.navigate().back();
        driver.navigate().back();


        List<WebElement> h2Baslik=driver.findElements(By.xpath("//h2"));

        h2Baslik.forEach(t-> System.out.println(t.getText()));

        Thread.sleep(3000);

        driver.close();


    }

}
