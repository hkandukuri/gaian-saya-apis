/**
 * 
 */
package com.gaian.automation.specs.response;

import com.gaian.automation.restassured.defaults.RestAssuredDefaults;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

/**
 * @author hkandukuri
 *
 */
public class ResponseSpecDefault extends RestAssuredDefaults {

	
	
	public static ResponseSpecification getDefaultResponseSpec(int statusCode) {
		return new 
				ResponseSpecBuilder().
				expectStatusCode(statusCode).
				expectContentType(ContentType.JSON).build();
	}
}
