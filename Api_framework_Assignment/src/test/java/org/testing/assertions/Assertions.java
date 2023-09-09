package org.testing.assertions;

import io.restassured.response.Response;

public class Assertions {  // This is the soft assertions
	
	public static Boolean assert1(int Exceptedstatuscode , Response res) {
		
		if (Exceptedstatuscode == res.statusCode()) {
			
			System.out.println("Status Code is Matching");
			return true;
		}
		else {
			System.out.println("Status Code is Not Matching");
			return false;
		}
		
	}
	

	
	
	public static Boolean assert1(String Exceptedstatuscode , String Actual_value) {
		
		if (Exceptedstatuscode.equals(Actual_value)) {
			
			System.out.println("Data is Matching");
			return true;
		}
		else {
			System.out.println("Data is Not Matching");
			return false;
		}
		
	}
}
