package com.gaian.automation.restassured.defaults;

import io.restassured.RestAssured;
import io.restassured.config.MatcherConfig;
import io.restassured.filter.log.LogDetail;

/**
 * Created by hkandukuri on 09/12/2017.
 */
public class RestAssuredDefaults {

	public RestAssuredDefaults() {

		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(LogDetail.ALL);
		
		RestAssured.urlEncodingEnabled = false;
		
		final MatcherConfig matcherConfig = RestAssured.config().getMatcherConfig()
				.errorDescriptionType(MatcherConfig.ErrorDescriptionType.HAMCREST);
		RestAssured.config = RestAssured.config().matcherConfig(matcherConfig);
		
	}
}
