package JsonPathExamples;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters {

	public static void main(String[] args) {

		String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\JsonPathExamples\\people.json";
		File jsonArrayFile = new File(filePath);

		JsonPath jsonpath = new JsonPath(jsonArrayFile);
		System.out.println(jsonpath.getString("[0].first_name"));

		List<String> allfname = jsonpath.getList("first_name");
		System.out.println(allfname);

		List<String> allfemaleFistName = jsonpath.getList("findAll{it.gender=='Female'}.first_name");
		System.out.println(allfemaleFistName);

		String emailID = jsonpath.getString("find{it.first_name =='Lothaire' & it.last_name =='Benazet'}.email");
		System.out.println(emailID);

		List<String> allemailID = jsonpath.getList("findAll{it.first_name =='Shellie' | it.last_name =='Hesbrook'}.email");
		System.out.println(allemailID);
		
		
		System.out.println(jsonpath.getList("findAll{it.id>=5}.first_name"));
		
		System.out.println(jsonpath.getInt("size()"));
		
		
		
		
		
		
		
		
		
		
	}

}
