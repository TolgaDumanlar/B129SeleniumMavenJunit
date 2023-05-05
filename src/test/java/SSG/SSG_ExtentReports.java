package SSG;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SSG_ExtentReports extends TestBase {
    @Test
    public void extentReportsTest() {
        ExtentReports extentReports = new ExtentReports();
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/extentReport/reports"+tarih+".html";
        ExtentHtmlReporter extentHtmlReporter = new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Tester","Erol");
        extentHtmlReporter.config().setDocumentTitle("Extent Report");
        extentHtmlReporter.config().setReportName("Test Raporu");
        ExtentTest extentTest = extentReports.createTest("ExtentTest","Test Raporu");
        driver.get("https://amazon.com");
        extentTest.info("Amazon sayfasına gidildi");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        extentTest.info("Amazon sayfasında iphone aratıldı");
        extentTest.pass("Test Başarılı bir şekilde sonlandırıldı");
        extentReports.flush();
        driver.close();
    }
}