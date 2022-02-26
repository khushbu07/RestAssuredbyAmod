package com.rest;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParameterExample4 {
	
	public static void main(String args[]) {
		
		Map<String ,Object> pathParameters=new HashMap<>();
		pathParameters.put("basePath", "booking");
		pathParameters.put("bookingId", 7);
		
	  RestAssured
	   .given()
	      .log()
	      .all()
	      .baseUri("https://restful-booker.herokuapp.com/")
	      .basePath("{basePath}/{bookingId}")
	      .pathParams(pathParameters)
	   .when()
	      .get()
	      
	      
	   .then() 
	      .log()
	      .all();

}
}