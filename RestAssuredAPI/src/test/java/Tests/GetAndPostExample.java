package Tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class GetAndPostExample {
	
@Test
	
	public void GetTest()
	{
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then()
		.statusCode(200)
		.body("data[4].first_name",equalTo("George"));
	
	}
	
	@Test
	
	public void PostTest()
	{
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
		System.out.println(map);
		
		
		JSONObject request = new JSONObject (map);
	
		System.out.println(request);
	}

}
