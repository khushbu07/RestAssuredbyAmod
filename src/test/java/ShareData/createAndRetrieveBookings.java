package ShareData;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class createAndRetrieveBookings {
	
	@Test
	public void createAndRetrieve(){
		
	int bookingid=	RestAssured //Build Request
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
		.extract()
		.jsonPath()
		.getInt("bookingid");
	
	Response response=RestAssured
	.given()
	.log()
	.all()
	.when()
	.get("https://restful-booker.herokuapp.com/booking/"+bookingid)
	.then()
	.log()
	.all()
	.extract()
	.response();
	
	
	
		
		
	}

}
