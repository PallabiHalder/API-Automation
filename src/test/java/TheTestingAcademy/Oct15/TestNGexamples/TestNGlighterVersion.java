package TheTestingAcademy.Oct15.TestNGexamples;

import org.testng.annotations.*;

public class TestNGlighterVersion {


    @BeforeSuite
    void demo1 (){

        System.out.println("BeforeSuite"); // Read data from the excel.
    }


    @BeforeMethod
    void demo4 (){

        System.out.println("BeforeMethod");
    }


    @Test
    void demo5 (){

        System.out.println("Test  #1");  // TestCase
    }

    @Test
    void demo6 (){

        System.out.println("Test  #2");  // TestCase
    }

    @AfterMethod
    void demo7 (){

        System.out.println("AfterMethod");
    }


    @AfterSuite
    void demo9 (){

        System.out.println("AfterSuite"); // Close the SQL database.
    }

}


// Method() will run equal number of testcases.

// Suite() will run 1 time for multiple number of testcases.