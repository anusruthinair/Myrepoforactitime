package acttitime.genericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataUtility {
	
	public String getDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
		
	}

}
