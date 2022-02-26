package com.rest;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.specification.ResponseSpecification;

public class ResponseSpecificationExample {

	ResponseSpecification responseSpecification;
	@BeforeClass
	public void setupResponseSpec(){
	    responseSpecification=RestAssured.expect() ;
		responseSpecification.statusCode(200); 
		responseSpecification.contentType(ContentType.JSON);
		responseSpecification.time(Matchers.lessThan(5000l));
		
	}
	@Test
	public void CreateBooking(){
	    responseSpecification=RestAssured.expect() ;
		responseSpecification.statusCode(200); 
		responseSpecification.contentType(ContentType.JSON);
		responseSpecification.time(Matchers.lessThan(5000l));
		
	RestAssured //Build Request
	.given()
	.log()
	.all()
	.baseUri("https://restful-booker.herokuapp.com/")
	.basePath("booking")
	.body("{\"firstname\":\"Jim\",\"lastname\":\"Brown\",\"totalprice\":111,\"depositpaid\":true,\"bookingdates\":{\"checkin\":\"2018-01-01\",\"checkout\":\"2019-01-01\"},\"additionalneeds\":\"Breakfast\"}")
	.contentType(ContentType.JSON)
	.post() // Hit the request and get response
	.then() // validate response
	.log()
	.all()
	.spec(responseSpecification);
	
}



}



