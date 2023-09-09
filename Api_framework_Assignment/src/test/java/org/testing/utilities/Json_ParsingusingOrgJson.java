package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class Json_ParsingusingOrgJson {
	
	public static String jsonparse(String request_body , String keyname) {
		
		if (request_body.startsWith("[")) {
		
		JSONArray array = new JSONArray(request_body);
		int L = array.length();
		for (int i  = 0; i<L; i = i+1) {
			
			JSONObject ob = array.getJSONObject(i);
			System.out.println(ob.get(keyname));
		}
		return null;
		}
		else if (request_body.startsWith("{")) {
			
			JSONObject j = new JSONObject(request_body);
			String responseID =  j.getString(keyname);
			return responseID;
			
		}
		return null;
			
	}

}
