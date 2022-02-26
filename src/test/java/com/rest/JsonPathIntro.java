package com.rest;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathIntro {

	
	@Test
	public void jsonPathIntro(){
		
		String json= "{\"firstname\":\"MMames\",\"lastname\":\"Brown\"}";
		
		JsonPath jsonpath=new JsonPath(json);
		String firstname=jsonpath.getString("firstname");
		
		System.out.println("Print firstName : "+firstname);
		
		String fname=jsonpath.get("firstname");
		System.out.println("if dnt knw type of object : "+fname);
		
		
	}
	
}
