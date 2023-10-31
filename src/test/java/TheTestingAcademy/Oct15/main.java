package TheTestingAcademy.Oct15;

public class main {

    public static void main(String[] args) {

     NonBuilderPattern  nonBuilderPattern = new NonBuilderPattern() ;

     nonBuilderPattern.groundFloor();

     nonBuilderPattern.firstFloor();

     nonBuilderPattern.secondFloor();


        System.out.println("--------------------------");



     BuilderPattern bp = new BuilderPattern() ;

     bp.groundFloor().firstFloor().secondFloor() ; // it's called chaining.

    // Use builderpattern if step by step.

    }
}


// Rest Assured --> BDD Syntax --> Given , When, Then

// Pattern --> Builder Pattern


// RestAssured is a class .

// Given () , When () , Then () are static methods.. So we can call it directly.




// Rest Assured is a library, which helps to make HTTP request.

// TestNG to manage the testcases. Testing Framework.

// Allure Report : Reporting purpose.

// Maven : Build and dependency management and taking care of projects.

