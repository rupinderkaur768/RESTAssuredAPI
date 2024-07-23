package Tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TestExamples {
	
	@Test

	public void test_1()
	{
		
		Response result = get("https://reqres.in/api/users?page=2");
		
		System.out.println(result.getStatusCode());
		System.out.println(result.getTime());
		System.out.println(result.getBody().asString());
		
		int StatusCode = result.getStatusCode();
		Assert.assertEquals(StatusCode, 200);
	}
	
	@Test
	
	public void test_2()
	{
		
		baseURI = "https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200);
	}


}
