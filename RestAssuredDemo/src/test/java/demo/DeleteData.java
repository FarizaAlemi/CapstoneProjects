package demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteData {
	
	@Test
	public void deleteUser() {
		
		
		RestAssured.baseURI= "https://gorest.co.in/";
	    RestAssured.basePath= "public/v2/users/1252858"	;
	    
	    RestAssured
	    .when()
	    .delete()
	    .then()
	    .statusCode(204);
				
	}

}
