package com.rest;

import io.restassured.RestAssured;

public class PathParameterExample1 {

	public static void main(String[] args) {

		RestAssured
		.given()
		.log()
		.all()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("{basePath}/{id}")
		.pathParam("basePath", "booking")
		.pathParam("id", 2)
		.when().get()
		.then()
		.log()
		.all()
		.statusCode(200);
     
	
      
		
		
		
	}

}
