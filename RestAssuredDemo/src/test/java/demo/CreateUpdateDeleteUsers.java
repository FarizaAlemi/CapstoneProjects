package demo;

import java.util.HashMap;
import java.util.UUID;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class CreateUpdateDeleteUsers {
	

	HashMap<String,String> map= new HashMap<String,String>();
	 int id;
	 UUID uuid= UUID.randomUUID();
	 
	 
	 @BeforeTest
	 
	 public void createPaylod() {
		 map.put("name", "farizoo");
			map.put("email", uuid + "@gmail.com");
			map.put("gender", "female");
			map.put("status", "active");
			RestAssured.baseURI= "https://gorest.co.in/";
			RestAssured.basePath= "public/v2/users/";
			
		 
	 }
	 
	@Test(priority = 0)
	public void createUser() {
		
		
		Response response= RestAssured
				.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer eb5fe24c9caca9e7a13df435c96d7e2f5210c8f7b1e62da93adb53ec1816d5fd")
				.when()
				.post()
				.then()
				.statusCode(201)
				.log().all()
				.contentType(ContentType.JSON).extract().response();
		JsonPath jsonpath= response.jsonPath();
		id= jsonpath.get("id");
			
	}
	@Test(priority=1 )
	public void updateUser() {
		
		map.put("name", "farizoo");
		map.put("email", uuid + "@gmail.com");
		map.put("gender", "female");
		map.put("status", "active");
		RestAssured.baseURI= "https://gorest.co.in/";
		RestAssured.basePath= "public/v2/users/"+ id;
		
		RestAssured 
		.given()
		.contentType("application/json")
		.body(map)
		.header("Authorization", "Bearer eb5fe24c9caca9e7a13df435c96d7e2f5210c8f7b1e62da93adb53ec1816d5fd")
		.when()
		.put()
		.then()
		.statusCode(200)
		.log().all();
	
	}
	
	@Test (priority=2)
	public void deleteUuser() {
		
		RestAssured.baseURI="https://gorest.co.in/";
		RestAssured.basePath ="public/v2/users/"+ id;
		
		RestAssured
		.given()
		.contentType("application/json")
		.body(map)
		.header("Authorization", "Bearer eb5fe24c9caca9e7a13df435c96d7e2f5210c8f7b1e62da93adb53ec1816d5fd")
		.when()
		.delete()
		.then()
		.statusCode(204);		
	}
}
