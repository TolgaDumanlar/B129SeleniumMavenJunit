package day08_29_03_23_exercise_persembe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class E01_Assertion {
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
   public void setUp() throws InterruptedException {
            driver=new EdgeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.get("https://amazon.com");
            }

        @After
        public void name() throws InterruptedException {
           Thread.sleep(3000);
           driver.close();
        }

//       ○ title Test  => Sayfa başlığının “Amazon” kelimesini içerip içermediğini test edin
    @Test
    public void test01(){
            String actualTitle=driver.getTitle();
            String expectedTitle="Amazon";

        Boolean iceriyorMu=actualTitle.contains(expectedTitle);
        assertTrue(iceriyorMu);

    }

//            ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
    @Test
    public void test02(){
        WebElement logo=driver.findElement(By.id("nav-logo-sprites"));
        assertTrue(logo.isDisplayed());
    }

//            ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
@Test
        public void test03(){
            WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
            assertTrue(searchBox.isEnabled());
        }

//            ○ wrongTitleTest => Sayfa basliginin “amazon” içermediğini dogrulayin

    @Test
    public void test04(){
        String actualTitle=driver.getTitle();
        String expectedTitle="amazon";

        Boolean iceriyorMu=actualTitle.contains(expectedTitle);
        assertFalse(iceriyorMu);

    }






}
