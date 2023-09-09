package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class Json_handle {
	
	public static String json_file_handler(String Filepath) throws FileNotFoundException {
		File f = new File(Filepath);
		FileInputStream fi = new FileInputStream(f);
		JSONTokener jt = new JSONTokener(fi);
		
		JSONObject jo = new JSONObject(jt);
		return jo.toString();
		
		
		
		
	}

}
