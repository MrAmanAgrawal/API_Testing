		package org.testing.responseValidation;

import org.testing.assertions.Assertions;
import org.testing.utilities.Json_ParsingusingJsonPath;
import org.testng.Assert;

import io.restassured.response.Response;

public class Validation_Response {
	
	public static void Validate_Status_Code(int Expectedstatuscode , Response res) {
		
		//Assert.assertEquals(res.statusCode(), Expectedstatuscode , "Status Code is Not Matched"); // this is hard assertion
		//System.out.println("Status Code is Matching");
		
		boolean response =  Assertions.assert1(Expectedstatuscode, res);
		Assert.assertTrue(response);
	}
	
	
	

	
	public static void Validate_Response_Data(String Expecteddata , Response res , String Jsonpath) {
		
		String Actual_value = Json_ParsingusingJsonPath.jsonparse(res, Jsonpath);
		boolean response =  Assertions.assert1(Expecteddata, Actual_value);
		Assert.assertTrue(response);
		
	}
}
