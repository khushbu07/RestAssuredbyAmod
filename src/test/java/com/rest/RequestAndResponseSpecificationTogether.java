package com.rest;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestAndResponseSpecificationTogether {
	
	public static void main(String[] args) {
		
		RequestSpecification requestSpecification=RestAssured.given();
		requestSpecification
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.contentType(ContentType.JSON);
	
		ResponseSpecification responseSpecification=RestAssured.expect() ;
			responseSpecification.statusCode(200); 
			responseSpecification.contentType(ContentType.JSON);
			responseSpecification.time(Matchers.lessThan(5000l));
			
			RestAssured //Build Request
			.given(requestSpecification)
			//.spec(requestSpecification)
			.basePath("booking")
			.body("{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}")
			.post() // Hit the request and get response
			.then()
			.log()
			.all()
			.spec(responseSpecification);
			
			
}
}