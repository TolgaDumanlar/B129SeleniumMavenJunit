package day09_01_04_cumartesi_dropdown_alerts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class E01_DropDown {
    WebDriver driver;
    @Before
    public void setUp(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void test01(){
        List<WebElement> tumEyaletler = driver.findElements(By.xpath("//*[@id='state']//option"));

        //tumEyaletler.forEach(t-> System.out.println(t.getText()));
    }

    //b. Sayfadaki tüm ddm lerdeki tüm seçenekleri(option) konsolda yazdırınız

}
