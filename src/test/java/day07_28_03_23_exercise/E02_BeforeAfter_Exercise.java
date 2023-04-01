package day07_28_03_23_exercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class E02_BeforeAfter_Exercise {
    @Before
    public void setup(){
        System.out.println("Her testten once");
    }
    @After
    public void tearDown(){
        System.out.println("Her testten sonra");
    }
    @Test
    public void test01(){
        System.out.println("Test01");
    }
    @Test
    public void test02(){
        System.out.println("Test02");
    }

}
