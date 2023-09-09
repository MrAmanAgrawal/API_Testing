package org.testing.utilities;

import java.util.regex.Pattern;

public class Json_replacement {
	
	public static String Assigning_variable_value(String request_body , String variable_name , String variablevalue) {
		
		request_body = request_body.replaceAll(Pattern.quote("{{"+variable_name+"}}"),variablevalue);
		return request_body;
		
		
	}

}
