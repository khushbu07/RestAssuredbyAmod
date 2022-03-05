package Convert;

import java.util.Map;

import io.restassured.RestAssured;

public class ConvertJsonObjectResponseToJavaMap {

	public static void main(String[] args) {
		
		Map jsonRespnseAsMap=RestAssured
				.get("https://run.mocky.io/v3/aa762854-87c5-4696-aece-906cbba63840")
				.as(Map.class);
		
		String firstname=(String) jsonRespnseAsMap.get("first_Name");
		System.out.println(firstname);
		
		jsonRespnseAsMap.keySet().forEach(k->System.out.println(k));
		
	}

}
