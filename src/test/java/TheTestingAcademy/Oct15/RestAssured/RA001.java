package TheTestingAcademy.Oct15.RestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class RA001 {

    @Test(groups = {"Positive"},priority=1)

    public void getRequest_Positive() {


        RestAssured


                .given().baseUri("https://restful-booker.herokuapp.com/ping")

                .when().get()


                .then().log().all().statusCode(201);

    }




    @Test(groups = {"Negative"},priority=2)

    public void getRequest_Negative() {



        RestAssured


                    .given().baseUri("https://restful-booker.herokuapp.com/ping")

                    .when().get()


                    .then().log().all().statusCode(200);

        }

    }