package Tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDeleteExample {
	
@Test
	
	public void PutTest()
	{
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
		
		
		
		JSONObject request = new JSONObject (map);
	
		System.out.println(request);
		
		baseURI = "https://reqres.in/api";
		given().body(request.toJSONString()).when().put("users/2").then().statusCode(200).log().all();
	}




@Test

public void PatchTest()
{
	
	Map<String,Object> map = new HashMap<String,Object>();
	map.put("name", "Raghav");
	map.put("job", "Singer");
	
	
	
	
	JSONObject request = new JSONObject (map);

	System.out.println(request);
	
	baseURI = "https://reqres.in/";
	given().body(request.toJSONString()).when().patch("/api/users/2").then().statusCode(200).log().all();
}


@Test

public void DeleteTest()
{
	
	
	baseURI = "https://reqres.in/";
	given().when().delete("/api/users/2").then().statusCode(204).log().all();
}

}
