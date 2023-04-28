package demo;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateUser {

	
	HashMap<String,String> map= new HashMap<String,String>();
	
	@BeforeTest
	public void createPayLod() {
		
		map.put("name", "farizoo");
		map.put("email", "farizoo123821@gmail.com");
		map.put("gender", "female");
		map.put("status", "active");
		RestAssured.baseURI= "https://gorest.co.in/";
		RestAssured.basePath= "/public/v2/users";
		
		
	}
	@Test
	public void createUser() {
		
		RestAssured
		.given()
		   .contentType("apllication/json")
		.body(map)
		     .header("Authorization", "Bearer eb5fe24c9caca9e7a13df435c96d7e2f5210c8f7b1e62da93adb53ec1816d5fd")
		   .when()
		         .post()
		   .then()
		         .statusCode(201)
		   .log().all();
		
	}
}
