package org.testing.utilities;

import io.restassured.response.Response;

public class Json_ParsingusingJsonPath {
	
	public static String jsonparse(Response res , String Jsonpath) {
		
		return res.jsonPath().get(Jsonpath);
	}

}
