package com.gaian.automation.specs.request;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.gaian.automation.restassured.defaults.RestAssuredDefaults;

/**
 * Created by hkandukuri on 09/12/2017.
 */
public class RequestSpecRestAPI extends RestAssuredDefaults {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("saya");
	private Logger log = Logger.getLogger(getClass());

	private static String baseUrl = "";

	public static RequestSpecification getWebAPIAdminRequestSpec() {
		baseUrl = bundle.getString("base.url.rest");

		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
		requestSpecBuilder.setAccept(ContentType.JSON);
		requestSpecBuilder.setContentType(ContentType.JSON);
		requestSpecBuilder.setBaseUri(baseUrl);
		return requestSpecBuilder.build().log().all();
	}
}
