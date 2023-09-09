package org.testing.testscripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.Validation_Response;
import org.testing.teststeps.HTTP_Methods;
import org.testing.utilities.Json_ParsingusingOrgJson;
import org.testing.utilities.Properties_handle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_Case__2 {
	
	@Test
	public void testcase2() throws IOException {
		
		Properties pr = Properties_handle.load_Properties("../Api_framework_Assignment/URI.Properties");
		HTTP_Methods http = new HTTP_Methods(pr);
		Response res = http.get_method("URI_1");
		Validation_Response.Validate_Status_Code(200, res);
		Json_ParsingusingOrgJson.jsonparse(res.asString(), "id");
		
		
	}

}
