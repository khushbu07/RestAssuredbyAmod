package com.rest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostExample {
	public static void main(String args[]){
		
		
	//Build Request
		
		RequestSpecification requestSpecification=RestAssured.given();
		
		requestSpecification=requestSpecification.log().all();
		requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
		requestSpecification.basePath("booking");
		
		requestSpecification.body("{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}");

	    requestSpecification.contentType(ContentType.JSON);

	// Hit the request and get response
	
	    Response response = requestSpecification.post();

	// validate response

	    ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

}

}
