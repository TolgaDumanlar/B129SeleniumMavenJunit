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

public class E04_AmazonDropDown {
    WebDriver driver;
    @Before
    public void setUp(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void dropDown(){
    WebElement amazon=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
    Select test01=new Select(amazon);
    //test01.selectByVisibleText("Boys' Fashion");

      List<WebElement> amazonDDM=test01.getOptions();
      amazonDDM.forEach(t-> System.out.println(t.getText()));
    }
}
