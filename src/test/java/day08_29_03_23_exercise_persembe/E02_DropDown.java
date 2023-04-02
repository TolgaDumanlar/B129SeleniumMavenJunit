package day08_29_03_23_exercise_persembe;

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

public class E02_DropDown {
    WebDriver driver;

    @Before
    public void setUp() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void selectByIndex() throws InterruptedException {
     WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
     Select yearDropDown=   new  Select(year);
     Thread.sleep(3000);
     yearDropDown.selectByIndex(22);
    }
    @Test
    public void selectByValue() throws InterruptedException {
        WebElement month=driver.findElement(By.id("month"));
        Select monthDropDown=new Select(month);
        Thread.sleep(3000);
        monthDropDown.selectByVisibleText("January");
    }
    @Test
    public void selectByVisibleName(){
        WebElement day=driver.findElement(By.id("day"));
        Select dayDropDown=new Select(day);
        dayDropDown.selectByValue("28");
    }

    @Test
    public void getOptions(){
    WebElement state=driver.findElement(By.id("state"));
    Select stateDropDown=new Select(state);
    List<WebElement> stateList= stateDropDown.getOptions();
    stateList.forEach(t-> System.out.println(t.getText()));
    }
}
