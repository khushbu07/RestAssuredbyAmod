package JsonSchemaValidatorEx;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class CreateBookingWithSchemaValidator1 {

	public static void main(String args[]){
		
		RestAssured //Build Request
			.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.body("{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}")
			.contentType(ContentType.JSON)
			.post() // Hit the request and get response
			.then()
			.log()
			.all()
			.statusCode(200) // validate response
			.body(JsonSchemaValidator.matchesJsonSchema(new File("D:\\NaveenBatch\\RestAssured\\src\\test\\java\\JsonSchemaValidatorEx\\CreateBookingResponseSchema1.json")));
			
			
		}


}
