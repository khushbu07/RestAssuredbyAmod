package Convert;



import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonArrayResponseToList {

	public static void main(String[] args) {
		
		List<Map<String, Object>> allEmp=RestAssured
		.get("https://run.mocky.io/v3/0595f5ce-7426-41b9-99b1-70568787d54d")
		.as(new TypeRef<List<Map<String, Object>>>(){});
		System.out.println(allEmp.size());
		
		Map<String ,Object> emp1=(Map<String, Object>) allEmp.get(0);
		System.out.println(emp1.get("last_Name"));
		
		
		
		
	}

}
