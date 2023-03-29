package day07;

import org.junit.*;

public class C04_BeforeClassAfterClass {

    /*
    @BeforeClass ve @AfterClass notasyonları sadece statik methodlar ile çalışır.
     */

    @BeforeClass
    public static void setUp(){
        System.out.println("Tüm testlerden önce birkez çalışır");
        System.out.println("=================");
    }

    @AfterClass
    public static void dearDown(){
        System.out.println("Tüm testlerden sonra birkez çalışır");
        System.out.println("=================");
    }

    @Before

    public void setUp1(){
        System.out.println("Her testten önce çalışır");
        System.out.println("=================");
    }

    @After
    public void tearDown1(){
        System.out.println("Her testten sonra çalışır");
        System.out.println("=================");
    }


    @Test

    public void test01(){
        System.out.println("İlk test");
        System.out.println("=================");
    }

    @Test

    public void test02(){
        System.out.println("İkinci test");
        System.out.println("=================");
    }

    @Test

    public void test03(){
        System.out.println("Üçüncü test");
        System.out.println("=================");
    }
}
