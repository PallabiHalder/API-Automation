package TheTestingAcademy;

import io.restassured.RestAssured;

public class RestAssuredHW {

    public static void main(String[] args) {


                       RestAssured


                         .given().baseUri("https://restful-booker.herokuapp.com/ping")

                         .when().get()


                        .then().log().all().statusCode(201);

    }


}

// this is called Builder Pattern.
