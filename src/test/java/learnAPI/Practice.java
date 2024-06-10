package learnAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.List;
import org.testng.annotations.Test;
import Pom.AssociatesPage;

public class Practice extends AssociatesPage {
	
	
	@Test(priority = 1)
	public void addAssociate() {
	GenericClass g=new GenericClass();
	RestAssured.baseURI="https://newpmt.brigosha.com";
    String response=given().header("Authorization",auth()).header("authority","\r\n"
	+ "newpmt.brigosha.com").header("Content-Type","application/json")
  .body(reqBody())
  .when().post("/resource-user/addAssociate")
  .then().log().all().statusCode(201).extract().response().asString();
	}

	
	@Test(priority = 2)
	public void updateAssociate()
	{
		         
		RestAssured.baseURI="https://newpmt.brigosha.com";
		given().header("Authorization",auth()).queryParam("userId",getId()).header("Content-Type","application/json").body(updateRequestBody())
        .when().patch("/resource-user/editProfile")
        .then().log().all().assertThat().statusCode(200);
	}
	
	
	
	
	@Test(priority = 3)
	public void getAssociate()
	{
		RestAssured.baseURI="https://newpmt.brigosha.com";
		given().header("Authorization",auth()).queryParam("search",getUid())
		.get("/resource-user/allUsers")
		.then().log().all().statusCode(200).extract().response().toString();
	}
	
	@Test(priority = 4)
	public void deleteAssociate() {
		RestAssured.baseURI="https://newpmt.brigosha.com";
		given().header("Authorization",auth()).queryParam("userId",getId())
		.when().delete("/resource-user/deleteAssociate")
		.then().log().all().statusCode(200).extract().response().toString();
		
	}
	
/*
	public static void main(String[]args)
	{
		//getUid();
		//getId();
		getupdateBody();
		
		
	}
	*/
	
	
}

