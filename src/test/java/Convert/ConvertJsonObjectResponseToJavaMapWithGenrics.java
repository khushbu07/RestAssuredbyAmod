package Convert;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonObjectResponseToJavaMapWithGenrics {

	public static void main(String[] args) {
		Map<String,Object> jsonRespnseAsMap=RestAssured
				.get("https://run.mocky.io/v3/df9490b0-9f51-424d-9c59-51f5bac52e40")
				.as(new TypeRef<Map<String,Object>>(){});
		
		String firstname=(String) jsonRespnseAsMap.get("first_Name");
		System.out.println(firstname);
		
		Map<String,Object> skillmap =(Map<String, Object>) jsonRespnseAsMap.get("Skill2");
		System.out.println(skillmap.get("name"));
		System.out.println(skillmap.get("Proficiency"));
	}

	

}
