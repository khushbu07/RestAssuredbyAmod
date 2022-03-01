package JsonPathExamples;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters2 {

	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\JsonPathExamples\\people1.json";
		File jsonArrayFile = new File(filePath);

		JsonPath jsonpath = new JsonPath(jsonArrayFile);
		System.out.println(jsonpath.getString("data[0].first_name"));
		
		List<String> allfname = jsonpath.getList("data.first_name");
		System.out.println(allfname);

		List<String> allfemaleFistName = jsonpath.getList("data.findAll{it.gender=='Female'}.first_name");
		System.out.println(allfemaleFistName);


	}

}
