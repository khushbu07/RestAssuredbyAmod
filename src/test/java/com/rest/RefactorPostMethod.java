package com.rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RefactorPostMethod {

	public static void main(String args[]){
		
		
		//Build Request
			
		//RequestSpecification requestSpecification=RestAssured.given();
		//RequestSpecification requestSpecification=RestAssured.given().log().all();
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/");
		//RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/").basePath("booking");
			
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
		.statusCode(200); // validate response
		
		
		    //requestSpecification.contentType(ContentType.JSON);
           // Hit the request and get response
		   //  Response response = requestSpecification.post();
		   // validate response
           //  ValidatableResponse validatableResponse = response.then().log().all();
	       // validatableResponse.statusCode(200);

	}

	}
