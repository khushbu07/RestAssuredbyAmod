package JsonPathExamples;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathForSimpleJsonArray2 {
	
	public static void main(String[] args) {
		
		String jsonArray="[[\"10\",\"20\",\"30\",\"40\",\"50\"],[\"100\",\"200\",\"300\",\"400\",\"500\"]]";
		
		JsonPath jsonPath  = new JsonPath(jsonArray);
		System.out.println(jsonPath.getString("[1][4]")); 
		System.out.println(jsonPath.getList("$").size() );
		
		List<Object> internalList= (List<Object>)jsonPath.getList("$").get(1);
		System.out.println(internalList.size());
		
		
	}

}
