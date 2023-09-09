package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.responseValidation.Validation_Response;
import org.testing.teststeps.HTTP_Methods;
import org.testing.utilities.Json_ParsingusingOrgJson;
import org.testing.utilities.Json_handle;
import org.testing.utilities.Json_replacement;
import org.testing.utilities.Properties_handle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_Case_1 {
	static String returnidvalue;
	
	@Test
	public void Testcase1() throws IOException {
		
		Properties pr = Properties_handle.load_Properties("../Api_framework_Assignment/URI.Properties");
		String request_body = Json_handle.json_file_handler("../Api_framework_Assignment/src/test/java/org/testing/resource/RequestPayload.json");
		HTTP_Methods http = new HTTP_Methods(pr);
		Random r = new Random();
		Integer idvalue = r.nextInt();
		request_body = Json_replacement.Assigning_variable_value(request_body, "id", idvalue.toString());
		Response res = http.post_method(request_body, "URI_1");
		Validation_Response.Validate_Status_Code(201, res);
		returnidvalue = Json_ParsingusingOrgJson.jsonparse(res.asString(), "id");
			
	}

}
