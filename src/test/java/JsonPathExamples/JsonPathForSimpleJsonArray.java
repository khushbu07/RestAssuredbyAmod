package JsonPathExamples;



import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonArray {
	
	public static void main(String[] args) {
		String jsonArray = "[[\"10\",\"20\",\"30\",\"40\",\"50\"]]";
		
		JsonPath jsonPath  = new JsonPath(jsonArray);
		System.out.println(jsonPath.getString("[5]"));//null
		System.out.println(jsonPath.getList("$").size() );
		
		
		
	}

}
