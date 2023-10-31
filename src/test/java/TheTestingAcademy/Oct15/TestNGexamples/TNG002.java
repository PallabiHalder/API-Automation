package TheTestingAcademy.Oct15.TestNGexamples;

import org.testng.annotations.Test;

public class TNG002 {

    @Test     // If add @Test, then only main method will create and run option will be shown.

    public void test1(){

        System.out.println("T1");
    }


    public void test2(){    // Here @Test is not added, so no main method and can't runnable.

        System.out.println("T2");
    }

}
