package TheTestingAcademy.Oct15.TestNGexamples;

import org.testng.annotations.Test;

public class TNGgrouping {


@Test (groups = {"Smoke","qa","logIn"})

    public void Test1 (){

        System.out.println("T1 - Smoke/ qa/ logIn");
    }


@Test (groups = {"Smoke","prepod", "logIn"})

    public void Test2 (){

        System.out.println("T2 - Smoke/ prepod/ logIn");
    }


@Test (groups = {"Reg","qa", "dashboard"})
    public void Test3 (){

        System.out.println("T3 - Reg/ qa / dashboard");
    }
}


// We can have multiple < include> and < exclude> in .xml

// We can have multiple classes also in .xml