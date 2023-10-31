package TheTestingAcademy.Oct15.TestNGexamples;

import org.testng.annotations.*;

public class AllAnnotations {

    @BeforeSuite
    void demo1 (){

        System.out.println("BeforeSuite"); // Read data from the excel.
    }

    @BeforeTest
    void demo2 (){

        System.out.println("BeforeTest");
    }

 @BeforeClass
    void demo3 (){

        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void demo4 (){

        System.out.println("BeforeMethod");
    }


    @Test
    void demo5 (){

        System.out.println("Test");  // Only 1 TestCase, Others are pre conditions and post conditions.
    }

    @AfterMethod
    void demo6 (){

        System.out.println("AfterMethod");
    }


    @AfterClass
    void demo7 (){

        System.out.println("AfterClass");
    }

    @AfterTest
    void demo8 (){

        System.out.println("AfterTest");
    }


    @AfterSuite
    void demo9 (){

        System.out.println("AfterSuite"); // Close the SQL database.
    }

}
