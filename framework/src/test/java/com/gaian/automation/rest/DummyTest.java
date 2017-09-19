package com.gaian.automation.rest;

import org.testng.annotations.*;

import com.gaian.automation.specs.request.RequestSpecWebAPI;
import com.gaian.automation.specs.response.ResponseSpecDefault;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.ResourceBundle;

public class DummyTest {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("saya");
	
	
	
	@Test(dataProvider = "dataprovider1", dataProviderClass = TestBase.class)
	public void testNumbers(int x, int y) {
		System.out.println("in data provider");
		assertEquals(x^2 - y^2, y^2-x^2);
	}
	
	
	@Test (priority=1, description = "testRequest1", groups = {"A"}, testName = "test2")
	public void f1() {
		String requestApi = bundle.getString("testRequest1") ;
		
		given().
			spec(RequestSpecWebAPI.getWebAPIRequestSpec()).
		when().
			post(requestApi).
		then().
			spec(ResponseSpecDefault.getDefaultResponseSpec(200)).
			log().all();
	}
	
	@Test(priority=1, description = "testRequest2", groups = {"B"}, testName = "test1")
	public void f2() {
		String requestApi = bundle.getString("testRequest2") ;
		
		given().
			spec(RequestSpecWebAPI.getWebAPIRequestSpec()).
		when().
			post(requestApi).
		then().	
			spec(ResponseSpecDefault.getDefaultResponseSpec(200)).
			log().all();
	}
	
	@Test(priority=3, description = "testRequest3", groups = {"A", "B"}, testName = "test2")
	public void f3() {
		String requestApi = bundle.getString("testRequest3") ;
		
		given().
			spec(RequestSpecWebAPI.getWebAPIRequestSpec()).
		when().
			post(requestApi).
		then().	
			spec(ResponseSpecDefault.getDefaultResponseSpec(200)).
			log().all();
	}
	
	@Test(priority=2, description = "testRequest4", groups = {"B"}, testName = "test1")
	public void f4() {
		String requestApi = bundle.getString("testRequest4") ;
		
		given().
			spec(RequestSpecWebAPI.getWebAPIRequestSpec()).
		when().
			post(requestApi).
		then().	
			spec(ResponseSpecDefault.getDefaultResponseSpec(200)).
			log().all();
	}
}
