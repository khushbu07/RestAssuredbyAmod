package com.rest;

import io.restassured.RestAssured;

public class PatchExample {

	public static void main(String[] args) {
		
		RestAssured
	.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/1")
		.header("Content-Type",  "application/json")
		.header("Authorization",  "Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.body("{\"firstname\":\"MMames\",\"lastname\":\"Brown\"}")
	.when()
		.patch()
	.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);

	}

}
