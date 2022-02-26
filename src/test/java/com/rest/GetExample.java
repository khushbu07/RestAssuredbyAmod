package com.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetExample {

	public static void main(String args[]) {

//		// Build Request
//		RequestSpecification requestSpecification = RestAssured.given().log().all();
//		requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
//		requestSpecification.basePath("booking/{id}");
//		requestSpecification.pathParam("id", 10);
//        // Hit the request and get response
//        Response response = requestSpecification.get();
//       // validate response
//		ValidatableResponse validatableResponse = response.then().log().all();
//		validatableResponse.statusCode(200);
//		
		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/{id}")
		.pathParam("id", 10)
		.when().get()
		.then()
		.log()
		.all()
		.statusCode(200);
		
		
	
	}

}
