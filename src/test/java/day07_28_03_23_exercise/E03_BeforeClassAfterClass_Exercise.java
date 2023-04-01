package day07_28_03_23_exercise;

import org.junit.BeforeClass;

public class E03_BeforeClassAfterClass_Exercise {
    @BeforeClass
    public void setUp(){
        System.out.println("Her classtan önce bir kere");
        System.out.println("==========================");
    }
}
