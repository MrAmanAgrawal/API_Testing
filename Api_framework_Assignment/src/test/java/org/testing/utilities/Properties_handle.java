package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_handle {
	
	public static Properties load_Properties(String Filepath) throws IOException {
		
		File f  = new File(Filepath);
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		return pr;
		
		
		
	}

}
