package TheTestingAcademy.Oct15;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;


@Test
public class RAPOSTreq {


    /*

        ** Pseudo Code : **


     Make a POST request ?

    To create a token POST

    URL  : https://restful-booker.herokuapp.com/booking
}

    Payload :

     {
    "firstname" : "Bubli",
    "lastname" : "Roy",
    "totalprice" : 111,
    "depositpaid" : true,
    "bookingdates" : {
        "checkin" : "2018-01-01",
        "checkout" : "2019-01-01"
    },
    "additionalneeds" : "Breakfast"
}



  HTTP Method : POST

  Header : Content-type : Application/json

  Verify -> TC #1 : status code.
            TC #2 : token should not be null.


     */




    public void PostRequest(){

        String payload = "{\n" +
                "    \"firstname\" : \"Bubli\",\n" +
                "    \"lastname\" : \"Roy\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}" ;


        RestAssured

                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .contentType(ContentType.JSON)


                .when().body(payload).post()

                .then().log().all().statusCode(200);


    }



}
