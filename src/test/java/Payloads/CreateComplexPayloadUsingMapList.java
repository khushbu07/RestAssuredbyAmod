package Payloads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateComplexPayloadUsingMapList {

	public static void main(String[] args) {
		
		List<Map<String,Object>> finalPayload=new ArrayList<Map<String,Object>>();
		
		Map<String,Object> firstJsonObject=new LinkedHashMap<String,Object>();
		firstJsonObject.put("id",1 );
		firstJsonObject.put("first_Name","MOna" );
		firstJsonObject.put("last_Name", "Jain");
		firstJsonObject.put("Gender", "Female");
		firstJsonObject.put("email", "Fem@xyz.co.in");
		
		//List<String> mobileNo=new ArrayList<>();
		//mobileNo.add("7889888888");
		//mobileNo.add("9889888888");
		
		List<String> mobileNo1= Arrays.asList("7889888888","9889888888");
		firstJsonObject.put("mobile",mobileNo1);
		
		Map<String,Object> skillset=new LinkedHashMap<String,Object>();
		skillset.put("name", "Testing" );
		skillset.put("Proficiency", "medium" );
		
		firstJsonObject.put("skills",skillset);
		
	
		
		//Jsonobject--map
		//jsonarray--arraylist
		
		Map<String,Object> secondJsonObject=new LinkedHashMap<String,Object>();
		secondJsonObject.put("id",2 );
		secondJsonObject.put("first_Name","MOna1" );
		secondJsonObject.put("last_Name", "Jain1");
		secondJsonObject.put("Gender", "Female");
		secondJsonObject.put("email", "Fem2@xyz.co.in");
		
		List<Map<String,Object>> skillsList=new LinkedList<Map<String,Object>>();
		
		skillsList.add(skillset);
		secondJsonObject.put("Skill2",skillsList);
		Map<String,Object> javaskill=new LinkedHashMap<String,Object>();
		javaskill.put("name","test2");
		javaskill.put("profi","prof2");
		
		List<String> allcert= Arrays.asList("selenum","restapi");
		javaskill.put("certifciation",allcert);
		skillsList.add(javaskill);
		
		
		finalPayload.add(secondJsonObject);
		
	    finalPayload.add(firstJsonObject);
		
		RestAssured.given().log().all().body(finalPayload).get();
		
	}

}
