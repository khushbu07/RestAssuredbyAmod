package InlineAssertion;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class InlineAssertionsForArrays {
	
	public static void main(String[] args) {
	    RestAssured
       .given()
            .log()
            .all()
            .baseUri("https://restful-booker.herokuapp.com/booking")
           
       .when()
            .get()
       .then()
            .log()
            .all()
           .body("bookingid",Matchers.notNullValue())
           .body("bookingid",Matchers.hasItems(9,10));
	      



}

}
