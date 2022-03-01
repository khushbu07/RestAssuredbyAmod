package JsonPathExamples;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathNoExistence {
	
	@Test
	public void jsonPathIntro(){
		
		String json= "{\"firstname\":\"MMames\",\"lastname\":\"Brown\"}";
		
		JsonPath jsonpath=new JsonPath(json);
		
		//String firstname=jsonpath.getString("firstname1"); //null
		//System.out.println("Print firstName : "+firstname); //
		
		//int i=jsonpath.get("firstname1"); //NullPointerException
		//System.out.println("Print firstName : "+i); //
		
		System.out.println(jsonpath.get("$"));
		System.out.println(jsonpath.getString("$"));
		System.out.println((Object)jsonpath.get());
		System.out.println(jsonpath.get(""));

}
}