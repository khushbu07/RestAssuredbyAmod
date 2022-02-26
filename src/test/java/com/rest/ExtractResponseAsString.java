package com.rest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ExtractResponseAsString {

	public static void main(String[] args) {
		String responseBody=
		RestAssured //Build Request
		
		.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking")
		.body("{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}")
		.contentType(ContentType.JSON)
		.post() // Hit the request and get response
		.then()
		.extract()
		.body()
		.asPrettyString();
		//.asString();
		System.out.println(responseBody);
		
		
	}

}
