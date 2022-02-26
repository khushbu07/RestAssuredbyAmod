package com.rest;

import io.restassured.RestAssured;

public class PutExample {
	
	public static void main(String[] args) {
		
		RestAssured
	.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/1")
		.header("Content-Type",  "application/json")
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
