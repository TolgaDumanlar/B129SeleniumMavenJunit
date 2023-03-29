package day_02_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        // https://www.amazon.com/ adresine gidin
        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz
        // arama kutusunun, name attribute'nun degerinin 'field-keywords' oldugunu test edin
        // sayfayi kapatiniz

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // sayfanın yuklenmesi icin max bekleme suresi
        // https://www.amazon.com/ adresine gidin


        driver.get("https://www.amazon.com/");


        // arama kutusunun, tagName'inin 'input' oldugunu test ediniz


        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        String actuelTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if(expectedTagName.equals(actuelTagName)){
            System.out.println("TagName input");
        }else{
            System.out.println("TagName input degil");
        }


        // arama kutusunun, 'name' attribute'nun, degerinin 'field-keywords' oldugunu test edin


        String actuelNameDegeri = aramaKutusu.getAttribute("name");
        String expectedNameDegeri = "field-keywords";
        if(expectedNameDegeri.equals(actuelNameDegeri)){
            System.out.println("name attribute'nun degeri field-keyword");
        }else{
            System.out.println("name attribute'nun degeri field-keyword degil");
        }


        // sayfayi kapatiniz
        driver.close();
    }
}
