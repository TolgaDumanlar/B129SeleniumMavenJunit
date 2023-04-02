package day08_30_03_23_exercise_persembe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class E03_DropDown {
    WebDriver driver;
    @Before
    public void setUp(){
     driver=new EdgeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     driver.get(" https://the-internet.herokuapp.com/dropdown");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

        //      1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
                @Test
    public  void test01(){
        WebElement option1=driver.findElement(By.id("dropdown"));
        Select dropByIndex=new Select(option1);
        dropByIndex.selectByIndex(1);
        }
        //      2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın

            @Test
        public  void test02(){
            WebElement option2=driver.findElement(By.id("dropdown"));
            Select dropByOption=new Select(option2);
            dropByOption.selectByValue("2");
            }

        //      3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve
        //      yazdırın

                @Test
                public  void test03(){
                    WebElement option3=driver.findElement(By.id("dropdown"));
                    Select dropByVisible=new Select(option3);
                    dropByVisible.selectByVisibleText("Option 1");
                }
        //      4.Tüm dropdown değerleri(value) yazdırın

    @Test
    public void getAll(){
        WebElement getAll=driver.findElement(By.id("dropdown"));
        Select optionList=new Select(getAll);
        List<WebElement> newList=optionList.getOptions();
        newList.forEach(t-> System.out.println(t.getText()));
    }
        //      5. Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True ,
    @Test
    public void dropDown(){
        WebElement dropDown=driver.findElement(By.id("dropdown"));
        System.out.println(driver.manage().window().getSize());

        Select test01=new Select(dropDown);

    }

        //       degilse False yazdırın.




}
