package day06_27_03_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class E02_Exercise {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         /*
    http://zero.webappsecurity.com sayfasına gidin
    Signin buttonuna tıklayın
    Login alanına  “username” yazdırın
    Password alanına “password” yazdırın
    Sign in buttonuna tıklayın
    Pay Bills sayfasına gidin
    Amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın
    Date kısmına “2023-03-27” yazdırın
    Pay buttonuna tıklayın
    “The payment was successfully submitted.” mesajının çıktığını kontrol edin
        */

    //        http://zero.webappsecurity.com sayfasına gidin
        driver.get("http://zero.webappsecurity.com");
    //        Signin buttonuna tıklayın
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
    //        Login alanına  “username” yazdırın
        driver.findElement(By.id("user_login")).sendKeys("username");
    //        Password alanına “password” yazdırın
        driver.findElement(By.id("user_password")).sendKeys("password");
    //        Sign in buttonuna tıklayın
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();
    //        Pay Bills sayfasına gidin
        driver.findElement(By.id("onlineBankingMenu")).click();
        driver.findElement(By.id("pay_bills_link")).click();
        Thread.sleep(3000);
    //        Amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın
        driver.findElement(By.id("sp_amount")).sendKeys("100");
    //        Date kısmına “2023-03-27” yazdırın
        driver.findElement(By.id("sp_date")).sendKeys("2023-03-27");
    //        Pay buttonuna tıklayın
        driver.findElement(By.id("pay_saved_payees")).click();
    //        “The payment was successfully submitted.” mesajının çıktığını kontrol edin
        WebElement uyari=driver.findElement(By.xpath(
                "//span[text()='The payment was successfully submitted.']"));

        System.out.println(uyari.getText());

        if(uyari.isDisplayed()){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.close();
        Thread.sleep(3000);

    }

}
