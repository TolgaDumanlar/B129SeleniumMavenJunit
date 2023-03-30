package day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class C01_Assertion {
    /*
    1)https://amazon.com adresinegidin
    2)Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleriyapin
            ○ title Test  => Sayfa başlığının “Amazon” kelimesini içerip içermediğini test edin
            ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
            ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
            ○ wrongTitleTest => Sayfa basliginin “amazon” içermediğini dogrulayin
     */

    WebDriver driver;

    @Before
    public void setUp(){

        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

    }

    @After
    public void tearDown() throws InterruptedException {
     Thread.sleep(3000);
     driver.close();
    }

    @Test// ○ title Test  => Sayfa başlığının “Amazon” kelimesini içerip içermediğini test edin
    public void test01(){
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";

        Boolean iceriyotMu=actualTitle.contains(expectedTitle);
        assertTrue(iceriyotMu);
    }

    @Test//Amazon resminin görüntülendiğini (isDisplayed()) test edin
    public void test02(){
    WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
    boolean gorunurMu=logo.isDisplayed();
    assertTrue(gorunurMu);
    }

    @Test//Search Box 'in erisilebilir oldugunu test edin(isEnabled())
    public void test03() {
    WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchbox']"));
    assertTrue(aramaKutusu.isEnabled());
    }

    @Test//wrongTitleTest => Sayfa basliginin “amazon” içermediğini dogrulayin
    public void test04(){
        String actualTitle=driver.getTitle();
        String expectedTitle="amazon";
        assertFalse(actualTitle.contains(expectedTitle));
    }
}
