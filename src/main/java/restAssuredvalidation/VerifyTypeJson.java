package restAssuredvalidation;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class VerifyTypeJson {
	
	public static void main(String[] args)
	{
		// To check if Response is Json Object i.e Map
		RestAssured.get("https://run.mocky.io/v3/e3c9b1a9-4283-4b55-a4c6-aeba0e15cd29")
		.then()
		.body("", Matchers.instanceOf(Map.class));
		
		// To check whether Response is Json Array
		RestAssured.get("https://run.mocky.io/v3/a9b04cfd-b2ce-4511-a8ab-34d5d634e9fe")
		.then()
		.body("", Matchers.instanceOf(List.class));
		
		// To verify the part of json response is Json array i.e List
		
		RestAssured.get("https://run.mocky.io/v3/e3c9b1a9-4283-4b55-a4c6-aeba0e15cd29")
		.then()
		.body("mob", Matchers.instanceOf(List.class));
	}

}
