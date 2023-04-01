package day07_28_03_23_exercise;

import org.junit.*;

public class E03_BeforeClassAfterClass_Exercise {
    @BeforeClass
    public static void setUp(){
        System.out.println("Her classtan önce bir kere");
        System.out.println("==========================");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("Her classtan sonra bir kere");
        System.out.println("==========================");
    }
    @Before
    public void setUp1(){
        System.out.println("Her methottan önce bir kere");
        System.out.println("==========================");
    }
    @After
    public void tearDown1(){
        System.out.println("Her methottan sonra bir kere");
        System.out.println("==========================");
    }

    @Test
    public void test01(){
        System.out.println("Test edildi");
        System.out.println("==========");
    }
    @Test
    public void test02(){
        System.out.println("Test edildi");
        System.out.println("==========");
    }
    @Test
    public void test03(){
        System.out.println("Test edildi");
        System.out.println("==========");
    }
    @Test
    public void test04(){
        System.out.println("Test edildi");
        System.out.println("==========");
    }
}
