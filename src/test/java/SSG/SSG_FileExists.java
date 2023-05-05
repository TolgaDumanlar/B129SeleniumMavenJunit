package SSG;
import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;
import java.nio.file.Files;
import java.nio.file.Paths;
public class SSG_FileExists {
    @Test
    public void fileExistsTest1() {
        String dosyaYolu = "C:/Users/Sony/Desktop/data.xlsx";
        //"C:\Users\Lenovo\OneDrive\Masaüstü\data.xlsx"
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }
    @Test
    public void fileExistsTest2() {

    }
}
