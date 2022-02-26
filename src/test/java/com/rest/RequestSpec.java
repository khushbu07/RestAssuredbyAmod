package com.rest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

	RequestSpecification requestSpecification;
	
	@BeforeClass
	public void setupReqSpec(){
		requestSpecification=RestAssured.given();
		requestSpecification
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		
		.contentType(ContentType.JSON);
	}
	
	@Test
	public void CreateBooking(){
		
		RestAssured //Build Request
		.given()
		.spec(requestSpecification)
		.basePath("booking")
		.body("{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}")
		.post() // Hit the request and get response
		.then()
		.log()
		.all()
		.statusCode(200);
		
	}
	
	@Test
	public void updateBooking(){
		
		RestAssured
		.given()
		     .spec(requestSpecification)
		     .basePath("booking/1")
		     .header("Authorization",  "Basic YWRtaW46cGFzc3dvcmQxMjM=")
			 .body("{\"firstname\":\"Mona\",\"lastname\":\"Jain\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}")
		.when()
			.put()
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
		}
}
