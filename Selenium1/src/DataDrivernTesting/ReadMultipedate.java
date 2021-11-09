package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadMultipedate {

	public static void main(String[] args) throws Throwable {
		String filePath="./Resources/prop.properties";
		FileInputStream file = new FileInputStream(filePath);
		Properties property = new Properties();
		property.load(file);
		Set<Object> keyset = property.keySet();
		for(Object key:keyset)
		{
			System.out.println(key);
			System.out.println(property.get(key));
		}

	}

}
