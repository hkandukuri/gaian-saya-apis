package com.gaian.automation.specs.request;

import io.restassured.RestAssured;
import io.restassured.authentication.OAuthSignature;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.specification.RequestSpecification;

import java.util.Map;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import com.gaian.automation.restassured.defaults.RestAssuredDefaults;
import com.gaian.automation.utility.Util;

import static io.restassured.RestAssured.given;

/**
 * Created by hkandukuri on 09/12/2017.
 */
public class RequestSpecWebAPIAdmin extends RestAssuredDefaults {

	private static ResourceBundle bundle = ResourceBundle.getBundle("saya");
	private Logger log = Logger.getLogger(getClass());
	
	private static String baseUrl_Admin = "";
	private static String sessionID = "";
	
	public static RequestSpecification getWebAPIAdminRequestSpec() {
		baseUrl_Admin = bundle.getString("base.admin.url");
		sessionID = bundle.getString("saya.active.session.token");
		
		RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setAccept(ContentType.JSON);
        requestSpecBuilder.setContentType(ContentType.JSON);
        requestSpecBuilder.setBaseUri(baseUrl_Admin);
        requestSpecBuilder.addCookie(sessionID);
		return requestSpecBuilder.build();
	}
}
