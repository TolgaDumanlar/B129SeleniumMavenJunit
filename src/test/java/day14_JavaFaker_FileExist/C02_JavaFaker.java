package day14_JavaFaker_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class C02_JavaFaker {
@Test
    public void javaFakerTest(){
    //1.Faker objesi oluştur:

    Faker faker=new Faker();

    //Yada Faker.instance() static metodu ile başlayabiliriz.
    Faker.instance();

    //Firstname yazdırın.
    System.out.println(faker.name().firstName());

    //lastname yazdırın.
    System.out.println(Faker.instance().name().lastName());

    //username yazdırın.
    System.out.println(Faker.instance().name().username());

    //funnyname yazdırın.
    System.out.println(faker.funnyName().name());

    //meslek ismi yazdırın.
    System.out.println(faker.name().title());

    //cityname yazdırın.
    System.out.println(faker.address().city());

    //eyalet yazdırın.
    System.out.println(faker.address().state());

    //fulladress yazdırın.
    System.out.println(faker.address().fullAddress());

    //cepnumarası yazdırın.
    System.out.println(faker.phoneNumber().cellPhone());

    //email yazdırın.
    System.out.println(faker.internet().emailAddress());

    //postakodu yazdırın.
    System.out.println(faker.address().zipCode());

    //Rastgele 15 haneli numara yazdırın.
    System.out.println(faker.number().digits(15));
    }
}
