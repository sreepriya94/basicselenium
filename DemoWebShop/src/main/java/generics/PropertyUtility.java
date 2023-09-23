package generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility extends BaseClass
{
	public String redaingDataFromPropertyFile(String key) 
	{ 
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream("./src/test/resources/datas.properties");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		Properties property = new Properties();
		try 
		{
			property.load(fis);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return property.getProperty(key);
	}
}
