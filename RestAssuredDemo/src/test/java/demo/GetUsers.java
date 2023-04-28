package demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetUsers {
	
	@Test
	
	public void getAllUsers() {
		
		RestAssured
		.given()
		.header("Authorization", "Bearer eb5fe24c9caca9e7a13df435c96d7e2f5210c8f7b1e62da93adb53ec1816d5fd")
		.when()
		.get("https://gorest.co.in/public/v2/users/1252858")
		.then()
		.statusCode(200)
		.log().all();
		
		
	}

}
