package com.rest;

import io.restassured.RestAssured;

public class PathParameterExample3 {
	
	public static void main(String args[]) {
		
		
		 RestAssured
		   .given()
		      .log()
		      .all()
		   .when()
		      .get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking",3)
		   .then() 
		      .log()
		      .all();
	}
	

}
