/**
 * 
 */
package com.gaian.automation.webservices;

import org.testng.annotations.DataProvider;

/**
 * @author hkandukuri
 *
 */
public class TestBase {

	@DataProvider(name="dataprovider1")
	public Object[][] data(int x, int y) {
		return new Object[][] {
			{1, 2},
			{3, 4},
			{5, 6},
			{7, 7},
			{4, 4}
			
		};
	}
}
