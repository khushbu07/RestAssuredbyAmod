package Payloads;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonObjectUsingMap {

	public static void main(String[] args) {
		
		Map<String, Object> jsonObjectPayload = new LinkedHashMap<String, Object>(); //linked hashmap fetch the input in sequence whatever we give
		jsonObjectPayload.put("id", 1);
		jsonObjectPayload.put("first_name", "Amod");
		jsonObjectPayload.put("last_name", "Mahajan");
		jsonObjectPayload.put("married", false);
		jsonObjectPayload.put("salary", 123.45);
		
		RestAssured
		.given()
		.log()
		.all()
		.body(jsonObjectPayload)
		.get();
		
		
		
		
	}

}
