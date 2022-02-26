package com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.specification.RequestSpecification;

public class RealTimeHeaderOverwrite {
	
	
	@Test
	public void defaultBehavoiur()
	{
		
		
		RequestSpecification res1=RestAssured.given()
				.header("header1","value1");
				
		RequestSpecification res2=RestAssured.given()
				.header("header2","value2")
		         .header("header1","value3");
		RestAssured
		.given()
		//.config(RestAssured.config()
		//		.headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("header1")))
		
		.spec(res1)
		.spec(res2)
		.log()
		.all()
		.when()
		.get();
		
		
	}
	
	

}
