package org.testing.testscripts;


import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.Validation_Response;
import org.testing.teststeps.HTTP_Methods;
import org.testing.utilities.Properties_handle;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_Case_3 {
	
	@Test
	public void testcase3() throws IOException {
		
		Properties pr = Properties_handle.load_Properties("../Api_framework_Assignment/URI.Properties");
		HTTP_Methods http = new HTTP_Methods(pr);
		Response res = http.get_method_particular("URI_1" , Test_Case_1.returnidvalue);
		Validation_Response.Validate_Status_Code(200, res);
	}
	


}
 