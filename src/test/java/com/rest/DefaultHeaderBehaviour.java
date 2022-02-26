package com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;

public class DefaultHeaderBehaviour {
	
	@Test
	public void defaultBehavoiur()
	{
		RestAssured
		.given()
		.header("header1","value1")
		.header("header1","value1")
		.log()
		.all()
		.when()
		.get();
		
		
	}
	
	
//	 headers that should be overwritten instead of merged adding headers or using request specifications. Note thatby default all headers are merged except the accept and content-type headers.For example, if the header with name header1 is not marked as overwritable (default) and you do the following: 
//		 given().header("header1", "value1").header("header1, "value2"). ..
//		 
//
//		Then header1 will be sent twice in the request: 
//		 header1: value1
//		 header1: value2
//		 
//
//		If you configure header1 to be overwritable by doing: 
//		 given().
//		         config(RestAssured.config().headerConfig(headerConfig().overwriteHeadersWithName("header1")).
//		         header("header1", "value1").
//		         header("header1", "value2").
//		         ...
//		 
//		then header1 will only be sent once:  header1: value2
//		 
//
//	
	
	@Test
	public void overwriteHeaderValue(){
		RestAssured
		.given()
		.config(RestAssured.config()
				.headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("header1","header2")))
		
		.config(RestAssured.config()
				.headerConfig(HeaderConfig.headerConfig().mergeHeadersWithName("header1")))
		
		.header("header1","value1")
		.header("header1","value2")
		.header("header2","value3")
		.header("header2","value4")
		.header("header5","value5")
		.header("header6","value6")
		.log()
		.all()
		.when()
		.get();
	}

}

