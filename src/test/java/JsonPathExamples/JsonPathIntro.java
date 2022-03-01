package JsonPathExamples;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathIntro {

	
	@Test
	public void jsonPathIntro(){
		
		String json= "{\"firstname\":\"MMames\",\"lastname\":\"Brown\"}";
		
		JsonPath jsonpath=new JsonPath(json);
		String firstname=jsonpath.getString("firstname");
		
		System.out.println("Print firstName : "+firstname);
		
		Object fname=jsonpath.get("firstname");
		System.out.println("if dnt knw type of object : "+fname);
		
		//int fn=jsonpath.get("firstname"); //ClassCastException
		//System.out.println("if dnt knw type of object : "+fn);
		
		String s= "Amod"; //NumberFormatException
		System.out.println(Integer.parseInt(s));
				
		
		
	}
	
}
